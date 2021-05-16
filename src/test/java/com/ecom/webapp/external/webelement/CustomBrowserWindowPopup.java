package com.ecom.webapp.external.webelement;

import java.util.Iterator;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomBrowserWindowPopup {

	  final  String siteURL = "https://www.amazon.in/";
	    final String driverPath ="driver\\chromedriver.exe"; //absolute path 
	    WebDriver driver;
		
		@BeforeEach
		void setUp() throws Exception {
	        System.setProperty("webdriver.chrome.driver",driverPath);
	        driver = new ChromeDriver();
	        driver.get(siteURL);
			
		}

		@AfterEach
		void tearDown() throws Exception {
	        driver.close();
		}
	@Test
	@DisplayName("Amazon Test :: Amazon Location Pupup Window ")
	void testToVerifyLocationBrowserWindowPopup() throws InterruptedException {
		
		//Find Location Pup-up And Click
		driver.findElement(By.id("nav-global-location-popover-link")).click();
		Thread.sleep(3000);
		
		//1. Main Window
	   String mainWindow =	driver.getWindowHandle();
	
	   //2. Get all windows list
	    Set<String> windows = driver.getWindowHandles(); 
	    Iterator<String> itr = windows.iterator();
	    
	    while(itr.hasNext()) {
	    	String childWindow = itr.next();
	    	
	    	//Switch to child window
	    	driver.switchTo().window(childWindow);
	    	
	    	//find Pup-up Based Element
	    	driver.findElement(By.id("GLUXZipUpdateInput")).sendKeys("768222");
	    	
	    	Thread.sleep(3000);
	    	
	    	driver.findElement(By.cssSelector("#GLUXZipUpdate > span > input")).click();
	    	
	    }
	    
	    //Switch Child to Main Window
	    driver.switchTo().window(mainWindow);
	    Thread.sleep(4000);
	}
}
