package com.JavaConfigurationStudent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.JavaConfiguration.EmployeeConfiguration;

public class TestContainerStudent {

	public static void main(String[] args) {
		ApplicationContext  context=new AnnotationConfigApplicationContext(StudentConfiguration.class);
		Student s1=(Student) context.getBean("student1");
		s1.setId(101);
		s1.setName("Sanskruti");
		s1.setAddress("Nashik");
		s1.setMarks("100");
		System.out.println(s1.toString());
		
		System.out.println("-------------------------------------");
	
		Student s2=(Student) context.getBean("student2");
		s2.setId(102);
		s2.setName("Ajinkya");
		s2.setAddress("Amravati");
		s2.setMarks("90");
		System.out.println(s2.toString());
	
		System.out.println("-------------------------------------");
		
		Student s3=(Student) context.getBean("student3");
		s3.setId(103);
		s3.setName("Shailaa");
		s3.setAddress("Latur");
		s3.setMarks("99");
		System.out.println(s3.toString());
	}

}
