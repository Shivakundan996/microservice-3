package com.cgi.studentservice.service;

import com.cgi.studentservice.dto.StudentData;
import com.cgi.studentservice.model.College;
import com.cgi.studentservice.model.Student;
import com.cgi.studentservice.repo.StudentRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private RestTemplate restTemplate;

    public Student saveStduent(Student student) {
        return studentRepo.save(student);
    }

    public StudentData getStudentData(Long studentId) {
        StudentData studentData = new StudentData();
        College college = restTemplate.getForObject("http://college-service/college/" + studentId, College.class);

        Student student = studentRepo.findByStudentId(studentId);
        BeanUtils.copyProperties(student,studentData);
        studentData.setCollege(college);
        return studentData;

    }
}
