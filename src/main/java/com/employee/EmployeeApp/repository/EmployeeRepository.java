package com.employee.EmployeeApp.repository;

import com.employee.EmployeeApp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    /*
        For CRUD Operations for DB
        like:
        getEmployees()
        getEmployee(id)
        updateEmployee(Employee employee)
        deleteEmployee(id)
     */
}
