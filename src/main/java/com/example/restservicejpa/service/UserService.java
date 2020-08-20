package com.example.restservicejpa.service;

import com.example.restservicejpa.domain.User;

import java.util.List;

/**
 * @author Cheranev N.
 * created on 28.07.2020.
 */
public interface UserService {
    List<User> findAll();

    User create(User user);

    User update(Long id, User user);

    User findById(Long id);

    void deleteById(Long id);
}
