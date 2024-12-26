package com.example.testapplication.repository;

import com.example.testapplication.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDAO {

    private final List<Student> studentList = new ArrayList<>();

    public List<Student> getStudents() {
        return studentList;
    }
    public Student findStudentByEmail(String email) {
        return studentList.stream().filter(
                student -> student.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    public Student saveStudent(Student student) {
        studentList.add(student);
        return student;
    }

    public Student updateStudent(Student student) {
        var index = IntStream.range(0, studentList.size())
                .filter(ind -> studentList.get(ind).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);

        if(index != 1){
            studentList.set(index, student);
            return student;
        }
        return null;
    }

    public void deleteStudent(String email) {
        var student = findStudentByEmail(email);
        if(student != null) {
            studentList.remove(student);
        }
    }
}
