package com.example.springBootDemo.entity;


import java.util.Objects;

public class Greeting {

    private String content;

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Greeting greeting = (Greeting) o;
        return Objects.equals(content, greeting.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }
}
