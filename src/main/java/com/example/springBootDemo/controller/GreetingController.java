package com.example.springBootDemo.controller;

import com.example.springBootDemo.service.GreetingService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class GreetingController {


    @Resource
    public GreetingService greetingService;

    private static final String template = "Hello, %s!";

    //@GetMapping("/greetingTwo")
//    public @ResponseBody Greeting greetingTwo(@RequestParam(value = "name", defaultValue = "World") String name) {
//        return greetingService.greeting(name);
//    }

    @GetMapping("/greeting")
    public @ResponseBody String greetingTwo(@RequestParam(value = "name", defaultValue = "World") String name) {
        return greetingService.greeting(name);
    }

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, World";
    }
}
