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

class AmazonNavigationLinkTest {

	
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
//	
//	@Test
//	@DisplayName("Amazon Test : Today's Deal Link Verification")
//	void testTodayLink() {
//		
//		//find Today's Deal link
//		WebElement todayLink = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(8)"));
//		assertTrue(todayLink.isDisplayed());
//		assertTrue(todayLink.isEnabled());
//		
//		//click action
//		todayLink.click();
//		
//		//Verifying the test 
//		String expected1 = "Amazon.in - Today's Deals";
//		assertEquals(expected1, driver.getTitle());
//		
//	}

	//TODO :: Test to verify 3 more nav links from amazon e-commerce web site 
	
	//TODO :: NavTest-1
	@Test
	@DisplayName("Amazon Test : Best Sellers Link Verification")
	void testBestSellersLink() {
		
		//find Best Seller link
		WebElement bestSellerLink = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(2)"));
		assertTrue(bestSellerLink.isDisplayed());
		assertTrue(bestSellerLink.isEnabled());
		
		//click action
		bestSellerLink.click();
		
		//Verifying the test 
		String expected1 = "Amazon.in Bestsellers: The most popular items on Amazon";
		assertEquals(expected1, driver.getTitle());
		
	}
	
	//TODO :: NavTest-2
	
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
	
	//TODO :: NavTest-3
	
	@Test
	@DisplayName("Amazon Test : Electronics Link Verification")
	void testElectronicsLink() {
		
		//find Electronics link
		WebElement electronicsLink = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)"));
		assertTrue(electronicsLink.isDisplayed());
		assertTrue(electronicsLink.isEnabled());
		
		//click action
		electronicsLink.click();
		
		//Verifying the test 
		String expected3 = "Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";
		assertEquals(expected3, driver.getTitle());
		
	}
	
	
	//TODO :: NavTest-4
	
		@Test
		@DisplayName("Amazon Test : New Releases Link Verification")
		void testCustomerServiceLink() {
			
			//find New Releases link
			WebElement newReleasesLink = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(6)"));
			assertTrue(newReleasesLink.isDisplayed());
			assertTrue(newReleasesLink.isEnabled());
			
			//click action
			newReleasesLink.click();
			
			//Verifying the test 
			String expected4 = "Amazon.in Hot New Releases: The bestselling new and future releases on Amazon";
			assertEquals(expected4, driver.getTitle());
			
		}

}
