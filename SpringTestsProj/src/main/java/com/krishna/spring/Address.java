package com.krishna.spring;

import org.springframework.stereotype.Component;

@Component
public class Address {

	
	private String address1;
	private String address2;
	private String city;
	private String state;
	private int postcode;
	
	public Address() {
		this.address1 ="36";
		this.address2 ="Cobden Street";
		this.city ="Coventry";
		this.state="West Midlands";
		this.postcode=123_456;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	@Override
	public String toString() {
		return "Address [address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", state=" + state
				+ ", postcode=" + postcode + "]";
	}
	
	public String displayingAddress() {
		return toString();
	}
	
	
	
}
