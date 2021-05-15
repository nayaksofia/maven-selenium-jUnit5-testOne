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

public class CheckBoxTest {
	

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
	@DisplayName("Test : To verify checkbox exist.")
	void testToVerifyCheckboxExist() {
		WebElement checkBox1 = driver.findElement(By.id("vehicle1"));
		assertEquals(true,checkBox1.isDisplayed());
		assertEquals(true,checkBox1.isEnabled());
		assertEquals(false,checkBox1.isSelected());
		
		WebElement checkBox2 = driver.findElement(By.id("vehicle2"));
		assertEquals(true,checkBox2.isDisplayed());
		assertEquals(true,checkBox2.isEnabled());
		//default select vehicle2
		assertEquals(true,checkBox2.isSelected());
		
		WebElement checkBox3 = driver.findElement(By.id("vehicle3"));
		assertEquals(true,checkBox3.isDisplayed());
		assertEquals(true,checkBox3.isEnabled());
		assertEquals(false,checkBox3.isSelected());
	}
	
	@Test
	@DisplayName("Test :: To verify checkbox1 select")
	void testToVerifyCheckBoxOneSelected() throws InterruptedException {
		WebElement checkBox1 = driver.findElement(By.id("vehicle1"));
		assertEquals(true,checkBox1.isDisplayed());
		assertEquals(true,checkBox1.isEnabled());
		
		//Select Check Box One
		checkBox1.click();
		Thread.sleep(2000);
		assertEquals(true,checkBox1.isSelected());
		
	}
	
	@Test
	@DisplayName("Test :: To verify checkbox2 de-select")
	void testToVerifyCheckBoxTwoSelected() throws InterruptedException {
		WebElement checkBox2 = driver.findElement(By.id("vehicle2"));
		assertEquals(true,checkBox2.isDisplayed());
		assertEquals(true,checkBox2.isEnabled());
		
		//De-select Check Box One
		checkBox2.click();
		Thread.sleep(2000);
		assertEquals(false,checkBox2.isSelected());
		
	}
	
	@Test
	@DisplayName("Test :: To verify checkbox3 select")
	void testToVerifyCheckBoxThreeSelected() throws InterruptedException {
		WebElement checkBox3 = driver.findElement(By.id("vehicle3"));
		assertEquals(true,checkBox3.isDisplayed());
		assertEquals(true,checkBox3.isEnabled());
		
		//De-select Check Box One
		checkBox3.click();
		Thread.sleep(2000);
		assertEquals(true,checkBox3.isSelected());
		
	}
}
