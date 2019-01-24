package com.test1.services;

import com.test1.model.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudent();
    public Student getStudentByRoll(int roll);
    public void saveOrUpdate(Student student);
    public void delete(int roll);
}
