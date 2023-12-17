package com.jjm.studentapp.repository;

import com.jjm.studentapp.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,Integer> {
    //Student findStudentByName(String firstName);
}
