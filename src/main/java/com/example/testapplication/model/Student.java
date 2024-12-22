package com.example.testapplication.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private LocalDate dateOfBirth;
    private String email;
}
