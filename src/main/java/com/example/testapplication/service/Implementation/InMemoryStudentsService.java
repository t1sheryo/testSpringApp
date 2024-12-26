package com.example.testapplication.service.Implementation;

import com.example.testapplication.model.Student;
import com.example.testapplication.repository.InMemoryStudentDAO;
import com.example.testapplication.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentsService implements StudentService {

    private final InMemoryStudentDAO repository;
    @Override
    public List<Student> getStudents() {
        return repository.getStudents();
    }

    @Override
    public Student findStudentByEmail(String email) {
        return repository.findStudentByEmail(email);
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
