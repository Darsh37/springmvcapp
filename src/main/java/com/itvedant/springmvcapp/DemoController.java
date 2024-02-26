package com.itvedant.springmvcapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//Controller class is the one where the
//request will be redirected from tomcat
@Controller
public class DemoController {

    //This annotation

    @Autowired
    Student student;

    @Autowired
    Employee employee;


    //Controller class will contain some
    //methods that we will map with the 
    //request url

    //This method should return the name
    //of the view file (HTML file)
    //that the tomcat will return as response


    @RequestMapping("/")
    public String Home(){
        System.out.println("Home method called");
        student.studying();
        return "Home.html";
    }

    @RequestMapping("/aboutus")
    public String about(){
        System.out.println("about method called");
        employee.working();
        return "about.html";
    }
    
}
