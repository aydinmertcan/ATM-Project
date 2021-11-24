package com.bilgeadam.week5.homeworks.atm;

// Özellikler
// Parametresiz Cons
// Parametreli Const
// toString
// Method
// Getter and setter
public class Havale extends CommonProperties{
	// Özellikler
	private String havaleSerial;
	private String havaleAmount;
	
	// Parametresiz Constructor
	public Havale() {
		// TODO Auto-generated constructor stub
	}

	// Parametreli Constructor
	public Havale(String id,String havaleSerial, String havaleAmount) {
		super(id);
		this.havaleSerial = havaleSerial;
		this.havaleAmount = havaleAmount;
	}

	@Override
	public String toString() {
		return "Eft" + ",ID:=" + getId() + "[havaleSerial=" + havaleSerial + ", havaleAmount=" + havaleAmount +  ", getDate()="
				+ getDate() + "]";
		
	}
	// Getter and setter

	public String gethavaleSerial() {
		return havaleSerial;
	}

	public void setHavaleSerial(String havaleSerial) {
		this.havaleSerial = havaleSerial;
	}

	public String getHavaleAmount() {
		return havaleAmount;
	}

	public void setHavaleAmount(String havaleAmount) {
		this.havaleAmount = havaleAmount;
	}
	
	
	
	
}
