package com.practice.hope_academy.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Table
@Entity
public class Department {
@Id
@Column
    private String departmentId;
    @Column
    private String departmentName;
    @Column
    private String departmentAdress;






}
