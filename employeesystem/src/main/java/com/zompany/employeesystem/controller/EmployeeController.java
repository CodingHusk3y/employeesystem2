package com.zompany.employeesystem.controller;

import com.zompany.employeesystem.model.Employee;
import com.zompany.employeesystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/add")
    public ResponseEntity<Employee> add(@RequestBody Employee employee) {
        Employee newEmployee = employeeService.saveEmployee(employee);
        return ResponseEntity.ok(newEmployee);
    }
}
