package com.blackCodes.Student.System.service;

import com.blackCodes.Student.System.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
