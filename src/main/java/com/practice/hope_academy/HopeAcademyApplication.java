package com.practice.hope_academy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.hope_academy.*"})
public class HopeAcademyApplication {

    public static void main(String[] args) {
        SpringApplication.run(HopeAcademyApplication.class, args);
    }
}

