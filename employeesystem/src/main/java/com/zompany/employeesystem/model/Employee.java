package com.zompany.employeesystem.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generated ID, if applicable
    @Column(name = "empid")
    private int empid;

    @Column(name = "SSN")  // Assuming SSN is your primary key
    private String SSN;

    @Column(name = "Fname")
    private String firstName;

    @Column(name = "Lname")
    private String lastName;

    @Column(name = "email")
    private String email;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "Hiredate")
    private Date hireDate;

    @Column(name = "Salary")
    private double salary;

    @Column(name = "city")
    private String city;

    @Column(name = "gender")
    private String gender;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
