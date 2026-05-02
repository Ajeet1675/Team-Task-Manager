package com.ajeet.taskmanager.backend.repository;

import com.ajeet.taskmanager.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}