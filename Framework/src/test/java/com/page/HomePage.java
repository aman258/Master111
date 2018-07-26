package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(linkText="Register")
	WebElement Linktxt;
	
public void clickregistration()
{
	Linktxt.click();
}
}
