package com.ajeet.taskmanager.backend.repository;

import com.ajeet.taskmanager.backend.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}