package com.hospital.controller;

import com.hospital.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired

    public StudentService studentService;

    @GetMapping
    public String ShowDetail(){
        return "yuo are student of this course";
    }
}
