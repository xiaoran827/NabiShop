package com.fuhu.qa.test.SeleniumTestMaven;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

public class FooterPageTargetContentCheck {
	WebDriver firefox_driver;
	WebDriver chrome_driver;
	WebDriver safari_driver;
	
	public void assertDisplay_firefox(String xPath) {
		
		WebElement element1 = firefox_driver.findElement(By.xpath(xPath));
		assertTrue(element1.isDisplayed());
				
	}// end assertDisplay()_firefox
	/*
	public void assertDisplay_chrome(String xPath) {

		WebElement element2 = chrome_driver.findElement(By.xpath(xPath));
		assertTrue(element2.isDisplayed());
		
	}// end assertDisplay()_chrome
	
	public void assertDisplay_safari(String xPath) {

		WebElement element2 = safari_driver.findElement(By.xpath(xPath));
		assertTrue(element2.isDisplayed());
		
	}// end assertDisplay()_safari
	*/
	
	
  @Before
  public void setUp() throws Exception {
        
        // set up firefox driver
		firefox_driver = new FirefoxDriver();
		firefox_driver.manage().window().maximize();
		firefox_driver.get("http://stg-ecom-magento.fuhu.org");
        /*
		// set up chrome_driver
	    System.setProperty("webdriver.chrome.driver","/Users/Fuhu/Desktop/chromedriver");
	    chrome_driver = new ChromeDriver();
	    chrome_driver.manage().window().maximize();
	    chrome_driver.get("http://stg-ecom-magento.fuhu.org");
	    
	    //set up safari_driver
	    safari_driver = new SafariDriver();
		safari_driver.manage().window().maximize();
		safari_driver.get("http://stg-ecom-magento.fuhu.org");
        */
}

//Firefox---
   @Test
   public void FooterPageTargetContentCheck_FireFox() throws Exception {
       //FAQ
	   WebElement FAQ_firefox = firefox_driver.findElement(By.xpath(".//*[@id='footer']/div/div/div[1]/div[3]/ul/li[2]/a"));
	   FAQ_firefox.click();
	   try {
		   Thread.sleep(5000);
	   } catch (Exception e) {
		   	e.printStackTrace();
	   }
	   assertEquals("FAQ - nabi Shop", firefox_driver.getTitle());
   
	   WebElement Top10_firefox = firefox_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/h2"));
	   String Top10_Text = Top10_firefox.getText();
	   assertEquals("Top 10 Questions about nabi Shop",Top10_Text );
	   //validate all the links in FAQ
	   WebElement Q1_firefox = firefox_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[1]/a"));
	   Q1_firefox.click();
	   try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	   assertDisplay_firefox("//*[@id=\"order-quest\"]");
	   
	   WebElement Q2_firefox = firefox_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[2]/a"));
	   Q2_firefox.click();
	   try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	   assertDisplay_firefox(".//*[@id='ship-quest']");
	   
	   WebElement Q3_firefox = firefox_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[3]/a"));
	   Q3_firefox.click();
	   try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	   assertDisplay_firefox(".//*[@id='status-quest']");
	   
	   WebElement Q4_firefox = firefox_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[4]/a"));
	   Q4_firefox.click();
	   try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	   assertDisplay_firefox(".//*[@id='return-quest']");
	   
	   WebElement Q5_firefox = firefox_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[5]/a"));
	   Q5_firefox.click();
	   try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	   assertDisplay_firefox(".//*[@id='hours-quest']");
	   
	   WebElement Q6_firefox = firefox_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[6]/a"));
	   Q6_firefox.click();
	   try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	   assertDisplay_firefox(".//*[@id='modified-quest']");
	   
	   WebElement Q7_firefox = firefox_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[7]/a"));
	   Q7_firefox.click();
	   try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	   assertDisplay_firefox(".//*[@id='credit-quest']");
	   
	   WebElement Q8_firefox = firefox_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[8]/a"));
	   Q8_firefox.click();
	   try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	   assertDisplay_firefox(".//*[@id='rates-quest']");
	   
	   WebElement Q9_firefox = firefox_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[9]/a"));
	   Q9_firefox.click();
	   try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	   assertDisplay_firefox(".//*[@id='tax-quest']");
	   
	   WebElement Q10_firefox = firefox_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[10]/a"));
	   Q10_firefox.click();
	   try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	   assertDisplay_firefox(".//*[@id='flexpay-quest']");
	   //end of 10 links on FAQ
	   //Go back to HomePage
	   WebElement nabishop_1_firefox = firefox_driver.findElement(By.xpath(".//*[@id='header']/div/div/div/h1/a/img"));
	   nabishop_1_firefox.click();
	   try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	   //Returns
	   WebElement Returns_firefox = firefox_driver.findElement(By.xpath(".//*[@id='footer']/div/div/div[1]/div[3]/ul/li[3]/a"));
	   Returns_firefox.click();
	   try {
		   Thread.sleep(5000);
	   } catch (Exception e) {
		   	e.printStackTrace();
	   }
	   assertEquals("return policy - nabi Shop", firefox_driver.getTitle());
	   assertDisplay_firefox(".//*[@id='faq-page']/div");
	   //Go back to HomePage
	   WebElement nabishop_2_firefox = firefox_driver.findElement(By.xpath(".//*[@id='header']/div/div/div/h1/a/img"));
	   nabishop_2_firefox.click();
	   try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	   //Terms of Service
	   WebElement TermsofService_firefox = firefox_driver.findElement(By.xpath(".//*[@id='footer']/div/div/div[2]/div[1]/ul/li[3]/a"));
	   TermsofService_firefox.click();
	   try {
		   Thread.sleep(5000);
	   } catch (Exception e) {
		   	e.printStackTrace();
	   }
	   assertEquals("terms and conditions - nabi Shop", firefox_driver.getTitle());
	   //TODO:
	   /*
	   WebElement nabishoplink_firefox = firefox_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div/p[1]/a"));
	   nabishoplink_firefox.click();
	   try {
		   Thread.sleep(5000);
	   } catch (Exception e) {
		   	e.printStackTrace();
	   }
	   */
	   WebElement ewaste_firefox = firefox_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div/p[13]/a[1]"));
	   ewaste_firefox.click();
	   try {
		   Thread.sleep(2000);
	   } catch (Exception e) {
		   	e.printStackTrace();
	   }
	   assertEquals("Electronic Waste Recycling Fee (Ewaste) - Board of Equalization", firefox_driver.getTitle());
	   
	   firefox_driver.navigate().back();
	   try{
		   Thread.sleep(2000);
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
	   
   }  
/*	   
//Chrome
	   @Test
	   public void FooterPageTargetContentCheck_Chrome() throws Exception {	 
	   
		   
		   WebElement FAQ_chrome = chrome_driver.findElement(By.xpath(".//*[@id='footer']/div/div/div[1]/div[3]/ul/li[2]/a"));
		   FAQ_chrome.click();
		   try {
			   Thread.sleep(5000);
		   } catch (Exception e) {
			   	e.printStackTrace();
		   }
		   assertEquals("FAQ - nabi Shop", chrome_driver.getTitle());
	   
		   WebElement Top10_chrome = chrome_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/h2"));
		   String Top10_chrome_Text = Top10_chrome.getText();
		   assertEquals("Top 10 Questions about nabi Shop",Top10_chrome_Text );
		   //validate all the links in FAQ
		   WebElement Q1_chrome = chrome_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[1]/a"));
		   Q1_chrome.click();
		   try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		   assertDisplay_chrome("//*[@id=\"order-quest\"]");
		   
		   WebElement Q2_chrome = chrome_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[2]/a"));
		   Q2_chrome.click();
		   try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		   assertDisplay_chrome(".//*[@id='ship-quest']");
		   
		   WebElement Q3_chrome = chrome_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[3]/a"));
		   Q3_chrome.click();
		   try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		   assertDisplay_chrome(".//*[@id='status-quest']");
		   
		   WebElement Q4_chrome = chrome_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[4]/a"));
		   Q4_chrome.click();
		   try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		   assertDisplay_chrome(".//*[@id='return-quest']");
		   
		   WebElement Q5_chrome = chrome_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[5]/a"));
		   Q5_chrome.click();
		   try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		   assertDisplay_chrome(".//*[@id='hours-quest']");
		   
		   WebElement Q6_chrome = chrome_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[6]/a"));
		   Q6_chrome.click();
		   try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		   assertDisplay_chrome(".//*[@id='modified-quest']");
		   
		   WebElement Q7_chrome = chrome_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[7]/a"));
		   Q7_chrome.click();
		   try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		   assertDisplay_chrome(".//*[@id='credit-quest']");
		   
		   WebElement Q8_chrome = chrome_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[8]/a"));
		   Q8_chrome.click();
		   try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		   assertDisplay_chrome(".//*[@id='rates-quest']");
		   
		   WebElement Q9_chrome = chrome_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[9]/a"));
		   Q9_chrome.click();
		   try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		   assertDisplay_chrome(".//*[@id='tax-quest']");
		   
		   WebElement Q10_chrome = chrome_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[10]/a"));
		   Q10_chrome.click();
		   try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		   assertDisplay_chrome(".//*[@id='flexpay-quest']");
}

//Safari
	   @Test
	   public void FooterPageTargetContentCheck_Safari() throws Exception {	 
	   
		   
		   WebElement FAQ_safari = safari_driver.findElement(By.xpath(".//*[@id='footer']/div/div/div[1]/div[3]/ul/li[2]/a"));
		   FAQ_safari.click();
		   try {
			   Thread.sleep(5000);
		   } catch (Exception e) {
			   	e.printStackTrace();
		   }
		   assertEquals("FAQ - nabi Shop", safari_driver.getTitle());
	   
		   WebElement Top10_safari = safari_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/h2"));
		   String Top10_safari_Text = Top10_safari.getText();
		   assertEquals("Top 10 Questions about nabi Shop",Top10_safari_Text );
		   //validate all the links in FAQ
		   WebElement Q1_safari = safari_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[1]/a"));
		   Q1_safari.click();
		   try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		   assertDisplay_safari("//*[@id=\"order-quest\"]");
		   
		   WebElement Q2_safari = safari_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[2]/a"));
		   Q2_safari.click();
		   try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		   assertDisplay_safari(".//*[@id='ship-quest']");
		   
		   WebElement Q3_safari = safari_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[3]/a"));
		   Q3_safari.click();
		   try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		   assertDisplay_safari(".//*[@id='status-quest']");
		   
		   WebElement Q4_safari = safari_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[4]/a"));
		   Q4_safari.click();
		   try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		   assertDisplay_safari(".//*[@id='return-quest']");
		   
		   WebElement Q5_safari = safari_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[5]/a"));
		   Q5_safari.click();
		   try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		   assertDisplay_safari(".//*[@id='hours-quest']");
		   
		   WebElement Q6_safari = safari_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[6]/a"));
		   Q6_safari.click();
		   try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		   assertDisplay_safari(".//*[@id='modified-quest']");
		   
		   WebElement Q7_safari = safari_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[7]/a"));
		   Q7_safari.click();
		   try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		   assertDisplay_safari(".//*[@id='credit-quest']");
		   
		   WebElement Q8_safari = safari_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[8]/a"));
		   Q8_safari.click();
		   try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		   assertDisplay_safari(".//*[@id='rates-quest']");
		   
		   WebElement Q9_safari = safari_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[9]/a"));
		   Q9_safari.click();
		   try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		   assertDisplay_safari(".//*[@id='tax-quest']");
		   
		   WebElement Q10_safari = safari_driver.findElement(By.xpath(".//*[@id='faq-page']/div/div[1]/ul/li[10]/a"));
		   Q10_safari.click();
		   try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		   assertDisplay_safari(".//*[@id='flexpay-quest']");
}
*/
   
   
@After
   public void tearDown() throws Exception {
   	  firefox_driver.quit();
//    chrome_driver.quit();
// 	  safari_driver.quit();
   }

   }
   	    