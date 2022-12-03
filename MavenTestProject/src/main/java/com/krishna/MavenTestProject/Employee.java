package com.krishna.mavenTestProject;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private int empNo;
	private String empName;
	@Autowired
	private Address address;

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

	public String toString() {
		String emp = "Employee [empNo=" + empNo + ", empName=" + empName + "]";
		String address = getAddress().toString();
		return emp + "\n" + address;
	}

}
