package com.cgi.collegeservice.repo;

import com.cgi.collegeservice.model.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepo extends JpaRepository<College,Long> {

    College findByCollegeId(Long collegeId);
}
