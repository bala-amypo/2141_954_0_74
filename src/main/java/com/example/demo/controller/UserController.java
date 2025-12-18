package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return service.saveUser(user);
    }

    @GetMapping("/getall")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/get/{id}")
    public User getUserById(@PathVariable Long id) {
        return service.getUserById(id);
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable Long id,
                           @RequestBody User user) {
        return service.updateUser(id, user);
    }
}
