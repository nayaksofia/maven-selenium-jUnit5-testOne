package com.ecom.webapp.amazon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class AmazonHomePageTest {
	
	//1. Formulate A Base Test URL
    final  String siteURL = "https://www.amazon.com/";
    //2. Locate A Web Driver BY Locating the path 
    final String driverPath ="driver\\chromedriver.exe"; //absolute path 
    
    WebDriver driver;
	
	@BeforeEach
	void setUp() throws Exception {
		 //3. Set Selenium System Properties.
        System.setProperty("webdriver.chrome.driver",driverPath);
		//4. Instantiate Selenium Web Driver . That means Create an object of the web driver.
        driver = new ChromeDriver();
        //5. Launch Browser
        driver.get(siteURL);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
	 //Close Driver 
        driver.close();
	}

	@Test
	@DisplayName("Amazon Test :: Home Page Title Verification")
	void testHomePageTitle() {
		//Perform Test Evaluation
        String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        assertEquals(expectedTitle,driver.getTitle());
	}
	
	@Test
	@DisplayName("Amazon Test :: Home Page Source Verification")
	void testSourceURL() {
		//Perform Test Evaluation
        assertEquals(siteURL,driver.getCurrentUrl());
	}


}
