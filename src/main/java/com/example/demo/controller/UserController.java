package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Userentity;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/add")
    public Userentity addUser(@RequestBody Userentity user) {
        return service.saveUser(user);
    }

    @GetMapping("/getall")
    public List<Userentity> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/get/{id}")
    public Userentity getUserById(@PathVariable Long id) {
        return service.getUserById(id);
    }

    @PutMapping("/update/{id}")
    public Userentity updateUser(@PathVariable Long id,
                                 @RequestBody Userentity user) {
        return service.updateUser(id, user);
    }
}
