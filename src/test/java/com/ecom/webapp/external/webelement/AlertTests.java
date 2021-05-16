package com.ecom.webapp.external.webelement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTests {
	

    final  String siteURL = "file:///C:/Users/nayak/Desktop/simplilearn/Phase_5_FSD/FSD-5%20WorkSpace-Practice-Projects/phase-5-selenium-junit-test/static/external-web-alert.html";
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
	@DisplayName("Test :: JavaScript Simple Alert Window Test")
	void testAlertDailogWindow() throws InterruptedException {
		//Open Alert Pop-up Window
		WebElement alertButton = driver.findElement(By.cssSelector("body > button:nth-child(2)"));
		alertButton.click();
		
		//Switch alert window
		Alert alert = driver.switchTo().alert(); //Tells the driver to switch focus on alert pup-up window 
		assertEquals(" Are you sure !",alert.getText());
		Thread.sleep(3000);
		
		alert.accept();//Accept the alert, click ok button 
	}
	
	@Test
	@DisplayName("Test :: JavaScript Confirmation Alert Test With Accept")
	void testConfirmationDailogWindowWithAccept() throws InterruptedException {
		//Open Confirmation Pop-up Window
		WebElement confirmButton = driver.findElement(By.cssSelector("body > button:nth-child(4)"));
		confirmButton.click();
		
		//Switch Confirmation Pop-up window
		Alert alert = driver.switchTo().alert(); //Tells the driver to switch focus on alert pup-up window 
		assertEquals("Press a button !",alert.getText());
		Thread.sleep(3000);
		
		alert.accept();//Accept the confirmation alert, click ok button 
	}
	
	@Test
	@DisplayName("Test :: JavaScript Confirmation Alert Test With Cancel")
	void testConfirmationDailogWindowWithCancel() throws InterruptedException {
		//Open Confirmation Pop-up Window
		WebElement confirmButton = driver.findElement(By.cssSelector("body > button:nth-child(4)"));
		confirmButton.click();
		
		//Switch Confirmation Pop-up window
		Alert alert = driver.switchTo().alert(); //Tells the driver to switch focus on alert pup-up window 
		assertEquals("Press a button !",alert.getText());
		Thread.sleep(3000);
		
		alert.dismiss();//Cancel the dismiss the alert, click ok button 
	}
	
	@Test
	@DisplayName("Test :: JavaScript Prompt Window With Accept")
	void testPromptDialogWindowWithAccept() throws InterruptedException {
		//Open Confirmation Pop-up Window
		WebElement promptButton = driver.findElement(By.cssSelector("body > button:nth-child(6)"));
		promptButton.click();
		
		//Switch Confirmation Pop-up window
		Alert alert = driver.switchTo().alert(); //Tells the driver to switch focus on alert pup-up window 
		assertEquals("Please enter your name",alert.getText());
		
		Thread.sleep(3000);
		
		alert.accept();//Cancel the dismiss the alert, click ok button 
	}
	
	
	@Test
	@DisplayName("Test :: JavaScript Prompt Window With Input Data And Accept")
	void testPromptInputDialogWindowWithAccept() throws InterruptedException {
		//Open Confirmation Pop-up Window
		WebElement promptButton = driver.findElement(By.cssSelector("body > button:nth-child(6)"));
		promptButton.click();
		
		//Switch Confirmation Pop-up window
		Alert alert = driver.switchTo().alert(); //Tells the driver to switch focus on alert pup-up window 
		assertEquals("Please enter your name",alert.getText());
        alert.sendKeys("Sofia Nayak !");
		Thread.sleep(3000);
		
		alert.accept();//Cancel the dismiss the alert, click ok button 
	}

}
