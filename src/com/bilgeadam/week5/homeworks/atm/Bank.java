package com.bilgeadam.week5.homeworks.atm;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	// Özellikler
	protected String bankName;
	protected String bankCity;
	protected String bankLogo;
	
	// Banka eft class
	protected List<Eft> bankEftSerial;
	
	// Banka havale class --> Listemde birden fazla havale yapılacağını söylüyor.
	protected List<Havale> bankHavaleSerial;
	
	// Composition
	// Empati kurmamız
	protected List<MoneyWallet> moneyList;
	
	
	
	// Parametresiz Constructor
	public Bank() {
		bankHavaleSerial = new ArrayList<Havale>();
		bankHavaleSerial.add(new Havale("1", "havale1 seri 14", "5000"));
		bankHavaleSerial.add(new Havale("2", "havale2 seri 14", "6000"));
		bankHavaleSerial.add(new Havale("3", "havale3 seri 14", "7000"));
		bankHavaleSerial.add(new Havale("4", "havale4 seri 14", "8000"));
		
		bankEftSerial = new ArrayList<Eft>();
		bankEftSerial.add(new Eft("1", "eft seri 14", "2000"));
		bankEftSerial.add(new Eft("2", "eft seri 14", "3000"));
		bankEftSerial.add(new Eft("3", "eft seri 14", "4000"));
		bankEftSerial.add(new Eft("4", "eft seri 14", "5000"));
	}

	// Parametreli Constructor
	public Bank(String bankName, String bankCity, String bankLogo) {
		super();
		this.bankName = bankName;
		this.bankCity = bankCity;
		this.bankLogo = bankLogo;
	}
	
	
	// toString
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", bankCity=" + bankCity + ", bankLogo=" + bankLogo + "]";
	}
	
	// Method

	// Getter and Setter
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankCity() {
		return bankCity;
	}

	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}

	public String getBankLogo() {
		return bankLogo;
	}

	public List<Eft> getBankEftSerial() {
		return bankEftSerial;
	}

	public void setBankEftSerial(List<Eft> bankEftSerial) {
		this.bankEftSerial = bankEftSerial;
	}

	public List<Havale> getBankHavaleSerial() {
		return bankHavaleSerial;
	}

	public void setBankHavaleSerial(List<Havale> bankHavaleSerial) {
		this.bankHavaleSerial = bankHavaleSerial;
	}

	public void setBankLogo(String bankLogo) {
		this.bankLogo = bankLogo;
	}
	
	
	
	
}
