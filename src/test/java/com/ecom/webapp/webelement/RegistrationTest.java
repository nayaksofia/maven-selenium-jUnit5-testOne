package com.ecom.webapp.webelement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {

	final  String siteURL ="file:///C:/Users/nayak/Desktop/simplilearn/Phase_5_FSD/FSD-5%20WorkSpace-Practice-Projects/phase-5-selenium-junit-test/static/register.html";
    final String driverPath ="driver\\chromedriver.exe"; 
    WebDriver driver;
    
	@BeforeEach
	void setUp() throws Exception {
		//Set Up
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver = new ChromeDriver();
        driver.get(siteURL);
		
	}

	@AfterEach
	void tearDown() throws Exception {
       driver.close();
	}
	
	@Test
	@DisplayName("Registration Form :: Email Verification")
	void testEmail() throws InterruptedException {
		//Find Input Field
		WebElement input1 = driver.findElement(By.id("email"));
		assertTrue(input1.isDisplayed());
		assertTrue(input1.isEnabled());
		
		//Enter yourEmail
		input1.sendKeys("nayaksofia@gmail.com");
		
		//Find Password Input Field
			WebElement input2 = driver.findElement(By.id("psw"));
			assertTrue(input2.isDisplayed());
			assertTrue(input2.isEnabled());
				
			//Enter yourEmail
			input2.sendKeys("abcd");
			
			//Find Repeat PasswordInput Field
			WebElement input3 = driver.findElement(By.id("psw-repeat"));
			assertTrue(input3.isDisplayed());
			assertTrue(input3.isEnabled());
			
			//Enter yourEmail
			input3.sendKeys("abcd");
			Thread.sleep(3000);
			
		
		//Submit
		//input.submit();
		
	}
	
}
