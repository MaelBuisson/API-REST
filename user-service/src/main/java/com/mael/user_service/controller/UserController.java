package com.mael.user_service.controller;

import com.mael.user_service.model.User;
import com.mael.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users") 
public class UserController {

    @Autowired
    private UserService userService;

    // GET http://localhost:8080/api/users
    @GetMapping
    public List<User> getAll() {
        return userService.getAllUsers();
    }

    // POST http://localhost:8080/api/users
    @PostMapping
    public User create(@RequestBody User user) {
        return userService.createUser(user);
    }

    // GET http://localhost:8080/api/users/1
    @GetMapping("/{id}")
    public User getOne(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}