package com.niit34.restfullService_demo3.repository;

import com.niit34.restfullService_demo3.domain.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}
