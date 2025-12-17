package com.example.demo.service.Impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo repo;

    @Override
    public Student saveData(Student student) {
        return repo.save(student);
    }

    @Override
    public Collection<Student> getAll() {
        return repo.findAll();
    }

    @Override
    public Student getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Student update(Long id, Student student) {
        student.setId(id);
        return repo.save(student);
    }
}
