package com.fuhu.qa.test.SeleniumTestMaven;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.safari.SafariDriver;


public class SafariTest {

	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		driver.get("http://dev-ecom-magento.fuhu.org");
		System.out.println("title is: " + driver.getTitle());
		
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		driver.close();
	}

}
