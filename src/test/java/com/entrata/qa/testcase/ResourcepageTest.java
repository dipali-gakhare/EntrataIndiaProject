package com.entrata.qa.testcase;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.entrata.qa.base.TestBase;
import com.entrata.qa.pageObjects.EntrataDashboardPage;
import com.entrata.qa.pageObjects.ResourcePage;


public class ResourcepageTest extends TestBase {
	
	EntrataDashboardPage entratadashboard;
	ResourcePage resourcepage;
	
	public ResourcepageTest() {
		super();
	}
	
   @BeforeMethod
	
	public void setUp() {
		
		initializaion();
		entratadashboard = new EntrataDashboardPage();
		resourcepage = new ResourcePage();
		resourcepage= entratadashboard.ClickResource();
		
		}
   
  
   @Test(priority=1)
   
   public void DownloadBtnTest()    {
	   resourcepage.DownloadClick();
	   
	  
	
	  
	  
	  
		  
		  
		  
		  
}
   @Test(priority=2)
	  public void verifyText() {
		  String text =resourcepage.VerifyText();
		  Assert.assertEquals(text,"5 Steps to Improve Your Reputation","message not match");
	 
	   
	   
	   
	   
 }
  


   
   @AfterMethod
	public void tearDown() {
		driver.quit();
	}
   


}
