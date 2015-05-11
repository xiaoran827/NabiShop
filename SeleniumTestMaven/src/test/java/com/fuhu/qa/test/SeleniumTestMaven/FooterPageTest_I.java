package com.fuhu.qa.test.SeleniumTestMaven;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FooterPageTest_I {
	WebDriver chrome_driver;
	WebDriver firefox_driver;
	WebDriver safari_driver;

	@Before
	public void setUp() throws Exception {
        
		// set up firefox driver
		firefox_driver = new FirefoxDriver();
		firefox_driver.manage().window().maximize();
		firefox_driver.get("http://stg-ecom-magento.fuhu.org");
       
		
		// set up chrome_driver
	    System.setProperty("webdriver.chrome.driver","/Users/Fuhu/Desktop/chromedriver");
	    chrome_driver = new ChromeDriver();
		chrome_driver.manage().window().maximize();
	    chrome_driver.get("http://stg-ecom-magento.fuhu.org");
	
	   
		// set up safari driver
		safari_driver = new SafariDriver();
		safari_driver.manage().window().maximize();
		safari_driver.get("http://stg-ecom-magento.fuhu.org");
        
	}
	  
	
	// Firefox---FAQ, Returns,Terms and Conditions, ShippingPolicy
	@Test
	public void FooterPageTestforFireFox() throws Exception {
		WebElement FAQ_firefox = firefox_driver.findElement(By.xpath(".//*[@id='footer']/div/div/div[1]/div[3]/ul/li[2]/a"));
		FAQ_firefox.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("FAQ - nabi Shop", firefox_driver.getTitle());

		WebElement nabishop_firefox = firefox_driver.findElement(By.xpath(".//*[@id='header']/div/div/div/h1/a/img"));
		nabishop_firefox.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("Homepage - nabi Shop - nabi Shop", firefox_driver.getTitle());
	    
	    WebElement Returns_firefox = firefox_driver.findElement(By.xpath(".//*[@id='footer']/div/div/div[1]/div[3]/ul/li[3]/a"));
		Returns_firefox.click(); 
		try { Thread.sleep(3000); 
	    }catch(Exception e) { 
			  e.printStackTrace(); 
	    }
	    assertEquals("return policy - nabi Shop",firefox_driver.getTitle());
		
	    WebElement nabishop_1_firefox = firefox_driver.findElement(By.xpath(".//*[@id='header']/div/div/div/h1/a/img"));
	    nabishop_1_firefox.click();  
	    try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    assertEquals("Homepage - nabi Shop - nabi Shop",firefox_driver.getTitle());
	 
	    WebElement TermsandConditions_firefox = firefox_driver.findElement(By.xpath(".//*[@id='footer']/div/div/div[2]/div[1]/ul/li[3]/a"));
	    TermsandConditions_firefox.click();
	    try { Thread.sleep(3000); 
	    }catch(Exception e) { 
			  e.printStackTrace(); 
	    }
	    assertEquals("terms and conditions - nabi Shop",firefox_driver.getTitle());	
	    
	    WebElement nabishop_2_firefox = firefox_driver.findElement(By.xpath(".//*[@id='header']/div/div/div/h1/a/img"));
	    nabishop_2_firefox.click();  
	    try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    assertEquals("Homepage - nabi Shop - nabi Shop",firefox_driver.getTitle());
	    
	    WebElement ShippingPolicy_firefox = firefox_driver.findElement(By.xpath(".//*[@id='footer']/div/div/div[1]/div[2]/ul/li[3]/a"));
	    ShippingPolicy_firefox.click();
	    try { Thread.sleep(3000); 
	    }catch(Exception e) { 
			  e.printStackTrace(); 
	    }
	    assertEquals("shipping policy - nabi Shop",firefox_driver.getTitle());	
	    }
	
	
    
	// Safari
	@Test
	public void FooterPageTestforSafari() throws Exception {
		WebElement FAQ_safari = safari_driver.findElement(By.xpath(".//*[@id='footer']/div/div/div[1]/div[3]/ul/li[2]/a"));
		FAQ_safari.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("FAQ - nabi Shop", safari_driver.getTitle());
		WebElement nabishop_safari = safari_driver.findElement(By.xpath(".//*[@id='header']/div/div/div/h1/a/img"));
		nabishop_safari.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("Homepage - nabi Shop - nabi Shop",safari_driver.getTitle());
	
        WebElement Returns_safari = safari_driver.findElement(By.xpath(".//*[@id='footer']/div/div/div[1]/div[3]/ul/li[3]/a"));
		Returns_safari.click(); 
		try { Thread.sleep(3000); 
		}catch(Exception e) { 
			  e.printStackTrace(); 
	    }
		assertEquals("return policy - nabi Shop",safari_driver.getTitle());
		WebElement nabishop_1_safari = safari_driver.findElement(By.xpath(".//*[@id='header']/div/div/div/h1/a/img"));
		nabishop_1_safari.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("Homepage - nabi Shop - nabi Shop",safari_driver.getTitle());
	
		WebElement TermsandConditions_safari = safari_driver.findElement(By.xpath(".//*[@id='footer']/div/div/div[2]/div[1]/ul/li[3]/a"));
	    TermsandConditions_safari.click();
	    try { Thread.sleep(3000); 
	    }catch(Exception e) { 
			  e.printStackTrace(); 
	    }
	    assertEquals("terms and conditions - nabi Shop",safari_driver.getTitle());
	    WebElement nabishop_2_safari = safari_driver.findElement(By.xpath(".//*[@id='header']/div/div/div/h1/a/img"));
		nabishop_2_safari.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("Homepage - nabi Shop - nabi Shop",safari_driver.getTitle());
		
		WebElement ShippingPolicy_safari = safari_driver.findElement(By.xpath(".//*[@id='footer']/div/div/div[1]/div[2]/ul/li[3]/a"));
		ShippingPolicy_safari.click();
	    try { Thread.sleep(3000); 
	    }catch(Exception e) { 
			  e.printStackTrace(); 
	    }
	    assertEquals("shipping policy - nabi Shop",safari_driver.getTitle());
		
}
   
    
	//Chrome
	@Test
	public void FooterPageTestforChrome() throws Exception {
		WebElement FAQ_chrome = chrome_driver.findElement(By.xpath(".//*[@id='footer']/div/div/div[1]/div[3]/ul/li[2]/a"));
		FAQ_chrome.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("FAQ - nabi Shop", chrome_driver.getTitle());
		WebElement nabishop_chrome = chrome_driver.findElement(By.xpath(".//*[@id='header']/div/div/div/h1/a/img"));
		nabishop_chrome.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("Homepage - nabi Shop - nabi Shop",chrome_driver.getTitle());
	
		WebElement Returns_chrome = chrome_driver.findElement(By.xpath(".//*[@id='footer']/div/div/div[1]/div[3]/ul/li[3]/a"));
		Returns_chrome.click(); 
		try { Thread.sleep(3000); 
		}catch(Exception e) { 
			  e.printStackTrace(); 
	    }
		assertEquals("return policy - nabi Shop",chrome_driver.getTitle());
		
		WebElement nabishop_1_chrome = chrome_driver.findElement(By.xpath(".//*[@id='header']/div/div/div/h1/a/img"));
		nabishop_1_chrome.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("Homepage - nabi Shop - nabi Shop",chrome_driver.getTitle());
	    
		WebElement TermsandConditions_chrome = chrome_driver.findElement(By.xpath(".//*[@id='footer']/div/div/div[2]/div[1]/ul/li[3]/a"));
		TermsandConditions_chrome.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("terms and conditions - nabi Shop",chrome_driver.getTitle());
		
		WebElement nabishop_2_chrome = chrome_driver.findElement(By.xpath(".//*[@id='header']/div/div/div/h1/a/img"));
		nabishop_2_chrome.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("Homepage - nabi Shop - nabi Shop",chrome_driver.getTitle());
		
        WebElement ShippingPolicy_chrome = chrome_driver.findElement(By.xpath(".//*[@id='footer']/div/div/div[1]/div[2]/ul/li[3]/a"));
		ShippingPolicy_chrome.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("shipping policy - nabi Shop",chrome_driver.getTitle());
		
		
	}
   
	
	
	@After
	public void tearDown() throws Exception {
       
		firefox_driver.quit();
		
		safari_driver.quit();
	
		chrome_driver.quit();
       
	}
}

