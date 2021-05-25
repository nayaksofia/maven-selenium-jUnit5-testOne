package com.ecom.webapp.screenshot;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BrowserWindowScreenShotTest {


    final  String siteURL = "https://www.amazon.in/";
    final String driverPath ="driver\\chromedriver.exe"; //absolute path 
    WebDriver driver;
	
	@BeforeEach
	void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(siteURL);
		
	}

	@AfterEach
	void tearDown() throws Exception {
        driver.close();
	}
	
	//Example: ScreenShot Type-1
	@Test
	@DisplayName("Test :: Amazon Home Page Screen Shot Test")
	void takeScreenShotTest() throws IOException {
		//Step-1 :: type cast driver object into takeScreenshot instance 
		TakesScreenshot tsc = (TakesScreenshot) driver;
		
		//Step-2 :: Generate a screenshot as file 
		File rsc = tsc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rsc,new File("C:\\Users\\nayak\\Desktop\\simplilearn\\Phase_5_FSD\\FSD-5 Selenium-Document\\test-screenshot\\amazon-home.png"));
		
	}
	
	//Example: ScreenShot Type-2
	@Test
	@DisplayName("Amazon Test : Mobile Link Verification Screenshot")
	void testMobileNavigationLink() throws IOException {
		
        Dimension d = new Dimension(480, 620);
		
		driver.manage().window().setSize(d);
		
		//find mobile link and click
		driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(3)")).click();
		
		//Step-1 :: type cast driver object into takeScreenshot instance 
			TakesScreenshot tsc = (TakesScreenshot) driver;
				
	    //Step-2 :: Generate a screenshot as file 
			File rsc = tsc.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(rsc,new File("C:\\Users\\nayak\\Desktop\\simplilearn\\Phase_5_FSD\\FSD-5 Selenium-Document\\test-screenshot\\amazon-mobile.png"));
					
	}
	
	//Example : ScreenShot Type-3
	@Test
	@DisplayName("Amazon Test : Best Sellers Link Verification Screenshot")
	void testBestSellersLink() throws IOException {
		
		
		//find Best Seller link and Click
		 driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(2)")).click();
		 
		 //call function to take screen-shot
		 takeScreenShot("amazon-best-seller.png");
	}
		 
		 private void takeScreenShot(String filename) throws IOException {
			 //Instantiate Driver Object and Type-cast
			 TakesScreenshot tsc = (TakesScreenshot) driver;
			 
			 //Generate Screenshot as file
			 File rsc = tsc.getScreenshotAs(OutputType.FILE);
			 
			 FileHandler.copy(rsc, new File("C:\\Users\\nayak\\Desktop\\simplilearn\\Phase_5_FSD\\FSD-5 Selenium-Document\\test-screenshot\\" + filename));
		 }
		
	}
	

