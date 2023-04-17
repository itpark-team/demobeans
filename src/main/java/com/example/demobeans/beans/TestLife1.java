package com.example.demobeans.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TestLife1 {

    public String name = "noname";

    public TestLife1() {
        System.out.printf("TestLife1 im AWAKE with NAME: " + name);
    }

    @PostConstruct
    public void init() {
        name = "TestLife111111";
        System.out.printf("TestLife1 im INIT with NAME: " + name);
    }

    @PreDestroy
    public void destroy() {
        System.out.printf("TestLife1 im DESTROY");
    }
}
