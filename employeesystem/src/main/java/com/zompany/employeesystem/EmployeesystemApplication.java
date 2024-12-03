package com.zompany.employeesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.zompany.employeesystem")  // Add the package for your controllers
public class EmployeesystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeesystemApplication.class, args);
	}
}

