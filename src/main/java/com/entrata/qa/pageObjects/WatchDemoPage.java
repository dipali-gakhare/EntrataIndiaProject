package com.entrata.qa.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.entrata.qa.base.TestBase;

public class WatchDemoPage extends TestBase{
	
	@FindBy(id ="Header_Logo")
	WebElement EntrataLogo;
	
	@FindBy(name ="FirstName")
	WebElement firstname;
	
	@FindBy(name ="LastName")
	WebElement lastname;
	
	@FindBy(name ="Email")
	WebElement Email;
	
	@FindBy(name ="Company")
	WebElement companyname;
	
	@FindBy(xpath="//input[@id='Phone']")
	WebElement phonenumber;
	
	@FindBy(xpath=" //input[@id='Title']")
	WebElement jobtitle;
	
	//@FindBy(xpath=" //button[contains(text(),'Watch Demo')]")
	//WebElement WatchDemobtn;
	
	
	public WatchDemoPage() {
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	public EntrataDashboardPage EntrataLogoClick() {
		EntrataLogo.click();
		return  new EntrataDashboardPage();
		
		
		
		
	}
	
	public void watchdemodetailPage(String FName, String LName, String El, String Company, String uC) {
		firstname.sendKeys(FName);
		lastname.sendKeys(LName);
		Email.sendKeys(El);
		companyname.sendKeys(Company);
		Select select = new Select(driver.findElement(By.xpath("//select[@id='Unit_Count__c']")));
		select.selectByValue(uC);
		
		//WatchDemobtn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

