package com.ecom.webapp.amazon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class AmazonProductSearchTest {

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
	@DisplayName("Amazon Test :: Search for Iphone 12")
	void testForSearchProduct() {
		//Find Search Box
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		assertTrue(searchBox.isDisplayed());
		assertTrue(searchBox.isEnabled());
		
		//Enter data into search field
		searchBox.sendKeys("Search for Iphone 12");
		
		//submit
		searchBox.submit();
	}
	
	@Test
	@DisplayName("Amazon Test :: Search for One Plus")
	void testForSearchProduct2() {
		//Find Search Box
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		assertTrue(searchBox.isDisplayed());
		assertTrue(searchBox.isEnabled());
		
		//Enter data into search field
		searchBox.sendKeys("Search for One Plus Nord");
		
		//submit
		searchBox.submit();
	}
	
	//TODO :: Search Test For Minimum Three More Products 
	
    //TODO :: Test-1
	@Test
	@DisplayName("Amazon Test :: Search for Wireless Headphones")
	void testForSearchProduct3() {
		//Find Search Box
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		assertTrue(searchBox.isDisplayed());
		assertTrue(searchBox.isEnabled());
		
		//Enter data into search field
		searchBox.sendKeys("Search for Wireless Headphones");
		
		//submit
		searchBox.submit();
	}
	
	//TODO :: Test-2
	
	@Test
	@DisplayName("Amazon Test :: Search for Intel Laptops")
	void testForSearchProduct4() {
		//Find Search Box
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		assertTrue(searchBox.isDisplayed());
		assertTrue(searchBox.isEnabled());
		
		//Enter data into search field
		searchBox.sendKeys("Search for Intel Laptops");
		
		//submit
		searchBox.submit();
	}
	
	//TODO :: Test-3
	@Test
	@DisplayName("Amazon Test :: Search for Musical Instruments")
	void testForSearchProduct5() {
		//Find Search Box
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		assertTrue(searchBox.isDisplayed());
		assertTrue(searchBox.isEnabled());
		
		//Enter data into search field
		searchBox.sendKeys("Search for Musical Instruments");
		
		//submit
		searchBox.submit();
	}
	

}
