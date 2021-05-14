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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {


    final  String siteURL = "https://www.amazon.in/";
    final String driverPath ="driver\\chromedriver.exe"; //absolute path 
    WebDriver driver;
    WebDriverWait wait;
    
    //Explicit Wait : Explicit wait is used to tell the web driver to wait for a certain condition
    //(or) maximum time to be exceeded before throwing "Element Not Visible Exception" 
    
    @BeforeEach
	void setUp() throws Exception {
		//Set Up
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver = new ChromeDriver();
        
        //explicit wait
        wait = new WebDriverWait(driver,20); //Maximum time is 20 
        driver.get(siteURL);
		
	}

	@AfterEach
	void tearDown() throws Exception {
        driver.close();
	}

    @Test
	@DisplayName("Amazon Test : Mobile Link Verification")
	void testMobileNavigationLink() {
		
		//Normal way to find web element 
		//WebElement mobileLink = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(3)"));
		
    	WebElement mobileLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nav-xshop > a:nth-child(3)")));
    	
    	assertTrue(mobileLink.isDisplayed());
		assertTrue(mobileLink.isEnabled());
		
		//click action
		mobileLink.click();
		
		//Verifying the test 
		String expected = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		assertEquals(expected, driver.getTitle());
		
	}
}
