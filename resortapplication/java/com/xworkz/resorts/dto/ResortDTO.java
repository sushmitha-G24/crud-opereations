package com.xworkz.resorts.dto;

public class ResortDTO {
	private String location;
	private String name;
	private double pricePerHead;
	private float rating;
	private long phoneNO;
	private boolean offers;
	private String managerName;
	private int noOfEmployees;

	public ResortDTO() {

	}

	public ResortDTO(String location, String name, double pricePerHead, float rating, long phoneNO, boolean offers,
			String managerName, int noOfEmployees) {
		super();
		this.location = location;
		this.name = name;
		this.pricePerHead = pricePerHead;
		this.rating = rating;
		this.phoneNO = phoneNO;
		this.offers = offers;
		this.managerName = managerName;
		this.noOfEmployees = noOfEmployees;
	}

	@Override
	public String toString() {
		return "ResortDTO [location=" + location + ", name=" + name + ", pricePerHead=" + pricePerHead + ", rating="
				+ rating + ", phoneNO=" + phoneNO + ", offers=" + offers + ", managerName=" + managerName
				+ ", noOfEmployees=" + noOfEmployees + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			System.out.println("object is null");
			return false;
		}
		if (obj instanceof ResortDTO) {
			ResortDTO resort = (ResortDTO) obj;
			if (this.location.equals(resort.getLocation()) && this.name.equals(resort.getName())) {
				System.out.println("location and name is matching" + resort.location);
				return true;
			}
			return false;

		}

		return false;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPricePerHead() {
		return pricePerHead;
	}

	public void setPricePerHead(double pricePerHead) {
		this.pricePerHead = pricePerHead;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public long getPhoneNO() {
		return phoneNO;
	}

	public void setPhoneNO(long phoneNO) {
		this.phoneNO = phoneNO;
	}

	public boolean isOffers() {
		return offers;
	}

	public void setOffers(boolean offers) {
		this.offers = offers;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

}
