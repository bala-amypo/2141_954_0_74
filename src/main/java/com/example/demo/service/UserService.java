package com.example.demo.service;

import com.example.demo.entity.Userentity;

public interface UserService {

    Userentity register(Userentity user);

    Userentity findByEmail(String email);
}