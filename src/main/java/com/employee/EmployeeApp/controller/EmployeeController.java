package com.employee.EmployeeApp.controller;

import com.employee.EmployeeApp.entity.Employee;
import com.employee.EmployeeApp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee findAnEmployees(@PathVariable int id){
        return employeeService.findAnEmployees(id);
    }

        @PostMapping("/employee")
    public void createAnEmployee(@RequestBody Employee employee){
        employeeService.createAnEmployee(employee);
    }
    @PutMapping("/employee/{id}")
    public void updateAnEmployee(@PathVariable int id, @RequestBody Employee employee){
        employeeService.updateAnEmployee(id, employee);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteAnEmployee(@PathVariable int id){
        employeeService.deleteAnEmployee(id);
    }



}
