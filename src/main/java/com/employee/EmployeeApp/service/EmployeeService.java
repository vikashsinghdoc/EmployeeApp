package com.employee.EmployeeApp.service;

import com.employee.EmployeeApp.entity.Employee;
import com.employee.EmployeeApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    List<Employee> employeeList= new ArrayList<>(Arrays.asList(
            new Employee(1,"First Emp", "London"),
            new Employee(2,"Second Emp", "Paris")
    ));

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee findAnEmployees(int id) {
        return employeeRepository.findById(id).orElseThrow(()->
            new RuntimeException("Employee Not Available in DB")
        );
    }

    public void createAnEmployee(Employee employee) {
//        employeeList.add(employee);
        employeeRepository.save(employee);
    }

    public void updateAnEmployee(int id, Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteAnEmployee(int id) {
        employeeRepository.delete(employeeRepository.getById(id));
    }
}
