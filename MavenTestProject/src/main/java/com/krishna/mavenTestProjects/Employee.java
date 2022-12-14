package com.krishna.mavenTestProjects;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private int empNo;
	private String empName;
	@Autowired
	private Address address;
	@Autowired
	private Computer computer;
	
	public Employee() {
	}

	public Employee(int empNo, String empName, Address address) {
		this.empNo = empNo;
		this.empName = empName;
		this.address = address;
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

	public Employee(int empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	public String toString() {
		String emp = "Employee [empNo=" + empNo + ", empName=" + empName + "]";
		String address = getAddress().toString();
		String computer = getComputer().getComputer();
		return emp + "\n" + address +"\n"+computer;
	}

}
