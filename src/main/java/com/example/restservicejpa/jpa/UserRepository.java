package com.example.restservicejpa.jpa;

import com.example.restservicejpa.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Cheranev N.
 * created on 28.07.2020.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findAll();
}
