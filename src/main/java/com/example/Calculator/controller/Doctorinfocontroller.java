package com.example.Calculator.controller;

import com.example.Calculator.model.Doctorinfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Doctorinfocontroller {

    @RequestMapping("/doctor_name")
    public String getdoctorname(){
        Doctorinfo doctorinfo=new Doctorinfo("Neema",120,"AB",9);
        return doctorinfo.getName();
    }
    @RequestMapping("/doctor_id")
    public int getdoctorid(){
        Doctorinfo doctorinfo=new Doctorinfo("Rakesh",121,"AC",8);
        return doctorinfo.getId();
    }
    @RequestMapping("/doctor_section")
    public String getdoctorsection(){
        Doctorinfo doctorinfo=new Doctorinfo("Raju",122,"AA",9);
        return doctorinfo.getSection();
    }
    @RequestMapping("/doctor_info")
    public Doctorinfo getdoctorinfo(){
        Doctorinfo doctorinfo=new Doctorinfo("Rajesh",123,"BA",8);
        return doctorinfo;
    }


}
