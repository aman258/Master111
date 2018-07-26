package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utilities.ExcelUtility;
import com.page.HomePage;
import com.page.Registration;

public class Registration_TestTest {
	WebDriver d;
	HomePage h;
	Registration r;
	ExcelUtility e;
  @Test
  public void testregistration() throws IOException {
	  h.clickregistration();
	 // r.registration();
	  e.getTestData();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\pratiksha\\browserdrivers\\chromedriver.exe");
      d = new ChromeDriver();
      d.get("http://demowebshop.tricentis.com/");
      h=PageFactory.initElements(d, HomePage.class);
      r=PageFactory.initElements(d, Registration.class);
      e= new ExcelUtility();
      }

}
