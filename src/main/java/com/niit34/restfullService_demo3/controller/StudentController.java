/*
 *Author Name: Aman Singh
 *Date:18-11-2022
 *Created With: Intellij IDEA Community Edition
 */
package com.niit34.restfullService_demo3.controller;

import com.niit34.restfullService_demo3.domain.Student;
import com.niit34.restfullService_demo3.service.IStudentService;
import com.niit34.restfullService_demo3.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/avi/v1")
public class StudentController {
 private StudentServiceImpl studentServiceimpl;
    @Autowired
    public StudentController(StudentServiceImpl studentServiceimpl) {
        this.studentServiceimpl = studentServiceimpl;
    }
    @PostMapping("/insertstudent")
    public ResponseEntity<?> saveFunction(@RequestBody Student student){
        return new ResponseEntity<>(studentServiceimpl.saveStudent(student), HttpStatus.CREATED);
    }
    @GetMapping("/fetchallstudents")
    public ResponseEntity<?> fetchFunction(){
        return new ResponseEntity<>(studentServiceimpl.fetchAllStudent(), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{sid}")
    public ResponseEntity<?> saveFuncation(@PathVariable int sid)
    {
        return new ResponseEntity<>(studentServiceimpl.deleteStudent(sid), HttpStatus.OK);
    }
}