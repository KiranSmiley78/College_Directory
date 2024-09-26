package com.tap.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tap.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

