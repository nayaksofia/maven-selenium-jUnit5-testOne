 # Maven Based Selenium Test > [Maven + Junit Unit + Selenium ]

>Step-1: Create Maven Project

>Step-2: Choose: `maven-archetype-quickstart`

>Step-3: Set Value 
```
> Group ID: com.ecom.webapp
> ArtifactID: phase5-selenium-junit-test-05-01-2021
```
>Step-4:  Open `pom.xml` file
- Integrate jUnit5 here:
 So, Search for dependency : `junit.jupiter.api` and ` selenium maven dependency` in google search

And add the following dependencies, as follows. Before that, remove the previous jUnit dependency. 

```
<!--junit-jupiter-api-->
<dependency>
  <groupId>org.junit.jupiter</groupId>
  <artifactId>junit-jupiter-api</artifactId>
  <version>5.4.2</version>
  <scope>test</scope>
</dependency>

<!--junit-jupiter-engine-->
<dependency>
  <groupId>org.junit.jupiter</groupId>
  <artifactId>junit-jupiter-engine</artifactId>
  <version>5.4.2</version>
  <scope>test</scope>
</dependency>

<!--selenium-java-->
<dependency>
   <groupId>org.seleniumhq.selenium</groupId>
   <artifactId>selenium-java</artifactId>
   <version>3.141.59 </version>
</dependency>

```
Then Add the following in the  <Properties> Tag for compiler settings. 

```
<maven.compiler.target>8</maven.compiler.target>
<maven.compiler.source>8</maven.compiler.source>
```

> Step-5: Also, Search for `junit 5 maven surefire ` plugin and add it after <dependencies></dependencies> Tag.

[Link Of Surefire Plugin To Download](https://maven.apache.org/surefire/maven-surefire-plugin/examples/junit-platform.html
)

```
<build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M5</version>
            </plugin>
        </plugins>
</build>

```
If we do not add this plugin , we can't able to execute the jUnit test cases from Maven. 

> Step-6: Now add `jUnit Test Case` on the file structure of `src/test/java`.
For that, right click `package name` -> Other -> Search `jUnit Test Case` -> Click on `jUnit Test Case`.

> Then, write Name:`YourTestCaseName`
> 
> Make sure you do check the Check box of `New jUnit Jupiter Test`  And check the `setUp` and `tearDown`

>Step-7: Write the code for test.

>Step-8: Final Step TO Execute. 
```
Right Click on project -> Run As -> JUnit Test
```
> Note: If sth go wrong while running the `Maven` Project , Right Click On The Project -> Maven -> Update Project -> Ok

> Then `Run As-> jUnit Test`

> jUnit provide the `Assert Statement` for test cases.  So no need to write `If...else` . 

# WebDriver Locators

Selenium WebDriver uses eight locators to find the elements on a webpage. The object identifiers or locators supported by Selenium are:

> Id(unique, non-dynamic) -> driver.findElement(By.id("Email"));

> Name (unique, non-dynamic) -> driver.findElement(By.name("EmailID"));

> Class (unique, non-dynamic) driver.findElement(By.className(“mandatory”));

>CSSSelector driver.findElement(By.cssSelector(“input.login”); 

> XPath driver.findElement(By.xpath(“//input[@class=‘login’]
”)

>linkText driver.findElement(By.linkText(“Gmail”));

> Partial LinkText driver.findElement(By.partialLinkText(“Inbox”));

> TagName driver.findElement(By.tagName(“input”));

# WebElement Class Methods:


> click()

> clear(}

> submit()

> sendKeys()

---
>isEnabled()

>isDisplayed()

>isSelected()
---

>findElement()

>findElements()

---

>getCssValue()

>getAttribute()

>getText()

>getTagName()

>getScreenshotAs()

---
>getLocation()

>getRectangle()

>getSize()

---
# Timeout Methods

> *Timeouts* are an interface for managing timeout behavior for WebDriver instances

>**implicitlyWait()** : Amount of time the driver should wait while searching for an element (call to findElement) if it is not immediately available. 

>**pageLoadTimeout()** : Amount of time to wait for a page to load completely

>**setScriptTimeout()** : Amount of time to wait for an asynchronous script to finish execution

> **Implicitly waiting** vs. putting **Thread.sleep()**: 
>*Implicit wait* polls the DOM to wait for a certain amount of time until an element is found. 
>*Thread.sleep()* causes executing thread to sleep for a specified time. 


# TODO :: Registration Form 

> Inside `static` folder: `registrationform.html` file
```
Package Name :: com.ecom.webapp.webelement
Class Name:RegistrationTest.java
```

#TODO :: LogIn Form
> Inside `static` folder: `loginform.html` file
```
Package Name :: com.ecom.webapp.webelement
Class Name:LogInTest.java
```

# JavaScript Alerts

## Syntax for handling Alerts

`Alert = driver.switchTo().alert()`         //Tells the driver to switch focus on alert pop-up window. 

## Key Operations that can be performed on JavaScript popups

> alert.getText() // Gets the text on alert window.


> alert.accept() // Accepts the alert (for example, clicking Ok button).

> alert.dismiss() // Dismisses the alert (for example, clicking Cancel button ).

> alert.sendKeys() // Passes text to be entered in any field on the pop-up window.

> alert.getText() // Gets the text on alert window.


> alert.accept() // Accepts the alert (for example, clicking Ok button).

> alert.dismiss() // Dismisses the alert (for example, clicking Cancel button ).

> alert.sendKeys() // Passes text to be entered in any field on the pop-up window.

## Exception to be handled

> `NoAlertPresentException` : This exception triggers when there is no alert, but system is trying to switch to an alert. 

# Time : 3 :53 :43