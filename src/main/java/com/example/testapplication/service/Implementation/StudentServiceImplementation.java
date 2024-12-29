package com.example.testapplication.service.Implementation;

import com.example.testapplication.model.Student;
import com.example.testapplication.repository.StudentRepository;
import com.example.testapplication.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class StudentServiceImplementation implements StudentService {
    private final StudentRepository repository;
    @Override
    public List<Student> getStudents() {
        return repository.findAll();
    }

    @Override
    public Student findStudentByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    @Transactional
    public void deleteStudent(String email) {
        repository.deleteByEmail(email);
    }
}
