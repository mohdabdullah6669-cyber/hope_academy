package com.practice.hope_academy.controller;


import com.practice.hope_academy.entity.Employee;
import com.practice.hope_academy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService es;

    @PostMapping("/emp/save")
    @ResponseStatus(HttpStatus.CREATED)

    public Employee save(@RequestBody Employee e) {

        return es.save(e);
    }

    @GetMapping("/getEmpList")
    public List<Employee> getData() {

        return es.getAllData();
    }

    @PutMapping("/emp/update/{empName}")
    public void update(@PathVariable String empName, @RequestBody Employee emp) {
        //   emp.setEmpId(emp);
        es.update(emp);
    }

    @DeleteMapping("/deleteEmp")
    public void deleteEmp(@RequestBody Employee emp) {
        es.delete(emp);

    }


}
