package com.fuhu.qa.test.SeleniumTestMaven;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;



public class FootPageUI {
	WebDriver chrome_driver;
	WebDriver firefox_driver;
	WebDriver safari_driver;
	
	@Before
	public void setUp()throws Exception {
	//set up 3 browers
		System.setProperty("webdriver.chrome.driver", "/Users/Fuhu/Desktop/chromedriver");
		chrome_driver = new ChromeDriver();
		chrome_driver.manage().window().maximize();
		chrome_driver.get("http://stg-ecom-magento.fuhu.org");
		
		firefox_driver = new FirefoxDriver();
		firefox_driver.manage().window().maximize();
		firefox_driver.get("http://stg-ecom-magento.fuhu.org");
		
		safari_driver = new SafariDriver();
		safari_driver.manage().window().maximize();
		safari_driver.get("http://stg-ecom-magento.fuhu.org");
		
		try {
			Thread.sleep(6000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}//end setUp()
	
	//assert Text
	public void assertText(String xPath, String expectedText) {
		WebElement element1 = chrome_driver.findElement(By.xpath(xPath));
		String element1Text = element1.getText();
		assertEquals(expectedText, element1Text);
        WebElement element2 = firefox_driver.findElement(By.xpath(xPath));
        String element2Text = element2.getText();
        assertEquals(expectedText, element2Text);
        WebElement element3 = safari_driver.findElement(By.xpath(xPath));
        String element3Text = element3.getText();
        assertEquals(expectedText, element3Text);
	}//end assertText()
	
	
	//assert Display
	public void assertDisplay(String xPath) {
		WebElement element1 = chrome_driver.findElement(By.xpath(xPath));
		assertTrue(element1.isDisplayed());
		WebElement element2 = firefox_driver.findElement(By.xpath(xPath));
		assertTrue(element2.isDisplayed());
		WebElement element3 = safari_driver.findElement(By.xpath(xPath));
		assertTrue(element3.isDisplayed());
	}//end assertDisplay()
	
	@Test
	
	public void FootPageUI()throws Exception {
	//assert 4 friend links display & Copyright
		//assert twitter
		assertDisplay(".//*[@id='footer']/div/div/div[2]/div[3]/ul/li[1]/a");
		//assert face-book
		assertDisplay(".//*[@id='footer']/div/div/div[2]/div[3]/ul/li[2]/a");
		//assert pinter
		assertDisplay(".//*[@id='footer']/div/div/div[2]/div[3]/ul/li[3]/a");
		//assert You-tube
		assertDisplay(".//*[@id='footer']/div/div/div[2]/div[3]/ul/li[4]/a");
		//assert Copyright
		assertDisplay(".//*[@id='footer']/div/div/div[2]/div[3]/div/p[1]");
		
	//assert Footer-page header
		assertText(".//*[@id='footer']/h1/a", "FREE SHIPPING ON ORDERS OVER $50. *DETAILS");
		
    //assert Nabi Shop Part
		assertText(".//*[@id='footer']/div/div/div[1]/div[1]/div", "NABI SHOP");
		assertText(".//*[@id='footer']/div/div/div[1]/div[1]/ul/li[1]/a", "nabi Jr");
		assertText(".//*[@id='footer']/div/div/div[1]/div[1]/ul/li[2]/a", "nabi 2");
		assertText(".//*[@id='footer']/div/div/div[1]/div[1]/ul/li[3]/a", "nabi XD");
		assertText(".//*[@id='footer']/div/div/div[1]/div[1]/ul/li[4]/a", "Headphones");
		assertText(".//*[@id='footer']/div/div/div[1]/div[1]/ul/li[5]/a", "Square HD");
	//assert Store Services Part
		assertText(".//*[@id='footer']/div/div/div[1]/div[2]/div", "STORE SERVICES");
		assertText(".//*[@id='footer']/div/div/div[1]/div[2]/ul/li[1]/a", "My Account");
		assertText(".//*[@id='footer']/div/div/div[1]/div[2]/ul/li[2]/a", "Track your order");
		assertText(".//*[@id='footer']/div/div/div[1]/div[2]/ul/li[3]/a", "Shipping Policy");
		assertText(".//*[@id='footer']/div/div/div[1]/div[2]/ul/li[4]/a", "Recycling Program");
		assertText(".//*[@id='footer']/div/div/div[1]/div[2]/ul/li[5]/a", "Affiliate Program");
		assertText(".//*[@id='footer']/div/div/div[1]/div[2]/ul/li[6]/a", "Financing");
	//assert Support Part
		assertText(".//*[@id='footer']/div/div/div[1]/div[3]/div", "SUPPORT");
		assertDisplay(".//*[@id='footer']/div/div/div[1]/div[3]/ul/li[1]/span");
		assertText(".//*[@id='footer']/div/div/div[1]/div[3]/ul/li[2]/a", "FAQ");
		assertText(".//*[@id='footer']/div/div/div[1]/div[3]/ul/li[3]/a", "Returns");
	//assert Legal
		assertText(".//*[@id='footer']/div/div/div[2]/div[1]/div", "LEGAL");
		assertText(".//*[@id='footer']/div/div/div[2]/div[1]/ul/li[1]/a", "Warranty");
		assertText(".//*[@id='footer']/div/div/div[2]/div[1]/ul/li[2]/a", "Privacy Policy");
		assertText(".//*[@id='footer']/div/div/div[2]/div[1]/ul/li[3]/a", "Terms of Service");
	//assert INFO.
		assertText(".//*[@id='footer']/div/div/div[2]/div[2]/div", "INFO");
		assertText(".//*[@id='footer']/div/div/div[2]/div[2]/ul/li[1]/a", "About Us");
		assertText(".//*[@id='footer']/div/div/div[2]/div[2]/ul/li[2]/a", "nabi in School");
		assertText(".//*[@id='footer']/div/div/div[2]/div[2]/ul/li[3]/a", "Inspire");
		
		
	
		
	
	}
	
	
	
	
	
	
	
	
@After
	public void tearDown()throws Exception {
		chrome_driver.quit();
		firefox_driver.quit();
		safari_driver.quit();
	}
	
}//end class
  
