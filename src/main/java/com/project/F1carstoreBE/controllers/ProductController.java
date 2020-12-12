package com.project.F1carstoreBE.controllers;

import com.project.F1carstoreBE.entities.Product;
import com.project.F1carstoreBE.repositories.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    private final ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return (List<Product>) productRepository.findAll();
    }
    @PostMapping("/users")
    void addProduct(@RequestBody Product product) {
        productRepository.save(product);
    }
}
