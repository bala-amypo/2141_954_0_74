package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Userentity;

public interface UserService {

    Userentity saveUser(Userentity user);
    List<Userentity> getAllUsers();
    Userentity getUserById(Long id);
    Userentity updateUser(Long id, Userentity user);
}
