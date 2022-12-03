package com.krishna.mavenTestProject;

import org.springframework.stereotype.Component;

@Component
public class Address {

	
	private String address1;
	private String address2;
	private String city;
	
	public Address() {
		this.address1 ="36 Cobden St";
		this.address2 ="Coventry";
		this.city ="Coventry";
	}
	
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [address1=" + address1 + ", address2=" + address2 + ", city=" + city + "]";
	}
	
	
}
