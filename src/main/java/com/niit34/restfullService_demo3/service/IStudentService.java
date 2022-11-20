package com.niit34.restfullService_demo3.service;

import com.niit34.restfullService_demo3.domain.Student;

import java.util.List;

public interface IStudentService {
    Student saveStudent(Student student);
    boolean deleteStudent(int sid);
    List<Student>fetchAllStudent();
}
