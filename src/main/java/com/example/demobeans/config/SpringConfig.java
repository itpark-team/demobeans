package com.example.demobeans.config;

import com.example.demobeans.beans.Car;

import com.example.demobeans.beans.TestLife2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
public class SpringConfig {
    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }

    @Bean
    public Car getCar(@Value("${car.model}") String model) {
        return new Car(model);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public TestLife2 getTestLife2(){
        return new TestLife2();
    }
}
