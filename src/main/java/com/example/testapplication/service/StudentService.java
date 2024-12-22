package com.example.testapplication.service;

import com.example.testapplication.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        //TODO: cделать данный метод
        return List.of(
                Student.builder()
                        .firstName("Alexey")
                        .lastName("Kozyavkin")
                        .age(14)
                        .email("losharik14@gmail.com")
                        .dateOfBirth(LocalDate.parse("10.10.2010")).build()
        );
    }
    
}
