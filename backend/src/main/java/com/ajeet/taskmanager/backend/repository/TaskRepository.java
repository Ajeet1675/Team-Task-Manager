package com.ajeet.taskmanager.backend.repository;

import com.ajeet.taskmanager.backend.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}