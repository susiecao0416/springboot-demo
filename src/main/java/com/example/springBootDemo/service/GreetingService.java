package com.example.springBootDemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private static final String template = "Hello, %s!";

//    public Greeting greeting(String name) {
//        if (name.equals("world"))
//            return new Greeting(String.format(template, "world"));
//        else
//            return new Greeting(String.format(template, name));
//    }

    public String greeting(String name) {
        if (name.equals("world"))
            return "hello world";
        else
            return "hello test";
    }
}
