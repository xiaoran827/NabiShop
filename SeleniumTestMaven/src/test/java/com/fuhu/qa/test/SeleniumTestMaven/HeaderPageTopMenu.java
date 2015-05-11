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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class HeaderPageTopMenu {

	WebDriver firefox_driver;
	WebDriver chrome_driver;
	WebDriver safari_driver;
	
	@Before
	public void setUp()throws Exception {
		
		//set up chrome_driver
		System.setProperty("webdriver.chrome.driver", "/Users/Fuhu/Desktop/chromedriver");
		chrome_driver = new ChromeDriver();
		chrome_driver.manage().window().maximize();
		chrome_driver.get("http://dev-ecom-magento.fuhu.org");
		
		//set up firefox driver
		firefox_driver = new FirefoxDriver();
		firefox_driver.manage().window().maximize();
		firefox_driver.get("http://dev-ecom-magento.fuhu.org");
		
		//set up safari driver
		safari_driver = new SafariDriver();
		safari_driver.manage().window().maximize();
		safari_driver.get("http://dev-ecom-magento.fuhu.org");
		
	}//end setUp()
	
	@Test
	public void HeadPageTopMenu()throws Exception {
		
		
		
//		//test tab---nabi tablets                              
//		WebElement NABI_TABLETS = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[2]/a/span"));
//		
//		assertTrue(NABI_TABLETS.isDisplayed());
//		
//		//hover tab
//		Actions builder1 = new Actions(driver);    
//		builder1.moveToElement( NABI_TABLETS ).click( NABI_TABLETS ).perform();    
//		try {
//			Thread.sleep(5000);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		
//		//assert NabiJr.img Existence
//		WebElement NabiJr_img = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[1]/ul/a[1]/img"));
//		
//		assertTrue(NabiJr_img.isDisplayed());
//		
//		//assert Nabi JR. Store
//		WebElement Nabi_JR_Store = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[1]/ul/a[2]/h2"));
//		
//		String Nabi_JR_STOREText = Nabi_JR_Store.getText();
//		assertEquals("NABI JR. STORE", Nabi_JR_STOREText);
//		
//		//assert Nabi Jr.
//		WebElement Nabi_Jr = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[1]/ul/li[1]/a"));
//		
//		String Nabi_JrText = Nabi_Jr.getText();
//		assertEquals("nabi Jr.", Nabi_JrText);
//		
//		
//		//assert nick Jr. Edition
//        WebElement nick_Jr_Edition = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[1]/ul/li[2]/a"));
//		
//		String nick_Jr_EditionText = nick_Jr_Edition.getText();
//		assertEquals("nick Jr. Edition", nick_Jr_EditionText);
//		
//		
//		//assert Nabi2 img Existence
//	    WebElement Nabi2_img = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[2]/ul/a[1]/img"));
//				
//	    assertTrue(Nabi2_img.isDisplayed());
//		
//	    //assert Nabi 2 Store
//	    WebElement Nabi_2_Store = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[2]/ul/a[2]/h2"));
//	  		
//	    String Nabi_2_StoreText = Nabi_2_Store.getText();
//	    assertEquals("NABI 2 STORE", Nabi_2_StoreText);
//		
//	    //assert nabi 2S
//	    WebElement nabi_2S = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[2]/ul/li[1]/a"));
//	  		
//	  	String nabi_2SText = nabi_2S.getText();
//	  	assertEquals("nabi 2S", nabi_2SText);
//	  		
//	    //assert Disney Bundle
//	  	WebElement Disney_Bundle = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[2]/ul/li[2]/a"));
//  		
//	  	String Disney_BundleText = Disney_Bundle.getText();
//	  	assertEquals("Disney Bundle", Disney_BundleText);
//	  	
//		
//		//assert Nabi XD img Existence
//		WebElement Nabi_XD_img = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[3]/ul/a[1]/img"));
//		
//	    assertTrue(Nabi_XD_img.isDisplayed());
//	    
//	    //assert Nabi XD Store
//	    WebElement Nabi_XD_Store = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[3]/ul/a[2]/h2"));
//	  		
//	    String Nabi_XD_StoreText = Nabi_XD_Store.getText();
//	    assertEquals("NABI XD STORE", Nabi_XD_StoreText);
//	    
//	    //assert Nabi XD 32GB
//	    WebElement Nabi_XD_32GB = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[3]/ul/li[1]/a"));
//  		
//	    String Nabi_XD_32GBText = Nabi_XD_32GB.getText();
//	    assertEquals("nabi XD 32GB", Nabi_XD_32GBText);
//	    
//	    //assert Nabi XD 16GB
//        WebElement Nabi_XD_16GB = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[3]/ul/li[2]/a"));
//  		
//	    String Nabi_XD_16GBText = Nabi_XD_16GB.getText();
//	    assertEquals("nabi XD 16GB", Nabi_XD_16GBText);
//	    
//		
//		//assert Nabi Dreamtab img Existence
//        WebElement Nabi_Dreamtab_img = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[4]/ul/a[1]/img"));
//		
//	    assertTrue(Nabi_Dreamtab_img.isDisplayed());
//	  	
//	    //assert Nabi Dreamtab Store
//	    WebElement Nabi_Dreamtab_Store = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[4]/ul/a[2]/h2"));
//  		
//	    String Nabi_Dreamtab_StoreText = Nabi_Dreamtab_Store.getText();
//	    assertEquals("NABI DREAMTAB STORE", Nabi_Dreamtab_StoreText);
//	    
//	    //assert nabi DreamTab HD8
//        WebElement Nabi_Dreamtab_HD8 = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[4]/ul/li/a"));
//  		
//	    String Nabi_Dreamtab_HD8Text = Nabi_Dreamtab_HD8.getText();
//	    assertEquals("nabi DreamTab HD8", Nabi_Dreamtab_HD8Text);
//	    
//	    //test tab---Nabi BigTab
//	    WebElement Nabi_Big_Tab = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[3]/a/span"));
//	  	assertTrue(Nabi_Big_Tab.isDisplayed());
//	  	
//	  	//hover tab
//	  	Actions builder2 = new Actions(driver);    
//	  	builder2.moveToElement( Nabi_Big_Tab ).click( Nabi_Big_Tab ).perform();    
//	  	try {
//	  	Thread.sleep(5000);
//	  	}catch(Exception e) {
//	  			e.printStackTrace();
//	  	}
//	  	
//	  	//assert Nabi Big Tab img Existence
//        WebElement Nabi_Big_Tab_img = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[3]/ul/li/ul/a[1]/img"));
//		
//	    assertTrue(Nabi_Big_Tab_img.isDisplayed());
//	    
//	    //assert Nabi Big Tab Store
//	    WebElement Nabi_Big_Tab_Store = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[3]/ul/li/ul/a[2]/h2"));
//  		
//	    String Nabi_Big_Tab_StoreText = Nabi_Big_Tab_Store.getText();
//	    assertEquals("NABI BIG TAB STORE", Nabi_Big_Tab_StoreText);
//	    
//	    //assert nabi Big Tab HD 20"
//        WebElement Nabi_Big_Tab_HD_20 = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[3]/ul/li/ul/li[1]/a"));
//  		
//	    String Nabi_Big_Tab_HD_20Text = Nabi_Big_Tab_HD_20.getText();
//	    assertEquals("nabi Big Tab HD 20\"", Nabi_Big_Tab_HD_20Text);
//		
//	    //assert nabi Big Tab HD 24"
//        WebElement Nabi_Big_Tab_HD_24 = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[3]/ul/li/ul/li[2]/a"));
//  		
//	    String Nabi_Big_Tab_HD_24Text = Nabi_Big_Tab_HD_24.getText();
//	    assertEquals("nabi Big Tab HD 24\"", Nabi_Big_Tab_HD_24Text);
//	    
//		
//		//test tab---Audio & Video
//	    WebElement Audio_and_Video = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[4]/a/span"));
//				
//	    assertTrue(Audio_and_Video.isDisplayed());
//				
//		//hover tab
//	    Actions builder3 = new Actions(driver);    
//	    builder3.moveToElement( Audio_and_Video ).click( Audio_and_Video ).perform();    
//		try {
//		Thread.sleep(5000);
//		}catch(Exception e) {
//		e.printStackTrace();
//		}
//			
//		//assert headphones img Existence
//        WebElement Nabi_Headphones_img = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[1]/ul/a[1]/img"));
//		
//	    assertTrue(Nabi_Headphones_img.isDisplayed());
//		
//	    //assert nabi headphones store
//        WebElement Nabi_Headphones_Store = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[1]/ul/a[2]/h2"));
//  		String Nabi_Headphones_StoreText = Nabi_Headphones_Store.getText();
//	    assertEquals("NABI HEADPHONES STORE", Nabi_Headphones_StoreText);
//	    
//	    //assert nabi Headphones
//        WebElement Nabi_Headphones = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[1]/ul/li[1]/a"));
//  	    String Nabi_HeadphonesText = Nabi_Headphones.getText();
//	    assertEquals("nabi Headphones", Nabi_HeadphonesText);
//	    
//	    //assert Accessories
//        WebElement Accessories = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[1]/ul/li[2]/a"));
//  	    String AccessoriesText = Accessories.getText();
//	    assertEquals("Accessories", AccessoriesText);
//	    
//	    //assert karaoke box img Existence
//        WebElement karaoke_box_img = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[2]/ul/a[1]/img"));
//		assertTrue(karaoke_box_img.isDisplayed());
//		
//		//assert nabi karaoke box store
//		WebElement Nabi_karaoke_box_Store = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[2]/ul/a[2]/h2"));
//  		String Nabi_karaoke_box_StoreText = Nabi_karaoke_box_Store.getText();
//	    assertEquals("NABI KARAOKE BOX STORE", Nabi_karaoke_box_StoreText);
//	    
//	    //assert nabi karaoke box
//	    WebElement Nabi_karaoke_box = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[2]/ul/li[1]/a"));
//  		String Nabi_karaoke_boxText = Nabi_karaoke_box.getText();
//	    assertEquals("nabi Karaoke Box", Nabi_karaoke_boxText);
//	    
//	    //assert Accessories
//	    WebElement Accessories_2 = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[2]/ul/li[2]/a"));
//  	    String Accessories_2Text = Accessories_2.getText();
//	    assertEquals("Accessories", Accessories_2Text);
//	    
//	    //assert Square HD img Existence
//	    WebElement square_HD_img = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[3]/ul/a[1]/img"));
//		assertTrue(square_HD_img.isDisplayed());
//	    
//		//assert nabi square HD store
//		WebElement Nabi_square_HD_Store = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[3]/ul/a[2]/h2"));
//  		String Nabi_square_HD_StoreText = Nabi_square_HD_Store.getText();
//	    assertEquals("NABI SQUARE HD STORE", Nabi_square_HD_StoreText);
//		
//	    //assert nabi square
//	    WebElement Nabi_square_HD = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[3]/ul/li[1]/a"));
//  		String Nabi_square_HDText = Nabi_square_HD.getText();
//	    assertEquals("nabi Square HD", Nabi_square_HDText);
//		
//	    //assert Accessories
//	    WebElement Accessories_3 = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[3]/ul/li[2]/a"));
//  	    String Accessories_3Text = Accessories_3.getText();
//	    assertEquals("Accessories", Accessories_3Text);
//		
//		
//	    //test tab---Accessories
//	    WebElement ACCESSORIES = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[5]/a/span"));
//				
//	    assertTrue(ACCESSORIES.isDisplayed());
//				
//	    //hover tab
//		Actions builder4 = new Actions(driver);    
//		builder4.moveToElement( ACCESSORIES ).click( ACCESSORIES ).perform();    
//		try {
//		Thread.sleep(5000);
//		}catch(Exception e) {
//		e.printStackTrace();
//	    }
//		
//		//assert nabi JR img Existence
//		WebElement Nabi_JR_1_img = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[1]/ul/a[1]/img"));
//		assertTrue(Nabi_JR_1_img.isDisplayed());
//		
//	    //assert nabi JR store
//        WebElement Nabi_JR_Store_1 = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[1]/ul/a[2]/h2"));
//		
//		String Nabi_JR_STORE_1Text = Nabi_JR_Store_1.getText();
//		assertEquals("NABI JR. STORE", Nabi_JR_STORE_1Text);
//		
//        //assert personalize_1
//		WebElement personalize_1 = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[1]/ul/li[1]/a"));
//  		String personalize_1Text = personalize_1.getText();
//	    assertEquals("Personalize", personalize_1Text);
//	    
//	    //assert Travel_1
//	    WebElement Travel_1 = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[1]/ul/li[2]/a"));
//  		String Travel_1Text = Travel_1.getText();
//	    assertEquals("Travel", Travel_1Text);
//	    
//	    //assert Solutions_1
//	    WebElement Solutions_1 = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[1]/ul/li[3]/a"));
//  		String Solutions_1Text = Solutions_1.getText();
//	    assertEquals("Solutions", Solutions_1Text);
//	    
//	    //assert nabi 2 img Existence
//	    WebElement Nabi_2_1_img = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[2]/ul/a[1]/img"));
//	  	assertTrue(Nabi_2_1_img.isDisplayed());
//	  		
//	  	//assert nabi 2 store
//	    WebElement Nabi_2_Store_1 = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[2]/ul/a[2]/h2"));
//	  	String Nabi_2_STORE_1Text = Nabi_2_Store_1.getText();
//	  	assertEquals("NABI 2 STORE", Nabi_2_STORE_1Text);
//	  		
//	    //assert personalize_2
//	  	WebElement personalize_2 = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[2]/ul/li[1]/a"));
//	    String personalize_2Text = personalize_2.getText();
//	  	assertEquals("Personalize", personalize_2Text);
//	  	    
//	  	//assert Travel_2
//	  	WebElement Travel_2 = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[2]/ul/li[2]/a"));
//	    String Travel_2Text = Travel_2.getText();
//	  	assertEquals("Travel", Travel_2Text);
//	  	    
//	  	//assert Solutions_2
//	    WebElement Solutions_2 = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[2]/ul/li[3]/a"));
//	    String Solutions_2Text = Solutions_2.getText();
//	  	assertEquals("Solutions", Solutions_2Text);
//	  	
//	  	
//	  	//assert Nabi XD img Existence
//	  	WebElement Nabi_XD_1_img = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[3]/ul/a[1]/img"));
//	  	assertTrue(Nabi_XD_1_img.isDisplayed());
//	  	
//	  	//assert nabi XD store
//	  	WebElement Nabi_XD_Store_1 = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[3]/ul/a[2]/h2"));
//	  	String Nabi_XD_Store_1Text = Nabi_XD_Store_1.getText();
//	  	assertEquals("NABI XD STORE", Nabi_XD_Store_1Text);
//	  	
//	  	//assert Travel_3
//	  	WebElement Travel_3 = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[3]/ul/li[1]/a"));
//	    String Travel_3Text = Travel_3.getText();
//	  	assertEquals("Travel", Travel_3Text);
//	    
//	  	//assert Solution_3
//	  	WebElement Solutions_3 = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[3]/ul/li[2]/a"));
//	    String Solutions_3Text = Solutions_3.getText();
//	  	assertEquals("Solutions", Solutions_3Text);
//	  	
//	  	//assert Nabi Dreamtab img Existence
//	  	WebElement Nabi_Dreamtab_1_img = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[4]/ul/a[1]/img"));
//	  	assertTrue(Nabi_Dreamtab_1_img.isDisplayed());
//	  	
//	  	//assert nabi Dreamtab Store
//	  	WebElement Nabi_Dreamtab_Store_1 = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[4]/ul/a[2]/h2"));
//	  	String Nabi_Dreamtab_Store_1Text = Nabi_Dreamtab_Store_1.getText();
//	  	assertEquals("NABI DREAMTAB STORE", Nabi_Dreamtab_Store_1Text);
//	  	
//	  	//assert Personalize_3
//	  	WebElement personalize_3 = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[4]/ul/li[1]/a"));
//	    String personalize_3Text = personalize_3.getText();
//	  	assertEquals("Personalize", personalize_3Text);
//	  	
//	  	//assert Travel_4
//	  	WebElement Travel_4 = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[4]/ul/li[2]/a"));
//	    String Travel_4Text = Travel_4.getText();
//	  	assertEquals("Travel", Travel_4Text);
//	  	
//	  	//assert Solution_4
//	  	WebElement Solutions_4 = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[4]/ul/li[3]/a"));
//	    String Solutions_4Text = Solutions_4.getText();
//	  	assertEquals("Solutions", Solutions_4Text);
//	  	
//	  	//assert Nabi Big Tab img Existence
//	  	WebElement Nabi_Big_Tab_1_img = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[5]/ul/a[1]/img"));
//	  	assertTrue(Nabi_Big_Tab_1_img.isDisplayed());
//	  	
//	  	//assert Nabi Big Tab Store
//	  	WebElement Nabi_Big_Tab_Store_1 = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[5]/ul/a[2]/h2"));
//	  	String Nabi_Big_Tab_Store_1Text = Nabi_Big_Tab_Store_1.getText();
//	  	assertEquals("NABI BIG TAB STORE", Nabi_Big_Tab_Store_1Text);
//	  	
//	  	//assert Accessories
//	  	WebElement Accessories_4 = driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[5]/ul/li/a"));
//  	    String Accessories_4Text = Accessories_4.getText();
//	    assertEquals("Accessories", Accessories_4Text);
//	  
//	   
		//*[@id="nav"]/div/nav/ul/li[2]/a/span
		//WebElement NABI_TABLETS = chrome_driver.findElement(By.xpath("//*[@id=\"nav\"]/div/nav/ul/li[2]/a/span"));
		//assertTrue(NABI_TABLETS.isDisplayed());
		
		//WebElement NABI_TABLETS1 = firefox_driver.findElement(By.xpath("//*[@id=\"nav\"]/div/nav/ul/li[2]/a/span"));
		//assertTrue(NABI_TABLETS1.isDisplayed());
		
		assertDisplay("//*[@id=\"nav\"]/div/nav/ul/li[2]/a/span");
		
	    //test tab---Products We love                                    
	    //WebElement Products_We_Love = chrome_driver.findElement(By.xpath(".//*[@id='nav']/div/nav/ul/li[6]/a/span"));
				
	    //assertTrue(Products_We_Love.isDisplayed());
			
	    /*
	    //hover tab
		Actions builder5 = new Actions(chrome_driver);    
		builder5.moveToElement( Products_We_Love ).click( Products_We_Love ).perform();    
		try {
		Thread.sleep(5000);
		}catch(Exception e) {
		e.printStackTrace();
	    }
	    */
	    
	  	
}//end test()

	
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
	
	
	public void assertDisplay(String xPath) {
		WebElement element1 = chrome_driver.findElement(By.xpath(xPath));
		assertTrue(element1.isDisplayed());
		
		WebElement element2 = firefox_driver.findElement(By.xpath(xPath));
		assertTrue(element2.isDisplayed());
		
		WebElement element3 = safari_driver.findElement(By.xpath(xPath));
		assertTrue(element3.isDisplayed());
	}//end assertDisplay()
	
	
	@After
	public void tearDown() throws Exception {
		//chrome_driver.quit();
		//firefox_driver.quit();
		//safari_driver.quit();
	}
	
}//end class

		
		
		
		
		
		
		
		
		
		
		

	
