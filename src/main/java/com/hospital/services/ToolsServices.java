package com.hospital.services;

import com.hospital.model.Tools;
import com.hospital.repository.DoctorRepository;
import com.hospital.repository.ToolsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToolsServices  {
    @Autowired
    public ToolsRepository toolsRepository;

    public void addTools(Tools tools) {
        toolsRepository.save(tools);



    }

    public List<Tools> muzda() {
        return toolsRepository.findAll();
    }
}
