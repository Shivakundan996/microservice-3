package com.cgi.studentservice.controller;

import com.cgi.studentservice.dto.StudentData;
import com.cgi.studentservice.model.Student;
import com.cgi.studentservice.service.StudentService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    Environment environment;


    @PostMapping("/")
    public Student saveStudentData(@RequestBody Student student){
        return studentService.saveStduent(student);

    }

    @GetMapping("/{id}")
    public StudentData getStduent(@PathVariable("id")Long studentId){
        System.out.println("port number");
        System.out.println(environment.getProperty("local.server.port")); //to print port number on console

        return studentService.getStudentData(studentId);

    }

}
