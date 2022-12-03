package com.krishna.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTestsProjApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringTestsProjApplication.class, args);
		Employee obj = context.getBean(Employee.class);
		obj.display();
	}

}
