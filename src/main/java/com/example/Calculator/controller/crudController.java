package com.example.Calculator.controller;

import com.example.Calculator.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
public class crudController {
    //crud operations
    List<Employee> employeeList=new ArrayList<>();



    //cred
    @RequestMapping("/addcrud")
    public String add(){
        Employee employee=new Employee("Rohan ",32,"Hospility");
        employeeList.add(employee);
        return employee.getName() + "add name from crud";



    }
    //read
    @RequestMapping("/readcrud")
    public List<Employee> read(){
        return employeeList;
    }


    //update
    @RequestMapping("/uapdatecrud")
    public String update()
    {
        employeeList.get(0).setName("sohan");
        return "name updated";

    }
    //delet
    @RequestMapping("/deletcrud")
    public String delet(){
        employeeList.remove(0);
        return "name deleted";
    }

}
