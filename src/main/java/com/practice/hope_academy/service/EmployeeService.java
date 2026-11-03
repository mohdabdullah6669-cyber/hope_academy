package com.practice.hope_academy.service;


import com.practice.hope_academy.entity.Employee;
import com.practice.hope_academy.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository er;

    public Employee save(Employee e) {

        //  Employee zia = new Employee("23456", "zia" , "java" , 100000.24, "9876543", "456789");
        // Employee anas = new Employee("12345" , "anas" , "java" , 100000.23, "970017865" , "908723");
        return er.save(e);


    }

    public List<Employee> getAllData() {
        return er.findAll();

    }

    public void update(Employee employee) {
        er.save(employee);

    }

    public void delete(Employee employee) {
        er.delete(employee);
    }

}
