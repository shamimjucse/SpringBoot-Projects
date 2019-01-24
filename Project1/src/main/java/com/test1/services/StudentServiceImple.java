package com.test1.services;

import com.test1.model.Student;
import com.test1.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImple implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public List<Student> getAllStudent() {
        return (List<Student>) studentRepo.findAll();
    }

    @Override
    public Student getStudentByRoll(Integer roll) {
        return studentRepo.findById( roll ).get();
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentRepo.save(student);
    }

    @Override
    public void delete(Integer roll) {
        studentRepo.deleteById(roll);
    }
}
