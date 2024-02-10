package com.entrata.qa.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.entrata.qa.base.TestBase;


public class EntrataDashboardPage extends TestBase{
	
	@FindBy(id = "Layer_1")
	WebElement Entratalogo;
	
	@FindBy(xpath = "//body/div[@id='___gatsby']/div[@id='gatsby-focus-wrapper']/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]")
	WebElement WatchDemobtn;
	
	@FindBy(xpath ="//body/div[@id='___gatsby']/div[@id='gatsby-focus-wrapper']/div[1]/div[1]/div[1]/div[1]/div[3]/a[2]")
	WebElement Signlink;
	
	@FindBy(xpath = "//body/div[@id='___gatsby']/div[@id='gatsby-focus-wrapper']/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/a[1]")
	WebElement Resourcelink;
	
	@FindBy(xpath ="//body/div[@id='___gatsby']/div[@id='gatsby-focus-wrapper']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
	WebElement Productlink;
	
	@FindBy(xpath ="//body/div[@id='___gatsby']/div[@id='gatsby-focus-wrapper']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]")
	WebElement AllSolutionlink;
	

	
	public EntrataDashboardPage() {
		PageFactory.initElements(driver, this);
		
		
	}
	
   public String pagetitle() {
		
		return driver.getTitle();
	}
   
   public boolean validateEntrataLogo() {
	   return Entratalogo.isDisplayed();
   }
   
   public WatchDemoPage Clickwatchdemobtn() {
	   WatchDemobtn.click();
	   return new WatchDemoPage();
	   
   }
   
   public SignInPage ClickSignInbtn() {
	   Signlink.click();
	   return new SignInPage();
	   
   }
   

   public ResourcePage ClickResource() {
	   Resourcelink.click();
	   return new ResourcePage();
	   
   }
   
   public ProductPage ClickProductlink() {
	   Productlink.click();
	   return new ProductPage();
	   
   }
   
   public SolutionallPage ClickSolutionAllink() {
	   AllSolutionlink.click();
	   return new SolutionallPage();
	   
   }
   
   
   
   
   
   
	
	
	
	
	
	
	
	
	

}
