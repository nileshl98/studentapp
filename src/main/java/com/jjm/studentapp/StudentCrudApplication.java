package com.jjm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class StudentappApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(StudentappApplication.class, args);
    }

}
