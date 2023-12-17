package com.jjm.studentapp.service;

import com.jjm.studentapp.entity.Student;
import com.jjm.studentapp.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;
    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> showAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        log.info("deleting student with id{} with datele layer",id);
         studentRepository.deleteById(id);
    }

    @Override
    public Student updateStudent(int id, Student student) {
        Student student1=studentRepository.findById(id).get();
        log.info("updating student with id{} with update layer",student.getId());
        student1.setLastName(student.getFirstName());
        student1.setFirstName(student.getLastName());
        return studentRepository.save(student1);
    }

   /* @Override
    public Student findStudentByName(String firstName) {
        return studentRepository.findStudentByName(firstName);
    }*/

}
