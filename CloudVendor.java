package com.thinkconstructive.restdemo.model;

public class CloudVendor {
	
	private String vendorId;
	private String vendorName;
	private String vendorAddress;
	private String vendorPhoneNumber;
	
	
	
	
	// No parameterized constructor
	public CloudVendor() {
		
	}


	// parameterized constructor
	public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorPhoneNumber = vendorPhoneNumber;
	}


	
	
	// Getter Setter
	public String getVendorId() {
		return vendorId;
	}


	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}


	public String getVendorName() {
		return vendorName;
	}


	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}


	public String getVendorAddress() {
		return vendorAddress;
	}


	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}


	public String getVendorPhoneNumber() {
		return vendorPhoneNumber;
	}


	public void setVendorPhoneNumber(String vendorPhoneNumber) {
		this.vendorPhoneNumber = vendorPhoneNumber;
	}
	
	// To string method
	
	

}
