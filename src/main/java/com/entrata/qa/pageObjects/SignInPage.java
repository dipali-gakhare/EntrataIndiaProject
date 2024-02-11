package com.entrata.qa.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.entrata.qa.base.TestBase;

public class SignInPage extends TestBase {
	
	@FindBy(xpath = "//a[@class='button-default solid-dark-button']")
	WebElement Propertymanager;
	
	
	public SignInPage() {
		PageFactory.initElements(driver, this);

}
	
	public void PropertymanagerClick() {
		Actions  act = new Actions(driver);
		act.moveToElement(Propertymanager).click().build().perform();
		//Propertymanager.click();
		
		
	}
	
}
