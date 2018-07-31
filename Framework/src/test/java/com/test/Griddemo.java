package com.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Griddemo {
	
	WebDriver d;
	@Test
	public void f()
	{
		d.get("www.google.com");
	}
	@BeforeTest
	public void beforeTest() throws MalformedURLException
	{
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("chrome");
		d= new RemoteWebDriver(new URL("http://10.231.143.66:5656/wd/hub"),ds);
	    
		
	}
	

}
