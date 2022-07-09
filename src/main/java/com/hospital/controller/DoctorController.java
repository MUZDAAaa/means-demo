package com.hospital.controller;

import com.hospital.model.Doctor;
import com.hospital.services.DoctorService;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    public DoctorService doctorService;


    @GetMapping("/display")
    public String showMessage(){
        return"Welcome";
    }

    @PostMapping("/add")
    public String saveDetails(@RequestBody Doctor doctor){
        doctorService.addDoctor(doctor);
        return "saved";
    }
    //save many
    @PostMapping("/adds")
   public String addDoctors(@RequestBody List<Doctor> doctorList){
       doctorService.saveDoctors(doctorList);
        return "the doctors has been success ";
  }
  //view
@GetMapping("/view")
    public List<Doctor> getDoctors(){
        return doctorService.listAlldoctors();
   }

   @DeleteMapping("/delete/{id}")
   public String  deleteDoctor(@PathVariable int id){
        doctorService.deletedetails(id);
        return "deleted";
   }
//   @PutMapping("/update")
//   public String updateDetail(@RequestBody Doctor doctor){
//        Doctor doctor1 = new Doctor();
//        doctorService.updateDoctor(doctor);
//        return"updated";
//
//   }










































//    // to show welcome mesg
//    @GetMapping("/")
//    public String showmsg(){
//        return "Welcome to my system";
//    }
//
//    // save
//    @PostMapping("/add")
//    public String addDoctor(Doctor doctor){
//        doctorService.saveDoctor(doctor);
//        return "You have been successfull registered";
//    }
//
//    // save many
//    @PostMapping("/adds")
//    public String addDoctors(@RequestBody List<Doctor> doctorList){
//        doctorService.saveDoctors(doctorList);
//        return "the doctors has been success ";
//    }
//
//    // view
//    public List<Doctor> getDoctors(){
//        return doctorService.listAlldoctors();
//    }
//    //delete
//    @DeleteMapping("/delete/{id}")
//    public String  deleteDoctor(@PathVariable int id){
//        doctorService.deleteDoctoradded(id);
//        return "The member was deleted";
//    }
//
//    //update
//    @PutMapping("/muzda")
//    public String updateDct(Doctor  doctor){
//        Doctor doctor1 = new Doctor();
//        doctorService.updtDoctor(doctor);
//        return "The all doctor updated";
//
//
//    }
}
