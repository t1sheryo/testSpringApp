package com.example.testapplication.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Data
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    @Transient
    private int age;
    @Column(unique = true)
    private String email;

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}
