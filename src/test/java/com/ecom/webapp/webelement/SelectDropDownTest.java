package com.ecom.webapp.webelement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownTest {


    final  String siteURL = "file:///C:/Users/nayak/Desktop/simplilearn/Phase_5_FSD/FSD-5%20WorkSpace-Practice-Projects/phase-5-selenium-junit-test/static/web-elements.html";
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
       // driver.close();
	}
	
	@Test
	@DisplayName("Test :: to verify select dropdown exist.")
	void testToVrifySelectDropDownExist() {
		WebElement select = driver.findElement(By.id("vehicle"));
		assertEquals(true,select.isDisplayed());
		assertEquals(true,select.isEnabled());
		
	}
	
	@Test
	@DisplayName("Test :: to verify first select option dropdown. ")
	void testToVrifySelectedOption() throws InterruptedException {
		
		WebElement select = driver.findElement(By.id("vehicle"));
		//Let capture the first dropdown by using Class :: Select
		Select vehicleSelect = new Select(select);
		
		// Select bike as first selected option
		
		vehicleSelect.selectByVisibleText("Bike");
		WebElement selectedOption = vehicleSelect.getFirstSelectedOption();
		
		assertEquals("Bike", selectedOption.getText());
		Thread.sleep(2000);
		
	}
	
	@Test
	@DisplayName("Test :: to verify index based select option from dropdown. ")
	void testToVrifyIndexBasedSelectedOption() throws InterruptedException {
		
		WebElement select = driver.findElement(By.id("vehicle"));
		//Let capture the first dropdown by using Class :: Select
		Select vehicleSelect = new Select(select);
		
		// Select bike as first selected option
		
		vehicleSelect.selectByIndex(2);
		WebElement selectedOption = vehicleSelect.getFirstSelectedOption();
		
		assertEquals("Train", selectedOption.getText());
		Thread.sleep(2000);
		
	}
	
	@Test
	@DisplayName("Test :: to verify index based select option from dropdown. ")
	void testToVrifyIndexBasedSelectedOption1() throws InterruptedException {
		
		WebElement select = driver.findElement(By.id("vehicle"));
		//Let capture the first dropdown by using Class :: Select
		Select vehicleSelect = new Select(select);
		
		// Select bike as first selected option
		
		vehicleSelect.selectByIndex(3);
		WebElement selectedOption = vehicleSelect.getFirstSelectedOption();
		
		assertEquals("Airplane", selectedOption.getText());
		Thread.sleep(2000);
		
	}
	
	
	@Test
	@DisplayName("Test :: to verify value based select option from dropdown. ")
	void testToVrifyValueBasedSelectedOption1() throws InterruptedException {
		
		WebElement select = driver.findElement(By.id("vehicle"));
		//Let capture the first dropdown by using Class :: Select
		Select vehicleSelect = new Select(select);
		
		// Select bike as first selected option
		
		vehicleSelect.selectByValue("car");
		WebElement selectedOption = vehicleSelect.getFirstSelectedOption();
		
		assertEquals("Car", selectedOption.getText());
		Thread.sleep(2000);
		
	}
	
	
}
