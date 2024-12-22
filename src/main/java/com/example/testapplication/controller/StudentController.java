package com.example.testapplication.controller;

import com.example.testapplication.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    public List<Student> getStudents() {
        //TODO: cделать данный метод
        return null;
    }

}
