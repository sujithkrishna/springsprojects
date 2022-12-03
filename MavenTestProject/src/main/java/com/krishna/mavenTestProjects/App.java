package com.krishna.mavenTestProjects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {

	  
	 // BeanFactory factory= new XmlBeanFactory(new FileSystemResource("spring.xml"));
	  
	  // Where the package start there we need to keep the xml
	  
	  ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
	  
	 Employee empObj1 = (Employee)factory.getBean("employee");
	 System.out.println("This is to String from Employee 1: "+empObj1.toString());
	
	 
  }
}
