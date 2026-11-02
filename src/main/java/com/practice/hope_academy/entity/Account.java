package com.practice.hope_academy.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table
@Entity


public class Account {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private String accountNumber;
    @Column
    private String accountHolderName;
    @Column
    private double accountBalance;


}
