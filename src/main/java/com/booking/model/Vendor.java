package com.booking.model;

public class Vendor {

	private int vendorID;
	private String vendorName;
	private String vendorAddress;
	private int vendorContactNumber;
	private String emailID;
	private String websiteURL;
	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vendor(int vendorID, String vendorName, String vendorAddress, int vendorContactNumber, String emailID,
			String websiteURL) {
		super();
		this.vendorID = vendorID;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorContactNumber = vendorContactNumber;
		this.emailID = emailID;
		this.websiteURL = websiteURL;
	}
	public int getVendorID() {
		return vendorID;
	}
	public void setVendorID(int vendorID) {
		this.vendorID = vendorID;
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
	public int getVendorContactNumber() {
		return vendorContactNumber;
	}
	public void setVendorContactNumber(int vendorContactNumber) {
		this.vendorContactNumber = vendorContactNumber;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getWebsiteURL() {
		return websiteURL;
	}
	public void setWebsiteURL(String websiteURL) {
		this.websiteURL = websiteURL;
	}
	@Override
	public String toString() {
		return "Vendor [vendorID=" + vendorID + ", vendorName=" + vendorName + ", vendorAddress=" + vendorAddress
				+ ", vendorContactNumber=" + vendorContactNumber + ", emailID=" + emailID + ", websiteURL=" + websiteURL
				+ "]";
	}
	
	
	
}
