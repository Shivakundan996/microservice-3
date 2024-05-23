package com.cgi.studentservice.dto;

import com.cgi.studentservice.model.College;
import com.cgi.studentservice.model.Student;
import org.springframework.http.HttpStatusCode;

public class StudentData {

    private Student student;
    private College college;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }
}
