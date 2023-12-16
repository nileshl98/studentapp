package com.jjm.studentapp.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Student")
@Data
public class Student {
    private int id;
    private String Fname;
    private String lname;
}
