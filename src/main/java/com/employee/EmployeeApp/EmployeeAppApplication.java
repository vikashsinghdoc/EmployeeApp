package com.employee.EmployeeApp;

import com.employee.EmployeeApp.entity.Address;
import com.employee.EmployeeApp.entity.Employee;
import com.employee.EmployeeApp.entity.Project;
import com.employee.EmployeeApp.entity.Spouse;
import com.employee.EmployeeApp.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeAppApplication.class, args);
	}
}
