package com.XMLConfigurationCustomer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainerCustomer {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("config2.xml");
		Customer cs1=(Customer)context.getBean("customer1");
		System.out.println(cs1.toString());
		Customer cs2=(Customer)context.getBean("customer2");
		System.out.println(cs2.toString());
		Customer cs3=(Customer)context.getBean("customer3");
		System.out.println(cs3.toString());
		

	}

}
