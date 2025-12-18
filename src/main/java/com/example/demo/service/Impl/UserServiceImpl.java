package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Userentity;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo repo;

    @Override
    public Userentity saveUser(Userentity user) {
        return repo.save(user);
    }

    @Override
    public List<Userentity> getAllUsers() {
        return repo.findAll();
    }

    @Override
    public Userentity getUserById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Userentity updateUser(Long id, Userentity user) {
        user.setId(id);
        return repo.save(user);
    }
}
