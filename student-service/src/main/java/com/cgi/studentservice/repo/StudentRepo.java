package com.cgi.studentservice.repo;

import com.cgi.studentservice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {

    Student findByStudentId(Long studentId);
}
