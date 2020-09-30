package com.example.springBootDemo.integrationtest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class MockGreetingTest {

    @Resource
    private MockMvc mockMvc;

    @Test
    public void greetingShouldReturnMessage() throws Exception {
        assertThat(this.mockMvc.perform(get("/greeting?name=testing"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("hello test"))));
    }
}
