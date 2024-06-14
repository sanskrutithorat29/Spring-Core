package com.JavaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class EmployeeConfiguration {
	@Bean(name="employee1")
	public Employee getEmployee1(){
		return new Employee();
	}
	
	@Bean(name="employee2")
	public Employee getEmployee2(){
		return new Employee();
	}
}
