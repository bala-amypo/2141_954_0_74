package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Student;

public interface StudentService {

    Student saveData(Student student);
    List<Student> getAll();
    Student getById(Long id);
    Student update(Long id, Student student);
}
