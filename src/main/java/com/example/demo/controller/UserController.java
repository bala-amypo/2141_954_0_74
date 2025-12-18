package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return service.saveData(student);
    }

    @GetMapping("/getall")
    public List<Student> getAllStudents() {
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable Long id,
                                 @RequestBody Student student) {
        return service.update(id, student);
    }
}
