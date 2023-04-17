package com.example.demobeans;

import com.example.demobeans.beans.Car;
import com.example.demobeans.beans.Home;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemobeansApplication {

    public static void main(String[] args) {

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
//        Home home = context.getBean(Home.class);
//
//        System.out.println(home);
//
//        Home home2 = context.getBean(Home.class);
//
//        System.out.println(home2);

//        ApplicationContext context = new AnnotationConfigApplicationContext(DemobeansApplication.class);


//        Car car = context.getBean(Car.class);
//
//        System.out.println(car.getModel());

        SpringApplication.run(DemobeansApplication.class, args);
    }

}
