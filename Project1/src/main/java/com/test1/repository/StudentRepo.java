package com.test1.repository;

import com.test1.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
