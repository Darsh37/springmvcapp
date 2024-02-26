package com.itvedant.springmvcapp;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String colour;
    private Engine engine;

    //Constructor Based dependency injection

    // public Car(Engine e){
    //     this.colour = "red";
    //     this.engine =e;
    //     System.out.println("\n Car object Created"+ e.toString() +colour.toString());

    // }

    //Setter Based dependency injection

    public Car(){

    }

    public void seEngine(Engine e){
        this.engine =e;
        System.out.println("\n Injecting Engine Object using setter");



    }


    
}
