package com.lumumba.azure.service;

import com.lumumba.azure.entity.Student;
import com.lumumba.azure.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students;
    }

    @Override
    public Optional<Student> getStudent(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student updateStudent(Student student, Long id) {
        Optional<Student> studentToUpdate = studentRepository.findById(id);

        Student st = new Student();
        st.setFullName(student.getFullName());
        st.setCourse(student.getCourse());
        st.setLevel(student.getLevel());
        studentRepository.save(st);

        return st;
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
