package com.fuhu.qa.test.SeleniumTestMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeTest {
	static Thread thread = new Thread();
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/Users/Fuhu/Desktop/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev-ecom-magento.fuhu.org");
		
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		driver.close();
	}//end main
}//end class ChromeTest
