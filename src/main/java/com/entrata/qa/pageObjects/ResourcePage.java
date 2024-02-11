package com.entrata.qa.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.entrata.qa.base.TestBase;

public class ResourcePage extends TestBase {
	
	@FindBy(xpath ="//a[@class='button-default solid-dark-button']")
	WebElement Watchdemobtn;
	
	
	
	@FindBy(xpath="//div[@class='resources-grid-headline']")
	WebElement GetText;
	
	
	
	public ResourcePage() {
		PageFactory.initElements(driver, this);
		
		
	}
	public void DownloadClick()  {
		//Thread.sleep(5000);
		Actions act= new Actions(driver);
		act.moveToElement(Watchdemobtn).click().build().perform();
		//Downloadbtn.click();
		
		
	}
	
	
	public String VerifyText() {
		return GetText.getText();
		
		
		
	}
	

	
	
}
