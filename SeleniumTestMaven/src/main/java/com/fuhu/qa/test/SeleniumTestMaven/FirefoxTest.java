package com.fuhu.qa.test.SeleniumTestMaven;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://dev-ecom-magento.fuhu.org");
		System.out.println("title is: " + driver.getTitle());
		
		
		
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		driver.close();
		
	}//end main
}//end class FirefoxTest
