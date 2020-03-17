package com.example.demo.model;

import com.example.demo.model.audit.DateAudit;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created on 16/3/2020.
 * Class: Employee.java
 * By : Admin
 */
public class Employee extends DateAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
}
