package com.cgi.collegeservice.service;

import com.cgi.collegeservice.model.College;
import com.cgi.collegeservice.repo.CollegeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {


    @Autowired
    private CollegeRepo collegeRepo;

    public College saveCollege(College college) {
        return collegeRepo.save(college);
    }

    public College getCollegeById(Long collegeId){
        return collegeRepo.findByCollegeId(collegeId);
    }

    public List<College> getAllCollege(){
        return collegeRepo.findAll();
    }


}
