package com.entrata.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.entrata.qa.base.TestBase;
import com.entrata.qa.pageObjects.EntrataDashboardPage;
import com.entrata.qa.pageObjects.WatchDemoPage;

public class WatchdemoTest extends TestBase  {
	EntrataDashboardPage entratadashboard;
	WatchDemoPage watchdemo;
	
	public WatchdemoTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initializaion();
		
		entratadashboard = new EntrataDashboardPage();
		watchdemo =new WatchDemoPage();
		watchdemo=entratadashboard.Clickwatchdemobtn();
		
		
		
	}
	@Test(priority=1 )
	public  void EntrataLogoTest() {
		watchdemo.EntrataLogoClick();
		
		
		
		
	}
	
	
	
	@Test(priority=2)
	public void WatchdemodetailTest() {
		watchdemo.watchdemodetailPage("joan", "joy", "joan@gmail.com", "Voda","1-10");
		
		
		
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	

}
