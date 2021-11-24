package com.bilgeadam.week5.homeworks.atm;

// Enum: SAbit bileşenlerdir
// Constructor private olmalı
// set ile ilgili metodum olmasın
public enum MoneyCurrency {
	TR(1,"tr"), EN(2,"en"), GE(3,"ge");
	
	private final int number;
	private final String curr;
	
	// constructor private oldu
	private MoneyCurrency(int number, String curr) {
		this.number = number;
		this.curr = curr;
	}

	// Getter and setters
	public int getNumber() {
		return number;
	}

	public String getCurr() {
		return curr;
	}
	
	
}
