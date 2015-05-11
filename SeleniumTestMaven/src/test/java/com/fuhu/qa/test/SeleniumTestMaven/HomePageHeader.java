package com.fuhu.qa.test.SeleniumTestMaven;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class HomePageHeader {

	WebDriver driver = new FirefoxDriver();
	
	@Before
	public void setUp()throws Exception {
		driver.manage().window().maximize();
		driver.get("http://dev-ecom-magento.fuhu.org");
	}
	
	@Test
	public void testHomePage()throws Exception {
		
		//test nabiShop img existence
		WebElement nabi_Shop = driver.findElement(By.xpath(".//*[@id='header']/div/div/div/h1/a/img"));
		
		assertTrue(nabi_Shop.isDisplayed());
		nabi_Shop.click();
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//assert_1-855-363-NABI test
		WebElement _1855363NABI = driver.findElement(By.xpath(".//*[@id='header']/div/div/ul[1]/li[1]"));
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		String _1855363NABIText = _1855363NABI.getText();
		assertEquals("1-855-363-NABI", _1855363NABIText);
		
		//assert_SUPPORT
		WebElement SUPPORT = driver.findElement(By.xpath(".//*[@id='header']/div/div/ul[1]/li[2]/a"));
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		String SUPPORTText = SUPPORT.getText();
		assertEquals("SUPPORT", SUPPORTText);
	
		//assert_MYACCOUNT
        WebElement MYACCOUNT = driver.findElement(By.xpath(".//*[@id='header']/div/div/ul[1]/li[3]/a"));
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		String MYACCOUNTText = MYACCOUNT.getText();
		assertEquals("MY ACCOUNT", MYACCOUNTText);
		
		
		//assert_SHOPPINGBAG
		WebElement SHOPPINGBAG = driver.findElement(By.xpath(".//*[@id='header']/div/div/ul[2]/li[1]/a/span"));
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		String SHOPPINGBAGText = SHOPPINGBAG.getText();
		assertEquals("SHOPPING BAG", SHOPPINGBAGText);
		
		//assert_PayOverTime
        WebElement PAYOVERTIME = driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div[2]/div[1]/div/p/a/strong"));
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		String PAYOVERTIMEText = PAYOVERTIME.getText();
		assertEquals("PAY OVER TIME.", PAYOVERTIMEText);
		
		//assert_PayOverTime_text1
        WebElement PAYOVERTIME_1 = driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div[2]/div[1]/div/p/a"));
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		String PAYOVERTIME_2 = PAYOVERTIME_1.getText();
		assertEquals("PAY OVER TIME. NABI THREE SIX TWELVE FLEXPAY ON ORDERS $99.99 AND OVER. *DETAILS", PAYOVERTIME_2);
		
	}//end Test
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
}//end class




