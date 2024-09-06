package com.lumumba.azure.service;

import com.lumumba.azure.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    // Create student
    Student addStudent(Student student);

    // Get all students
    List<Student> getAllStudents();

    // Get one student by his fullname
    Optional<Student> getStudent(Long id);

    // Update student
    Student updateStudent(Student student, Long id);

    // Delete student
    void deleteStudent(Long id);


}
