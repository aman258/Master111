package com.cucumbertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver d;
	@Given("^I am on the login page$")
	public void i_am_on_the_login_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\pratiksha\\browserdrivers\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/login");
	   //System.out.println("on login page");
	}

	@When("^I give Tomsmith and SuperSecretPassword!$")
	public void i_give_Tomsmith_and_SuperSecretPassword() throws Throwable {
	    System.out.println("Enter username and password");
	}

	@Then("^I should be login$")
	public void i_should_be_login() throws Throwable {
	   System.out.println("Loggin");
	}

}
