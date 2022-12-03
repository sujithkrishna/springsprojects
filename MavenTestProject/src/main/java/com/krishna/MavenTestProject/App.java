package com.krishna.MavenTestProject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class App {
  public static void main(String[] args) {

	  
	  BeanFactory factory= new XmlBeanFactory(new FileSystemResource("spring.xml"));
	  
	  Employee empObj = (Employee)factory.getBean("employee");
	  System.out.println(empObj.toString());
  
  }
}
