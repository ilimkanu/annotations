package com.example.annotTest.delivery.impl;

import com.example.annotTest.Customer;
import com.example.annotTest.delivery.AddressDelivery;
import org.springframework.stereotype.Service;

@Service
public class AddressDeliveryImpl implements AddressDelivery {
    @Override
    public Customer getCustomer() {
        return new Customer("DeliveryTestCustomer", 010);
    }
}
