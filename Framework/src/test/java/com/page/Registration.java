package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration {
	WebDriver d;
	@FindBy(id="gender-female")
	static
	WebElement Chkbox_female;
	@FindBy(id="FirstName")
	static
	WebElement name;
	@FindBy(id="LastName")
	static
	WebElement lastname;
	@FindBy(id="Email")
	static
	WebElement mail;
	@FindBy(id="Password")
	static
	WebElement pass;
	@FindBy(id="ConfirmPassword")
	static
	WebElement conpass;
	@FindBy(id="register-button")
	static
	WebElement registr;

	 public static void registration(String F, String L,String M,String P, String C)
	 {
		 Chkbox_female.click();
		 name.sendKeys(F);
		 lastname.sendKeys(L);
		 mail.sendKeys(M);
		 pass.sendKeys(P);
		conpass.sendKeys(C);
		registr.click();
	 }
	
	
	
	
	
	
//	public void registration()
// {
//	 Chkbox_female.click();
//	 name.sendKeys("Utkarsha");
//	 lastname.sendKeys("Agrawal");
//	 mail.sendKeys("abc@gmail.com");
//	 pass.sendKeys("abcd@1234");
//	conpass.sendKeys("abcd@1234");
//	registr.click();
// }
 
 public void Register(WebDriver driver)
 {
	 this.d = driver;
 }
}