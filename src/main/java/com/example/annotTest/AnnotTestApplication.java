package com.example.annotTest;

import com.example.annotTest.delivery.AddressDelivery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AnnotTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(AnnotTestApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfig.class);

		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer);

		CustomerAddress customerAddress = (CustomerAddress) context.getBean("customerAddress");
		System.out.println(customerAddress);

		AddressDelivery addressDelivery = context.getBean("addressDeliveryImpl", AddressDelivery.class);
		System.out.println(addressDelivery.getCustomer());
	}
}
