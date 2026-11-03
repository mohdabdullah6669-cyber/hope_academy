package com.practice.hope_academy.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "")
@Data
@ToString
@NoArgsConstructor
public class Employee {

    @Id
    @Column(name = "employeeId")
    private String empId;

    @Column
    private String empName;

    @Column
    private String empDesignation;

    @Column
    private double empSalary;

    @Column
    private String empNumber;

    @Column(name = "departmentId")
    private String deptId;

    public Employee(String empId, String empName, String empDesignation, double empSalary, String empNumber, String deptId) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
        this.empNumber = empNumber;
        this.deptId = deptId;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

}
