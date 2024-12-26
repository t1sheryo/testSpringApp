package com.example.testapplication.service;

import com.example.testapplication.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

public interface StudentService {

    List<Student> getStudents();
    Student findStudentByEmail(String email);
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(String email);
}
