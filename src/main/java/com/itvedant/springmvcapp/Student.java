package com.itvedant.springmvcapp;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public Student(){
        System.out.println("\n Student constructor  called");

    }  

    public void studying(){
        System.out.println("\n Student is studying");
    }
    
}
