package com.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class RegisterPage extends TestBase {

	@FindBy(xpath="//input[@name='firstName']")
	WebElement FirstName;
	@FindBy(xpath="//input[@name='lastName']")
	WebElement LastName;
	@FindBy(xpath="//input[@name='phone']")
	WebElement PhoneNumber;
	@FindBy(xpath="//input[@name='userName']")
	WebElement Email;
	@FindBy(xpath="//input[@name='address1']")
	WebElement Address;
	@FindBy(xpath="//input[@name='city']")
	WebElement City;
	@FindBy(xpath="//input[@name='state']")
	WebElement State;
	@FindBy(xpath="//input[@name='postalCode']")
	WebElement Zip;
	@FindBy(xpath="//input[@name='email']")
	WebElement UserName;
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	@FindBy(xpath="//input[@name='confirmPassword']")
	WebElement ConfirmPassword;
	@FindBy(xpath="//input[@name='register']")
	WebElement Submit;
	@FindBy(xpath="//a[text()='REGISTER']")
	WebElement Register;
	
	public RegisterPage() { 
		PageFactory.initElements(driver, this);
	
		}
	public void ClickRegister() {
		Register.click();
	}
	
	public void Register(String FN, String LN, String PH, String EM, String AD, String CT, String ST, String PO, String UN, String PW, String CP) {
		FirstName.sendKeys(FN);
		LastName.sendKeys(LN);
		PhoneNumber.sendKeys(PH);
		Email.sendKeys(EM);
		Address.sendKeys(AD);
		City.sendKeys(CT);
		State.sendKeys(ST);
		Zip.sendKeys(PO);
		UserName.sendKeys(UN);
		Password.sendKeys(PW);
		ConfirmPassword.sendKeys(CP);
		Submit.click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
