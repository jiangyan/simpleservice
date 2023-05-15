package com.servision.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.servision.model.InternalUser;

@Repository
public interface InternalUserRepository extends JpaRepository<InternalUser, Long> {
}