package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Userentity;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    // ✅ Constructor Injection
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public Userentity registerUser(@RequestBody Userentity user) {
        return userService.register(user);
    }

    @GetMapping("/email/{email}")
    public Userentity getByEmail(@PathVariable String email) {
        return userService.findByEmail(email);
    }
}