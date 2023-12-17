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

    /*@GetMapping("findByName/{firstName}")
    public Student findStudentByName(@PathVariable("firstName") String firstName){
        return studentservice.findStudentByName(firstName);
    }*/
@DeleteMapping("deleteById/{id}")
    public String deleteById(@PathVariable("id") int id){
    studentservice.deleteById(id);
    return "record delete for ID:"+id;
}

@PutMapping ("/updateById/{id}")
    public Student updateStudent(@PathVariable("id") int id ,@RequestBody Student student){
    return studentservice.updateStudent(id,student);
}
}
