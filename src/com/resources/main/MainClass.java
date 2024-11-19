package com.resources.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techcarver.entity.Student;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
		Student id = (Student) context.getBean("studentObj1");
		System.out.println(id);

		Student name = (Student) context.getBean("studentObj2");
		System.out.println(name);

		Student student = (Student) context.getBean("studentObj3");
		System.out.println(student);
	}

}
 

