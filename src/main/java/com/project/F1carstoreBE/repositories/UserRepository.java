package com.project.F1carstoreBE.repositories;

import com.project.F1carstoreBE.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
