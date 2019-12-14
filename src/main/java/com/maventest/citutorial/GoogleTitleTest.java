package com.maventest.citutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Step;

public class GoogleTitleTest {
	
WebDriver driver;
  @Test
  public void verifyGoogleTitle() {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.co.in");
	  Assert.assertEquals("Google", driver.getTitle());
  }
  @AfterTest
  public void tearDown()
  {
	  driver.close();
  }
}
