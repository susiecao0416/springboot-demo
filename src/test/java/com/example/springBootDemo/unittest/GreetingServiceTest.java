package com.example.springBootDemo.unittest;

import com.example.springBootDemo.service.GreetingService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class GreetingServiceTest {

    @Resource
    private GreetingService greetingService;

    @Test
    public void contextLoads() throws Exception {
        assertThat(greetingService).isNotNull();
        assertThat(greetingService.greeting("world")).isEqualTo("hello world");
       // assertTrue(greetingService.greeting("world").equals(new Greeting("Hello, world!")));
    }
}
