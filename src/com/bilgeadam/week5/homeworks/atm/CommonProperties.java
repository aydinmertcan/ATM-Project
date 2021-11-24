package com.bilgeadam.week5.homeworks.atm;

import java.util.Date;

public class CommonProperties {
	// Özellikler
	private String id;
	private Date date;
	
	// Parametresiz Constructor
	public CommonProperties() {
		this.date = new Date(System.currentTimeMillis());
	}
	
	// Parametreli Constructor
	public CommonProperties(String id) {
		super();
		this.id = id;
	}

	// toString
	@Override
	public String toString() {
		return "CommonProperties [id=" + id + ", date=" + date + "]";
	}

	// Method
	// Getter and Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}
	
	
}
