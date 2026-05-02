package com.ajeet.taskmanager.backend.controller;

import com.ajeet.taskmanager.backend.entity.Task;
import com.ajeet.taskmanager.backend.repository.TaskRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskRepository repo;

    public TaskController(TaskRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return repo.save(task);
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return repo.findAll();
    }

    @PatchMapping("/{id}")
    public Task updateStatus(@PathVariable Long id, @RequestBody Task t) {
        Task existing = repo.findById(id).orElseThrow();
        existing.setStatus(t.getStatus());
        return repo.save(existing);
    }
}