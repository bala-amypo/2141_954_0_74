package com.exmaple.demo.controller;
import java.Util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentServices;
@RestConroller
@RequestMapping("/student")
public class StudController{
    @Autowired
    private Studservices ser;
    @PostMapping("/add")
    public Studentity addStudent(@RequestBody Studentity st){
        return ser.saveData(st);
    }
    @GetMapping("/gettall")
        public Collection<Studentity>getAllStudents(){
            return ser.getAll();
        }
        @GetMapping("/get/{id}")
        public Studentity getStudentById(@PathVariable int id){
            return ser.getById(id);
        }
        @PutMapping("/update/{id}")
        public Studentity updateStudent(
            @PathVariable int id,
            @RequestBody Studentity updateStudent){
                return ser.update(id,st);
            }
    }