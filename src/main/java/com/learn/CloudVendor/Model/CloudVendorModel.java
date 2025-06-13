package com.learn.CloudVendor.Model;

//@Entity
public class CloudVendorModel {
    
	private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorContact;
    
	public CloudVendorModel() {
	}

	public CloudVendorModel(String vendorId, String vendorName, String vendorAddress, String vendorContact) {
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorContact = vendorContact;
	}

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

	public String getVendorContact() {
		return vendorContact;
	}

	public void setVendorContact(String vendorContact) {
		this.vendorContact = vendorContact;
	}

}
