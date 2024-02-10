package com.entrata.qa.testcase;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.entrata.qa.base.TestBase;
import com.entrata.qa.pageObjects.EntrataDashboardPage;

public class EntrataDashboardTest extends TestBase {
	
	EntrataDashboardPage entratadashboard;
	
	public EntrataDashboardTest() {
		super();
	}
	
	@BeforeMethod
	
	public void setUp() {
		
		initializaion();
		entratadashboard = new EntrataDashboardPage();
		
		
	}
	
	@Test(priority=1)
	
	public void pagetitleTest() {
		String title= entratadashboard.pagetitle();
		Assert.assertEquals(title,"Property Management Software | Entrata","Title is not match");
	}
	
	@Test(priority=2)
	public void entratalogoTest() {
		boolean logo =entratadashboard.validateEntrataLogo();
		Assert.assertTrue(logo);
		
		
	}
	
	@Test(priority=3)
	public void watchdemoTest() {
		entratadashboard.Clickwatchdemobtn();
		
		}
	

	@Test(priority=4)
	public void ClickSigninTest() {
		entratadashboard.ClickSignInbtn();
		
		}
	
	@Test(priority=5)
	public void ClickProductTest() {
		entratadashboard.ClickProductlink();
		
		}
	
	@Test(priority=6)
	public void ClickSolutionallTest() {
		entratadashboard.ClickSolutionAllink();
		
		}
	@Test(priority=7)
	public void ClickResourceTest() {
		entratadashboard.ClickResource();
		
		}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
