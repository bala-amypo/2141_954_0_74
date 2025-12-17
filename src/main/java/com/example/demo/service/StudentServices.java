package com.example.demo.service;

import java.util.Collection;

import com.example.demo.entity.Student;

public interface StudentService {

    Student saveData(Student student);

    Collection<Student> getAll();

    Student getById(Long id);

    Student update(Long id, Student student);
}
