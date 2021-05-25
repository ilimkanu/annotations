package com.example.annotTest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.example.annotTest")
public class CustomerConfig {

    @Scope("prototype")
    @Qualifier
    @Bean(name = "customer")
    public Customer getCustomer(){
        return new Customer("Azamat", 001);
    }
//    Используется чтобы создавать объекты с разным Hash-кодом при вызове объекта

    @Bean(name = "customer")
    public Customer getCustomer1(){
        return new Customer("Beksultan", 001);
    }
}
