package com.example.springBootDemo.controller;

//@RestController
//public class GreetingController {
//
//    @GetMapping("/greeting")
//    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
//        if (name == "Test")
//            return new Greeting(1, "Hello, " + name);
//        else
//            return new Greeting(2, "Hello, " + name);
//    }
//}

import com.example.springBootDemo.service.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        if (name.equals("world"))
            return new Greeting(String.format(template, "world"));
        else
            return new Greeting(String.format(template, name));
    }

    @GetMapping("/")
    public String test() {
        return "Hello";
    }
}
