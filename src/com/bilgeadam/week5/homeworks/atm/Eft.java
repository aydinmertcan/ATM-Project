package com.bilgeadam.week5.homeworks.atm;

// Özellikler
// Parametresiz Cons
// Parametreli Const
// toString
// Method
// Getter and setter
public class Eft extends CommonProperties{
	// Özellikler
	private String eftName;
	private String eftAmount;
	
	// Parametresiz Constructor
	public Eft() {
		// TODO Auto-generated constructor stub
	}

	// Parametreli Constructor
	public Eft(String id,String eftName, String eftAmount) {
		super(id);
		this.eftName = eftName;
		this.eftAmount = eftAmount;
	}

	@Override
	public String toString() {
		return "Eft" + ",ID:=" + getId() + "[eftName=" + eftName + ", eftAmount=" + eftAmount +  ", getDate()="
				+ getDate() + "]";
		
	}
	// Getter and setter

	public String getEftName() {
		return eftName;
	}

	public void setEftName(String eftName) {
		this.eftName = eftName;
	}

	public String getEftAmount() {
		return eftAmount;
	}

	public void setEftAmount(String eftAmount) {
		this.eftAmount = eftAmount;
	}
	
	
	
	
}
