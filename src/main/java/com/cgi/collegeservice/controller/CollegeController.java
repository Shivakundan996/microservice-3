package com.cgi.collegeservice.controller;

import com.cgi.collegeservice.model.College;
import com.cgi.collegeservice.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/college")
public class CollegeController {

    @Autowired
    private CollegeService collegeService;


    @PostMapping("/")
    public College saveCollege(@RequestBody College college){
        return collegeService.saveCollege(college);
    }

    @GetMapping("/{id}")
    public College getCollegeById(@PathVariable("id") Long id){
        return collegeService.getCollegeById(id);
    }

    @GetMapping("/all")
    public List<College> getAllColleges(){
        return collegeService.getAllCollege();
    }




}
