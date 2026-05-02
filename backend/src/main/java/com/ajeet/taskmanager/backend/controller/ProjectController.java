package com.ajeet.taskmanager.backend.controller;

import com.ajeet.taskmanager.backend.entity.Project;
import com.ajeet.taskmanager.backend.repository.ProjectRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    private final ProjectRepository repo;

    public ProjectController(ProjectRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Project createProject(@RequestBody Project project) {
        return repo.save(project);
    }

    @GetMapping
    public List<Project> getAllProjects() {
        return repo.findAll();
    }
}