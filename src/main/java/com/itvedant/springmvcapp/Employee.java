package com.itvedant.springmvcapp;

import org.springframework.stereotype.Component;

//Normal class
@Component
public class Employee {
    public Employee(){
        System.out.println("\n Employee Object Created\n");
    }

    public void working(){
        System.out.println("\n Employee is working");
    }
    
}
