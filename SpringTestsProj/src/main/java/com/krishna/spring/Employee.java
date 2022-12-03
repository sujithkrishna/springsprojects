package com.krishna.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int empNo;
	private String empName;
	@Autowired
	private Address address;
	
	public Employee() {
		this.empNo =10;
		this.empName ="Sujith";
	}
	
	public Employee(int empNo, String empName,Address address) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.address = address;
	}

	public void display() {
		System.out.println("Emp No "+empNo);
		System.out.println("Emp Name "+empName);
		System.out.println("Emp Address "+ address.displayingAddress());
	}
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
}
