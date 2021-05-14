package com.ecom.webapp.timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitTest {
	

    final  String siteURL = "https://www.amazon.in/";
    final String driverPath ="driver\\chromedriver.exe"; //absolute path 
    WebDriver driver;
    
	//Implicit wait :: The implicit in selenium is used to tell the web driver to wait for a certain time
    //before it throw a "No Such Element Exception" default implicit setting is 0. Specifies the amount of time 
    //the driver should wait when searching for an element if it is not immediately present. 
    
	@BeforeEach
	void setUp() throws Exception {
		//Set Up
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver = new ChromeDriver();
        
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(siteURL);
		
	}

	@AfterEach
	void tearDown() throws Exception {
        driver.close();
	}

    @Test
	@DisplayName("Amazon Test : Mobile Link Verification")
	void testMobileNavigationLink() {
		
		//find mobile link
		WebElement mobileLink = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(3)"));
		assertTrue(mobileLink.isDisplayed());
		assertTrue(mobileLink.isEnabled());
		
		//click action
		mobileLink.click();
		
		//Verifying the test 
		String expected = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		assertEquals(expected, driver.getTitle());
		
	}
    
    @Test
	@DisplayName("Amazon Test : Fashion Link Verification")
	void testFashionLink() {
		
		//find Fashion link
		WebElement fashionLink = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(4)"));
		assertTrue(fashionLink.isDisplayed());
		assertTrue(fashionLink.isEnabled());
		
		//click action
		fashionLink.click();
		
		//Verifying the test 
		String expected2 = "Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids";
		assertEquals(expected2, driver.getTitle());
		
	}
	


}
