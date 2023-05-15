package com.servision.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servision.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
