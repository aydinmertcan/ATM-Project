package com.bilgeadam.week5.homeworks.atm;

// Parayla alakalı classımız
public class MoneyWallet extends CommonProperties implements IBankMethods{
	// özellikler
	protected String moneyType; // Kağıt mı bozuk mu?
	protected String moneyCurrency; // tr en belli bir standartta göstermemiz lazım enum oluşturmalıyız.
	protected double moneyAmount;
	
	// Composition
	protected Bank bank;
	
	// Parametresiz constructor
	public MoneyWallet() {
		this.moneyAmount = 0.0;
	}

	// Parametreli constructor
	public MoneyWallet(String id,String moneyType, String moneyCurrency, double moneyAmount) {
		super(id);
		this.moneyType = moneyType;
		this.moneyCurrency = moneyCurrency;
		this.moneyAmount = moneyAmount;
	}

	// toString
	@Override
	public String toString() {
		return "MoneyWallet [moneyType=" + moneyType + ", moneyCurrency=" + moneyCurrency + ", moneyAmount="
				+ moneyAmount + ", getId()=" + getId() + ", getDate()=" + getDate() + "]";
	}
	
	// Method
	@Override
	public void showMoney() {
		System.out.println("Paranızın toplam tutarı: " + this.moneyAmount);		
	}

	@Override
	public void addMoney(double money) {
		this.moneyAmount += money;
	}

	@Override
	public void reduceMoney(double money) {
		if(this.moneyAmount > 0)
		this.moneyAmount -= money;
		else
			System.out.println("Yeterli paranız yok...");
	}

	@Override
	public void sendHavaleMoney(double money) {
		Bank bank = new Bank();
		for(Object temp:bank.bankHavaleSerial) {
			System.out.println(temp);
		}
		moneyAmount -= money;
	}

	@Override
	public void sendEftMoney(double money) {
		Bank bank = new Bank();
		for(Object temp:bank.bankEftSerial) {
			System.out.println(temp);
		}
		System.out.println(money + "miktar gönderildi.");
		moneyAmount -= money;	
	}

	@Override
	public void sendFakeMail(String emailAdress) {
		// TODO Auto-generated method stub
		
	}
	
	
	// Getter and setters
	public String getMoneyType() {
		return moneyType;
	}

	public void setMoneyType(String moneyType) {
		this.moneyType = moneyType;
	}

	public String getMoneyCurrency() {
		return moneyCurrency;
	}

	public void setMoneyCurrency(String moneyCurrency) {
		this.moneyCurrency = moneyCurrency;
	}

	public double getMoneyAmount() {
		return moneyAmount;
	}

	public void setMoneyAmount(double moneyAmount) {
		this.moneyAmount = moneyAmount;
	}

	
	
	
	
	
	

	
	
}
