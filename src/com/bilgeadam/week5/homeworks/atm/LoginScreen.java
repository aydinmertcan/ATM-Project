package com.bilgeadam.week5.homeworks.atm;

//Atm projesi
//0-) login user="root" password="root" 5 hak verilecek bloke koyacağız.
//1-) Para yatıracağız (eğer paramız 0 ise para eklememiz zorlasın)
//2-) Para çekeceğim
//3-) Havale yapacağım (3 tane hesap No ) :
//4-) EFT yapabileceğim ( 2 tane IBAN NO) : farklı bankalara göndermek
//5-) Fake Mail()
//6-) Çıkış

// Classlar
// LoginScreen
// EFt
// Havale
// Banka

//inheritance
//abstract
//interface
//enum
//static
//String metotları
//StringBuilder
//StringTokenizer
//Math
//Class üzerinden
//collection (List,Set,Map)

// özellikler
// parametresiz const
// parametreli const
// toString
// getter and setter
public class LoginScreen{
	// Özellikler
	private String userName;
	private String userPassword;
	private String userEmailAddress;
	
	// Parametresiz constructor --> Shift Space
	public LoginScreen() {
		// TODO Auto-generated constructor stub
	}

	// Parametreli constructor overloading --> Option Cmd S
	public LoginScreen(String userName, String userPassword, String userEmailAddress) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmailAddress = userEmailAddress;
	}

	public LoginScreen(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}

	// toString
	@Override
	public String toString() {
		return "LoginScreen [userName=" + userName + ", userPassword=" + userPassword + ", userEmailAddress="
				+ userEmailAddress + "]";
	}

	// getter and setter
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEmailAddress() {
		return userEmailAddress;
	}

	public void setUserEmailAddress(String userEmailAddress) {
		this.userEmailAddress = userEmailAddress;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

	
