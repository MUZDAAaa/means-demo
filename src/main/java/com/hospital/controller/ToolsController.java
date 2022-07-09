package com.hospital.controller;

import com.hospital.model.Doctor;
import com.hospital.model.Tools;
import com.hospital.services.DoctorService;
import com.hospital.services.ToolsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToolsController {
   @Autowired
    public ToolsServices toolsrService;


    @PostMapping("/do")
    public String saveDetails(@RequestBody Tools tools){
        toolsrService.addTools(tools);
        return "saved";
    }

    @GetMapping("/view")
    public List<Tools> getDoctors(){
        return toolsrService.muzda();
    }


}
