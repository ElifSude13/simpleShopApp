package com.shop.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class HomeController {

    @RequestMapping("/")
    //@ResponseBody
    public String greet(){
        /*System.out.println("i am here...");*/
        return "Welcome to our App!";
    }

    @RequestMapping("/about")
    public String about(){
        return("We don't teach, we educate!!!");
    }
}
