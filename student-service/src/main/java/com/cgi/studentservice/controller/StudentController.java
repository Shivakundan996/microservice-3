package com.cgi.studentservice.controller;

import com.cgi.studentservice.dto.StudentData;
import com.cgi.studentservice.model.Student;
import com.cgi.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/")
    public Student saveStudentData(@RequestBody Student student){
        return studentService.saveStduent(student);

    }

    @GetMapping("/{id}")
    public StudentData getStduent(@PathVariable("id")Long studentId){
        return studentService.getStudentData(studentId);

    }

}
