package com.example.Calculator.controller;

import com.example.Calculator.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    @RequestMapping("/name")
    public String get_emp_name(){
        Employee employee=new Employee("Shahil",22,"cs");
        return employee.getName();
    }
    @RequestMapping("/get_emp_info")
    public Employee getemployeeinfo(){
        Employee employee=new Employee("RAHUL",25,"H.M");
        return employee;
    }
    @RequestMapping("/get_emp_list")
    public List<Employee> getemployeelist(){
        Employee employee=new Employee("ravi",26,"finance");
        Employee employee1=new Employee("Kailash",28,"H.M");
        Employee employee2=new Employee("Jitendra",29,"prodoction");
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        return employeeList;



    }
    @RequestMapping("/add_emp")
    public String addemployeelist(){
        List<Employee> employeeList=new ArrayList<>();
        Employee employee=new Employee("Vipin ",30,"Medical");
        employeeList.add(employee);
        return employee.getName() +  "  added successfully";
    }


}
