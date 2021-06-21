package com.example.Calculator.controller;

import com.example.Calculator.model.Studentcrud;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Studentcontroller {
    List<Studentcrud> studentcrudList=new ArrayList<>();
 //crud operation
 //create
    @RequestMapping("/create_std")
    public String getstgname(){
        Studentcrud studentcrud=new Studentcrud("Harpal",211,2011,"ICA");
        studentcrudList.add(studentcrud);
        return studentcrud.getName();

    }
    //read
    @RequestMapping("/read_std")
    public List<Studentcrud> getstdread(){
        return studentcrudList;

    }
    //update
    @RequestMapping("/update_std")
    public String updatestd(){
        studentcrudList.get(0).setName("Chetan");
        return "updated";
    }
    //delet
    @RequestMapping("/delet_std")
    public String deletstd(){
        studentcrudList.remove(2);
        return "deleted";
    }


}
