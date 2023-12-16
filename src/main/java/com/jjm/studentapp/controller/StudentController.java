package com.jjm.studentapp.controller;

import com.jjm.studentapp.entity.Student;

import com.jjm.studentapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentService studentservice;
    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        studentservice.addStudent(student);
        return "student added successfully";
    }
@GetMapping("/showAllStudents")
    public List<Student> showAllStudent()
    {
        return studentservice.showAllStudent();
    }

    @GetMapping("/getstudentById/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") int id){
        return studentservice.getStudentById(id);
    }

}
