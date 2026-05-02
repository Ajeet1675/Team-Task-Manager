package com.ajeet.taskmanager.backend.controller;

import com.ajeet.taskmanager.backend.entity.User;
import com.ajeet.taskmanager.backend.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository repo;

    public UserController(UserRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return repo.save(user);
    }
}