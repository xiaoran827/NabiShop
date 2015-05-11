package com.fuhu.qa.test.SeleniumTestMaven;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class Test1 {

	WebDriver driver = new FirefoxDriver();
	
	@Before
	public void setUp()throws Exception {
		driver.get("http://www.w3schools.com/html/html_forms.asp");
	}
	
	@Test
	public void testRadioButton()throws Exception {
		WebElement femaleRadioButton =
				driver.findElement(
						By.xpath("html/body/div[4]/div/div[2]/div[2]/div[1]/div/p[18]/input[2]"));
		if (! femaleRadioButton.isSelected()) {
			femaleRadioButton.click();
		}
				
		assertTrue(femaleRadioButton.isSelected());
	
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
}//end class
