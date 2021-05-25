package com.example.annotTest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.annotTest")
public class CustomerConfig {

    @Qualifier
    @Bean(name = "customer")
    public Customer getCustomer(){
        return new Customer("Azamat", 001);
    }

    @Bean(name = "customer")
    public Customer getCustomer1(){
        return new Customer("Beksultan", 001);
    }
}
