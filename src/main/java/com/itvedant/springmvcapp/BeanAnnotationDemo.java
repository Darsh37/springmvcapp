package com.itvedant.springmvcapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// This annototion is used to indicate that 
// the class contain bean method

@Configuration
public class BeanAnnotationDemo {
    @Bean
    public void beanCheck(){
        System.out.println("\n Bean Method called");
    }
    
    @Bean
    public Employee creatEmployee(){
        return new Employee();

    }

    
}
