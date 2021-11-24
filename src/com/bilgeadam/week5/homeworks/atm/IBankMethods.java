package com.bilgeadam.week5.homeworks.atm;

public interface IBankMethods {
	// para görüntüle
	public void showMoney();
	
	// para ekle
	public void addMoney(double money);
	
	// para çekmek
	public void reduceMoney(double money);
	
	// havale yapmak
	public void sendHavaleMoney(double money);
	
	// eft yapmak
	public void sendEftMoney(double money);
	
	// fake mail
	public void sendFakeMail(String emailAdress);
}
