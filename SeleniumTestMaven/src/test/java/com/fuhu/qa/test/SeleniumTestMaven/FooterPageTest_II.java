package com.fuhu.qa.test.SeleniumTestMaven;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FooterPageTest_II {

	WebDriver firefox_driver;
	WebDriver chrome_driver;
	WebDriver safari_driver;
	
	
	
public void footerPageSkipSubPageTest(String homePageTitle, String targetElementXpath, String targetPageTitleHint, String targetPageTitle, WebDriver webdriver)	throws Exception {
	String HomePageWindowId = webdriver.getWindowHandle();
	assertEquals(homePageTitle, webdriver.getTitle());
	try {
		Thread.sleep(3000);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	WebElement warranty_firefox = webdriver.findElement(By.xpath(targetElementXpath));
	warranty_firefox.click();
	Set <String> allWindowId = webdriver.getWindowHandles();
	for(String windowId : allWindowId) {
		if(webdriver.switchTo().window(windowId).getTitle().contains(targetPageTitleHint)) {
			webdriver.switchTo().window(windowId);
			break;
		}
	}
    assertEquals(targetPageTitle, webdriver.getTitle());
    try {
		Thread.sleep(3000);
	} catch (Exception e) {
		e.printStackTrace();
	}
    //close the targetWindow
    webdriver.close();
    webdriver.switchTo().window(HomePageWindowId);
    try {
		Thread.sleep(3000);
	} catch (Exception e) {
		e.printStackTrace();
	}
    assertEquals(homePageTitle, webdriver.getTitle());
}//end footerPageSkipSubPageTest

@Before
public void setUp() throws Exception {
//	        // set up firefox driver
//			firefox_driver = new FirefoxDriver();
//			firefox_driver.manage().window().maximize();
//			firefox_driver.get("http://stg-ecom-magento.fuhu.org");
//	       
			
			// set up chrome_driver
		    System.setProperty("webdriver.chrome.driver","/Users/Fuhu/Desktop/chromedriver");
		    chrome_driver = new ChromeDriver();
		    chrome_driver.manage().window().maximize();
		    chrome_driver.get("http://stg-ecom-magento.fuhu.org");
		
		   
			// set up safari driver
//			safari_driver = new SafariDriver();
//			safari_driver.manage().window().maximize();
//			safari_driver.get("http://stg-ecom-magento.fuhu.org");
//			
}
/*
//Firefox---
	@Test
	public void FooterPageTest_II_forFireFox() throws Exception {
		/*
		String HomePageWindowId = firefox_driver.getWindowHandle();
		assertEquals("Homepage - nabi Shop - nabi Shop", firefox_driver.getTitle());
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		WebElement warranty_firefox = firefox_driver.findElement(By.xpath(".//*[@id='footer']/div/div/div[2]/div[1]/ul/li[1]/a"));
		warranty_firefox.click();
		Set <String> allWindowId = firefox_driver.getWindowHandles();
		for(String windowId : allWindowId) {
			if(firefox_driver.switchTo().window(windowId).getTitle().contains("warrantynabi")) {
				firefox_driver.switchTo().window(windowId);
				break;
			}
		}
	    assertEquals("nabi Kids Tablets with Parental Controls - nabi Warranty nabi - Show the world what you can do", firefox_driver.getTitle());
	    try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    firefox_driver.switchTo().window(HomePageWindowId);
	    try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    assertEquals("Homepage - nabi Shop - nabi Shop", firefox_driver.getTitle());
	
	    
	    footerPageSkipSubPageTest("Homepage - nabi Shop - nabi Shop", ".//*[@id='footer']/div/div/div[2]/div[1]/ul/li[1]/a", "warrantynabi", "nabi Kids Tablets with Parental Controls - nabi Warranty nabi - Show the world what you can do", firefox_driver);
	    footerPageSkipSubPageTest("Homepage - nabi Shop - nabi Shop", ".//*[@id='footer']/div/div/div[2]/div[1]/ul/li[2]/a", "privacypolicynabi", "nabi Kid Safe Android Tablets - Fuhu Privacy Policy nabi - Show the world what you can do", firefox_driver);
	    footerPageSkipSubPageTest("Homepage - nabi Shop - nabi Shop", ".//*[@id='footer']/div/div/div[2]/div[2]/ul/li[1]/a", "Fuhu", "Fuhu", firefox_driver);
	    footerPageSkipSubPageTest("Homepage - nabi Shop - nabi Shop", ".//*[@id='footer']/div/div/div[2]/div[2]/ul/li[2]/a", "nabiInshcools", "nabi in Schools", firefox_driver);
	    footerPageSkipSubPageTest("Homepage - nabi Shop - nabi Shop", ".//*[@id='footer']/div/div/div[2]/div[2]/ul/li[3]/a", "Inspire", "nabi Inspire Learning Tablets for Kids - Overview nabi - Show the world what you can do", firefox_driver);
	
	}//end Test
*/	
//Chrome
	@Test
	public void FooterPageTest_II_forChrome() throws Exception {
		footerPageSkipSubPageTest("Homepage - nabi Shop - nabi Shop", ".//*[@id='footer']/div/div/div[2]/div[1]/ul/li[1]/a", "warrantynabi", "nabi Kids Tablets with Parental Controls - nabi Warranty nabi - Show the world what you can do", chrome_driver);
	    footerPageSkipSubPageTest("Homepage - nabi Shop - nabi Shop", ".//*[@id='footer']/div/div/div[2]/div[1]/ul/li[2]/a", "privacypolicynabi", "nabi Kid Safe Android Tablets - Fuhu Privacy Policy nabi - Show the world what you can do", chrome_driver);
	    footerPageSkipSubPageTest("Homepage - nabi Shop - nabi Shop", ".//*[@id='footer']/div/div/div[2]/div[2]/ul/li[1]/a", "Fuhu", "Fuhu", chrome_driver);
	    footerPageSkipSubPageTest("Homepage - nabi Shop - nabi Shop", ".//*[@id='footer']/div/div/div[2]/div[2]/ul/li[2]/a", "nabiInschools", "nabi in Schools", chrome_driver);
	    footerPageSkipSubPageTest("Homepage - nabi Shop - nabi Shop", ".//*[@id='footer']/div/div/div[2]/div[2]/ul/li[3]/a", "Inspire", "nabi Inspire Learning Tablets for Kids - Overview nabi - Show the world what you can do", chrome_driver);
		
	}	
@After
public void tearDown() throws Exception {
	//firefox_driver.quit();
	  chrome_driver.quit();
	//safari_driver.quit();
}

}
	    
	
		



