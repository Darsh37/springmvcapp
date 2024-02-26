package com.itvedant.springmvcapp;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    private String type;
    private double speed;

    public Engine(){
        this.type = "Combustable";
        this.speed =120.00;
        System.out.println("\n Enging object created");
    }
    
}
