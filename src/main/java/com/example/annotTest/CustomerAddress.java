package com.example.annotTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerAddress {
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Autowired
    public CustomerAddress(Customer customer) {
        this.customer = customer;
    }

    public CustomerAddress() {
    }

    @Override
    public String toString() {
        return "CustomerAddress{" +
                "customer=" + customer +
                '}';
    }
}
