package com.entrata.qa.testcase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.entrata.qa.base.TestBase;
import com.entrata.qa.pageObjects.EntrataDashboardPage;
import com.entrata.qa.pageObjects.SignInPage;
import com.entrata.qa.pageObjects.WatchDemoPage;

public class SignInTest extends TestBase {
	
	EntrataDashboardPage entratadashboard;
	SignInPage signinpage;

	
	

	public SignInTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initializaion();
		
		entratadashboard  = new EntrataDashboardPage();
		
		signinpage=entratadashboard.ClickSignInbtn();
	
	
	
	}
	
	@Test
	public void propertiManagerTest() {
		signinpage.PropertymanagerClick();
		
		
		
		
		
		
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	

}
