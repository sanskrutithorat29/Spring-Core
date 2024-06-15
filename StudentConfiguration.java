package com.JavaConfigurationStudent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.JavaConfiguration.Employee;

@Configuration
public class StudentConfiguration {
	@Bean(name="student1")
	public Student getStudent1(){
		return new Student();
	}
	
	@Bean(name="student2")
	public Student getStudent2(){
		return new Student();
	}
	
	@Bean(name="student3")
	public Student getStudent3(){
		return new Student();
	}

}
