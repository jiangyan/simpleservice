package com.servision.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.servision.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}