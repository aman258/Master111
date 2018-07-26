package com.test;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Cookiestest {

	WebDriver d;
	@Test
	public void cookies()
	{
		d.manage().deleteAllCookies();
		Cookie c = new Cookie("Test","Mycookies");
		d.manage().addCookie(c);
		Set<Cookie> myset = d.manage().getCookies();
		for(Cookie s:myset)
		{
			System.out.println(s.getName());
			System.out.println(s.getPath());
			System.out.println(s.getDomain());
		}
	}
	
	@BeforeTest
	public static void beforeTest()
	{
		//System.setProperty("Webdriver.chrome.driver", "C"
	}
	
}
