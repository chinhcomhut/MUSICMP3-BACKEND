package com.codegym.wbdlaptop.service;

import com.codegym.wbdlaptop.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public interface UserService {
    Optional<User> findByUsername(String username);
    User findById(Long id);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    User save(User user);
}