package com.XMLCongifuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {
	public static void main(String args[])
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
		Employee emp=(Employee)context.getBean("employee");
		
		System.out.println(emp.toString());
	
	}
}
