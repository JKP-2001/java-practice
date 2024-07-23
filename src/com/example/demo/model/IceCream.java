package com.example.demo.model;

import java.time.LocalDate;

public class IceCream extends Product {

	private String type;    // cone,familypack,smallcup
	private String flavour;  //vannila,straberry,choc
	private LocalDate expiryDate; 

	public IceCream(String type, String flavour, LocalDate expiryDate) {
		this.type = type;
		this.flavour = flavour;
		this.expiryDate = expiryDate;
	}

	public IceCream(int productId, String productName, double ratePerUnit, String type, String flavour, LocalDate expiryDate) throws Exception {
		super(productId, productName, ratePerUnit);
		this.type = type;
		this.flavour = flavour;
		this.expiryDate = expiryDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "IceCream{" +
				"productId='" + getProductId() + '\'' +
				", productName='" + getProductName() + '\'' +
				", ratePerUnit=" + getRatePerUnit() + '\'' +
				", type=" + type + '\'' +
				", flavour='" + flavour + '\'' +
				", expiryDate=" + expiryDate +
				'}';
	}
}

// Create a Set Based collection and Store icecreams in it
// provide methods to add/find/findAll/remove elements
// check with the main method
// use layered architecture
