package com.example.demobeans.beans;

public class TestLife2 {
    public String name = "noname";

    public TestLife2() {
        System.out.printf("TestLife2 im AWAKE with NAME: " + name);
    }

    public void init() {
        name = "TestLife111111";
        System.out.printf("TestLife2 im INIT with NAME: " + name);
    }

    public void destroy() {
        System.out.printf("TestLife2 im DESTROY");
    }
}
