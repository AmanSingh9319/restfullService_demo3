/*
 *Author Name: Aman Singh
 *Date:18-11-2022
 *Created With: Intellij IDEA Community Edition
 */
package com.niit34.restfullService_demo3.service;

import com.niit34.restfullService_demo3.domain.Student;
import com.niit34.restfullService_demo3.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements IStudentService {
    private StudentRepository studentRepository;

    @Autowired
       public StudentServiceImpl(StudentRepository studentRepository){
       this.studentRepository=studentRepository;
 }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public boolean deleteStudent(int sid) {
        studentRepository.deleteById(sid);
        return false;
    }

    @Override
    public List<Student> fetchAllStudent() {
        return (List<Student>) studentRepository.findAll();
    }
}
