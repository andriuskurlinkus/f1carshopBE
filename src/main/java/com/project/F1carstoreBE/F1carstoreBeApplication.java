package com.project.F1carstoreBE;

import com.project.F1carstoreBE.entities.Product;
import com.project.F1carstoreBE.entities.User;
import com.project.F1carstoreBE.repositories.ProductRepository;
import com.project.F1carstoreBE.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class F1carstoreBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(F1carstoreBeApplication.class, args);
    }

    @Bean
    CommandLineRunner init(ProductRepository productRepository, UserRepository userRepository) {
        return args -> {
            Stream.of("Mercedes", "RedBull", "Ferrari").forEach(name -> {
                Product product = new Product(name, name.toLowerCase() + " model", 1, 25.0);
                productRepository.save(product);
            });
            Stream.of("admin", "buyer").forEach(name -> {
                User user = new User(name, "password", name.toUpperCase());
                userRepository.save(user);
            });
            productRepository.findAll().forEach(System.out::println);
            userRepository.findAll().forEach(System.out::println);
        };
    }
}
