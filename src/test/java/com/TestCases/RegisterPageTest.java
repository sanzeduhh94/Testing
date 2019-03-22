package com.TestCases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.TestBase.TestBase;

import com.TestPages.RegisterPage;
import com.TestUtil.TestUtil;

public class RegisterPageTest extends TestBase {
RegisterPage registerpage; //global variable
	String sheetName= "UserDetails";
	
	
	public RegisterPageTest() {
		super();
	}
	@BeforeMethod
	public void SetUp() {
		
		initil(); //launches browser, deletes cookies, etc. (gets ready)
		registerpage = new RegisterPage();
		
	}
	
	@DataProvider 
	public Object [][] moon(){
		Object [][] data=TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(dataProvider="moon")
	public void CreateNewOrder(String Fn, String Ln, String Ph, String Em, String Ad, String Ct, String St, String Po, String Un, String Pw, String Cp) {

	registerpage.ClickRegister();
	registerpage.Register(Fn,Ln,Ph,Em,Ad,Ct,St,Po,Un,Pw,Cp);
	
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
}
