package com.hospital.services;

import com.hospital.model.Doctor;
import com.hospital.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    public DoctorRepository doctorRepository;

    public void addDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }


    public void saveDoctors(List<Doctor> doctorList) {
        doctorRepository.saveAll(doctorList);
    }

    public List<Doctor> listAlldoctors() {
     return    doctorRepository.findAll();
    }

    public void deletedetails(int id) {
        doctorRepository.deleteById(id);
    }


//    public void updateDoctor(Doctor doctor) {
//        Doctor  updateDoctor = studentRepository.getById(Doctor.getid());
//        updateDoctor.setfname(doctor.getfname());
//        updateDoctor.setfname(doctor.getlname());
//        updateDoctor.setfname(doctor.getaddress());
//
//        doctorRepository.save(doctor);
//
//    }
}
