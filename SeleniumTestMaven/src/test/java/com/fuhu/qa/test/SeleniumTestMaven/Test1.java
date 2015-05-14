package com.fuhu.qa.test.SeleniumTestMaven;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class Test1 {
      WebDriver safari_driver;
	  
	  


@Before
public void setUp() throws Exception {
	// set up safari driver
	safari_driver = new SafariDriver();
	safari_driver.manage().window().maximize();
	safari_driver.get("http://stg-ecom-magento.fuhu.org");


}

@Test
public void Test1_safari() throws Exception {
	
	String HomePageWindowId = safari_driver.getWindowHandle();
	assertEquals("Homepage - nabi Shop - nabi Shop", safari_driver.getTitle());
	try {
		Thread.sleep(10000);
    } catch (Exception e) {
		e.printStackTrace();
	}
	WebElement warranty_safari = safari_driver.findElement(By.xpath(".//*[@id='footer']/div/div/div[2]/div[1]/ul/li[1]/a"));
	warranty_safari.click();
	Set <String> allWindowId = safari_driver.getWindowHandles();
	for(String windowId : allWindowId) {
		if(safari_driver.switchTo().window(windowId).getTitle().contains("warrantynabi")) {
			safari_driver.switchTo().window(windowId);
			break;
		}
	}
    assertEquals("nabi Kids Tablets with Parental Controls - nabi Warranty nabi - Show the world what you can do", safari_driver.getTitle());
    try {
		Thread.sleep(10000);
	} catch (Exception e) {
		e.printStackTrace();
	}
//    safari_driver.switchTo().window(HomePageWindowId);
//    try {
//		Thread.sleep(10000);
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//    assertEquals("Homepage - nabi Shop - nabi Shop", safari_driver.getTitle());
//    
}
	
	
@After
public void tearDown() throws Exception {
	
	
	safari_driver.quit();
}

}
	    











