package com.Utilities;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Logintestdemo {
	@Test
	  public void logInvalid1() {
		 String ER="Tested";
		 String  AR="Tested";
		  Assert.assertEquals(AR,ER);
	  }
	  @Test
	  public void loginInvalid1() {
		  String ER="Tested";
			 String  AR="Tested123";
			  Assert.assertEquals(AR,ER);
	  }
}
