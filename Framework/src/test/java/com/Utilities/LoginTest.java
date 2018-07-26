package com.Utilities;



import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
  @Test
  public void logInvalid() {
	 String ER="Tested";
	 String  AR="Tested";
	  Assert.assertEquals(AR,ER);
  }
  @Test
  public void loginInvalid() {
	  String ER="Tested";
		 String  AR="Tested123";
		  Assert.assertEquals(AR,ER);
  }
}
