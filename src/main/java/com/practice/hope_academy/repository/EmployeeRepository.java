package com.practice.hope_academy.repository;

import com.practice.hope_academy.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  EmployeeRepository extends JpaRepository<Employee, String> {

}
