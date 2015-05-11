import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class HomePageUIExample {

	WebDriver chrome_driver;
	WebDriver firefox_driver;
	WebDriver safari_driver;

	@Before
	public void setUp() throws Exception {
		// set up chrome_driver
		System.setProperty("webdriver.chrome.driver",
				"/Users/Fuhu/Desktop/chromedriver");
		chrome_driver = new ChromeDriver();
		chrome_driver.manage().window().maximize();
		chrome_driver.get("http://stg-ecom-magento.fuhu.org");

		// set up firefox driver
		firefox_driver = new FirefoxDriver();
		firefox_driver.manage().window().maximize();
		firefox_driver.get("http://stg-ecom-magento.fuhu.org");

		// set up safari driver
		safari_driver = new SafariDriver();
		safari_driver.manage().window().maximize();
		safari_driver.get("http://stg-ecom-magento.fuhu.org");

		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// end setUp()

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

	}// end assertText()

	public void assertDisplay(String xPath) {
		WebElement element1 = chrome_driver.findElement(By.xpath(xPath));
		assertTrue(element1.isDisplayed());

		WebElement element2 = firefox_driver.findElement(By.xpath(xPath));
		assertTrue(element2.isDisplayed());

		WebElement element3 = safari_driver.findElement(By.xpath(xPath));
		assertTrue(element3.isDisplayed());

	}// end assertDisplay()

	public void hoverTab(String xPath) throws Exception {
		// firefox
		WebElement element_firefox = firefox_driver
				.findElement(By.xpath(xPath));
		String mouseOverScript_firefox = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
		JavascriptExecutor js_firefox = (JavascriptExecutor) firefox_driver;
		js_firefox.executeScript(mouseOverScript_firefox, element_firefox);

		// chrome
		WebElement element_chrome = chrome_driver.findElement(By.xpath(xPath));
		String mouseOverScript_chrome = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
		JavascriptExecutor js_chrome = (JavascriptExecutor) chrome_driver;
		js_chrome.executeScript(mouseOverScript_chrome, element_chrome);

		// safari
		WebElement element_safari = safari_driver.findElement(By.xpath(xPath));
		String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
		JavascriptExecutor js = (JavascriptExecutor) safari_driver;
		js.executeScript(mouseOverScript, element_safari);

		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// end hoverTab()

	public void scrollDown() {
		// chrome scroll down
		JavascriptExecutor jse_chrome = (JavascriptExecutor) chrome_driver;
		jse_chrome.executeScript("window.scrollBy(0,1200)", "");

		// firefox scroll down
		JavascriptExecutor jse_firefox = (JavascriptExecutor) firefox_driver;
		jse_firefox.executeScript("window.scrollBy(0,1200)", "");

		// safari scroll down
		JavascriptExecutor jse_safari = (JavascriptExecutor) safari_driver;
		jse_safari.executeScript("window.scrollBy(0,1200)", "");

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// end scrollDown

	@Test
	public void homePageUIExample() throws Exception {
		// Nabi-shop
		assertDisplay(".//*[@id='header']/div/div/div/h1/a/img");
		// 1-855-363-NABI
		assertDisplay(".//*[@id='header']/div/div/ul[1]/li[1]");
		// Support
		assertText(".//*[@id='header']/div/div/ul[1]/li[2]/a", "SUPPORT");
		// My Account
		assertText(".//*[@id='header']/div/div/ul[1]/li[3]/a", "MY ACCOUNT");
		// Shopping Bag
		assertText(".//*[@id='header']/div/div/ul[2]/li[1]/a/span",
				"SHOPPING BAG");
		// PayOverTime
		assertText(".//*[@id='top']/body/div[1]/div[2]/div[1]/div/p/a/strong",
				"PAY OVER TIME.");
		// PayOverTime-text
		assertText(
				".//*[@id='top']/body/div[1]/div[2]/div[1]/div/p/a",
				"PAY OVER TIME. NABI THREE SIX TWELVE FLEXPAY ON ORDERS $99.99 AND OVER. *DETAILS");

		// Header Page UI
		hoverTab(".//*[@id='nav']/div/nav/ul/li[2]/a/span");
		// assert Nabi Jr. Store
		assertDisplay(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[1]/ul/a[1]/img");
		assertText(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[1]/ul/a[2]/h2",
				"NABI JR. STORE");
		assertText(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[1]/ul/li[1]/a",
				"nabi Jr.");
		assertText(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[1]/ul/li[2]/a",
				"nick Jr. Edition");
		// assert Nabi 2 Store
		assertDisplay(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[2]/ul/a[1]/img");
		assertText(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[2]/ul/a[2]/h2",
				"NABI 2 STORE");
		assertText(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[2]/ul/li[1]/a",
				"nabi 2S");
		assertText(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[2]/ul/li[2]/a",
				"Disney Bundle");
		// assert Nabi XD Store
		assertDisplay(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[3]/ul/a[1]/img");
		assertText(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[3]/ul/a[2]/h2",
				"NABI XD STORE");
		assertText(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[3]/ul/li[1]/a",
				"nabi XD 32GB");
		assertText(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[3]/ul/li[2]/a",
				"nabi XD 16GB");
		// assert Nabi Dreamtab Store
		assertDisplay(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[4]/ul/a[1]/img");
		assertText(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[4]/ul/a[2]/h2",
				"NABI DREAMTAB STORE");
		assertText(".//*[@id='nav']/div/nav/ul/li[2]/ul/li[4]/ul/li/a",
				"nabi DreamTab HD8");

		hoverTab(".//*[@id='nav']/div/nav/ul/li[3]/a/span");
		// assert Nabi Big Tab
		assertDisplay(".//*[@id='nav']/div/nav/ul/li[3]/ul/li/ul/a[1]/img");
		assertText(".//*[@id='nav']/div/nav/ul/li[3]/ul/li/ul/a[2]/h2",
				"NABI BIG TAB STORE");
		assertText(".//*[@id='nav']/div/nav/ul/li[3]/ul/li/ul/li[1]/a",
				"nabi Big Tab HD 20\"");
		assertText(".//*[@id='nav']/div/nav/ul/li[3]/ul/li/ul/li[2]/a",
				"nabi Big Tab HD 24\"");

		hoverTab(".//*[@id='nav']/div/nav/ul/li[4]/a/span");
		// assert headphones
		assertDisplay(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[1]/ul/a[1]/img");
		assertText(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[1]/ul/a[2]/h2",
				"NABI HEADPHONES STORE");
		assertText(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[1]/ul/li[1]/a",
				"nabi Headphones");
		assertText(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[1]/ul/li[2]/a",
				"Accessories");

		// assert karaoke box
		assertDisplay(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[2]/ul/a[1]/img");
		assertText(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[2]/ul/a[2]/h2",
				"NABI KARAOKE BOX STORE");
		assertText(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[2]/ul/li[1]/a",
				"nabi Karaoke Box");
		assertText(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[2]/ul/li[2]/a",
				"Accessories");

		// assert Square HD
		assertDisplay(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[3]/ul/a[1]/img");
		assertText(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[3]/ul/a[2]/h2",
				"NABI SQUARE HD STORE");
		assertText(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[3]/ul/li[1]/a",
				"nabi Square HD");
		assertText(".//*[@id='nav']/div/nav/ul/li[4]/ul/li[3]/ul/li[2]/a",
				"Accessories");

		hoverTab(".//*[@id='nav']/div/nav/ul/li[5]/a/span");
		// assert nabi JR
		assertDisplay(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[1]/ul/a[1]/img");
		assertText(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[1]/ul/a[2]/h2",
				"NABI JR. STORE");
		assertText(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[1]/ul/li[1]/a",
				"Personalize");
		assertText(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[1]/ul/li[2]/a",
				"Travel");
		assertText(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[1]/ul/li[3]/a",
				"Solutions");

		// assert nabi 2
		assertDisplay(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[2]/ul/a[1]/img");
		assertText(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[2]/ul/a[2]/h2",
				"NABI 2 STORE");
		assertText(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[2]/ul/li[1]/a",
				"Personalize");
		assertText(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[2]/ul/li[2]/a",
				"Travel");
		assertText(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[2]/ul/li[3]/a",
				"Solutions");

		// assert Nabi XD
		assertDisplay(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[3]/ul/a[1]/img");
		assertText(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[3]/ul/a[2]/h2",
				"NABI XD STORE");
		assertText(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[3]/ul/li[1]/a",
				"Travel");
		assertText(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[3]/ul/li[2]/a",
				"Solutions");

		// assert Nabi Dreamtab
		assertDisplay(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[4]/ul/a[1]/img");
		assertText(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[4]/ul/a[2]/h2",
				"NABI DREAMTAB STORE");
		assertText(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[4]/ul/li[1]/a",
				"Personalize");
		assertText(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[4]/ul/li[2]/a",
				"Travel");
		assertText(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[4]/ul/li[3]/a",
				"Solutions");

		// assert Nabi Big Tab
		assertDisplay(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[5]/ul/a[1]/img");
		assertText(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[5]/ul/a[2]/h2",
				"NABI BIG TAB STORE");
		assertText(".//*[@id='nav']/div/nav/ul/li[5]/ul/li[5]/ul/li/a",
				"Accessories");

		hoverTab("//*[@id=\"nav\"]/div/nav/ul/li[6]/a/span");
		// assert outdoor play
		assertDisplay(".//*[@id='nav']/div/nav/ul/li[6]/ul/li[2]/ul/a[1]/img");
		assertText(".//*[@id='nav']/div/nav/ul/li[6]/ul/li[2]/ul/a[2]/h2",
				"OUTDOOR PLAY");
		assertText(".//*[@id='nav']/div/nav/ul/li[6]/ul/li[2]/ul/li/span",
				"Movement and physical interaction.");
		// assert Pretend Play
		assertDisplay(".//*[@id='nav']/div/nav/ul/li[6]/ul/li[2]/ul/a[1]/img");
		assertText(".//*[@id='nav']/div/nav/ul/li[6]/ul/li[3]/ul/a[2]/h2",
				"PRETEND PLAY");
		assertText(".//*[@id='nav']/div/nav/ul/li[6]/ul/li[3]/ul/li/span",
				"Imagination and story telling.");
		// assert construction
		assertDisplay(".//*[@id='nav']/div/nav/ul/li[6]/ul/li[4]/ul/a[1]/img");
		assertText(".//*[@id='nav']/div/nav/ul/li[6]/ul/li[4]/ul/a[2]/h2",
				"CONSTRUCTION PLAY");
		assertText(".//*[@id='nav']/div/nav/ul/li[6]/ul/li[4]/ul/li/span",
				"Building and spatial reasoning.");
		// assert log play
		assertDisplay(".//*[@id='nav']/div/nav/ul/li[6]/ul/li[5]/ul/a[1]/img");
		assertText(".//*[@id='nav']/div/nav/ul/li[6]/ul/li[5]/ul/a[2]/h2",
				"LOGIC PLAY");
		assertText(".//*[@id='nav']/div/nav/ul/li[6]/ul/li[5]/ul/li/span",
				"Reasoning and pattern recognition.");
		// assert creative play
		assertDisplay(".//*[@id='nav']/div/nav/ul/li[6]/ul/li[6]/ul/a[1]/img");
		assertText(".//*[@id='nav']/div/nav/ul/li[6]/ul/li[6]/ul/a[2]/h2",
				"CREATIVE PLAY");
		assertText(".//*[@id='nav']/div/nav/ul/li[6]/ul/li[6]/ul/li/span",
				"Expression and creation.");

		// scroll Down the page

		scrollDown();

		// Footer Page UI
		// assert twitter
		assertDisplay(".//*[@id='footer']/div/div/div[2]/div[3]/ul/li[1]/a");
		// assert face-book
		assertDisplay(".//*[@id='footer']/div/div/div[2]/div[3]/ul/li[2]/a");
		// assert pinter
		assertDisplay(".//*[@id='footer']/div/div/div[2]/div[3]/ul/li[3]/a");
		// assert You-tube
		assertDisplay(".//*[@id='footer']/div/div/div[2]/div[3]/ul/li[4]/a");
		// assert Copyright
		assertDisplay(".//*[@id='footer']/div/div/div[2]/div[3]/div/p[1]");

		// assert Footer-page header
		assertText(".//*[@id='footer']/h1/a",
				"FREE SHIPPING ON ORDERS OVER $50. *DETAILS");

		// assert Nabi Shop Part
		assertText(".//*[@id='footer']/div/div/div[1]/div[1]/div", "NABI SHOP");
		assertText(".//*[@id='footer']/div/div/div[1]/div[1]/ul/li[1]/a",
				"nabi Jr");
		assertText(".//*[@id='footer']/div/div/div[1]/div[1]/ul/li[2]/a",
				"nabi 2");
		assertText(".//*[@id='footer']/div/div/div[1]/div[1]/ul/li[3]/a",
				"nabi XD");
		assertText(".//*[@id='footer']/div/div/div[1]/div[1]/ul/li[4]/a",
				"Headphones");
		assertText(".//*[@id='footer']/div/div/div[1]/div[1]/ul/li[5]/a",
				"Square HD");
		// assert Store Services Part
		assertText(".//*[@id='footer']/div/div/div[1]/div[2]/div",
				"STORE SERVICES");
		assertText(".//*[@id='footer']/div/div/div[1]/div[2]/ul/li[1]/a",
				"My Account");
		assertText(".//*[@id='footer']/div/div/div[1]/div[2]/ul/li[2]/a",
				"Track your order");
		assertText(".//*[@id='footer']/div/div/div[1]/div[2]/ul/li[3]/a",
				"Shipping Policy");
		assertText(".//*[@id='footer']/div/div/div[1]/div[2]/ul/li[4]/a",
				"Recycling Program");
		assertText(".//*[@id='footer']/div/div/div[1]/div[2]/ul/li[5]/a",
				"Affiliate Program");
		assertText(".//*[@id='footer']/div/div/div[1]/div[2]/ul/li[6]/a",
				"Financing");
		// assert Support Part
		assertText(".//*[@id='footer']/div/div/div[1]/div[3]/div", "SUPPORT");
		assertDisplay(".//*[@id='footer']/div/div/div[1]/div[3]/ul/li[1]/span");
		assertText(".//*[@id='footer']/div/div/div[1]/div[3]/ul/li[2]/a", "FAQ");
		assertText(".//*[@id='footer']/div/div/div[1]/div[3]/ul/li[3]/a",
				"Returns");
		// assert Legal
		assertText(".//*[@id='footer']/div/div/div[2]/div[1]/div", "LEGAL");
		assertText(".//*[@id='footer']/div/div/div[2]/div[1]/ul/li[1]/a",
				"Warranty");
		assertText(".//*[@id='footer']/div/div/div[2]/div[1]/ul/li[2]/a",
				"Privacy Policy");
		assertText(".//*[@id='footer']/div/div/div[2]/div[1]/ul/li[3]/a",
				"Terms of Service");
		// assert INFO.
		assertText(".//*[@id='footer']/div/div/div[2]/div[2]/div", "INFO");
		assertText(".//*[@id='footer']/div/div/div[2]/div[2]/ul/li[1]/a",
				"About Us");
		assertText(".//*[@id='footer']/div/div/div[2]/div[2]/ul/li[2]/a",
				"nabi in School");
		assertText(".//*[@id='footer']/div/div/div[2]/div[2]/ul/li[3]/a",
				"Inspire");

	}// end test()

	@After
	public void tearDown() throws Exception {
		chrome_driver.quit();
		firefox_driver.quit();
		safari_driver.quit();
	}

}// end class

