package com.Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Mylistener implements ITestListener
{
	ExtentReports r;
	ExtentTest t;
	static int counter=0;
	
	

	public void onFinish(ITestContext result) {
	
		System.out.println("TestNG Finished");
		r.endTest(t);
		r.flush();
	}

	public void onStart(ITestContext result) {
		r = new ExtentReports("src\\test\\java\\Myreport.html",false);
	//	r = new ExtentReports();
		/*System.out.println("TestNG Started");*/
		counter= counter+1;
		
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test failed with success");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test testfailiure");
		t.log(LogStatus.FAIL,result.getMethod().getMethodName()+ " has Failed");
		
		
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("ontestskipped");
		
	}

	public void onTestStart(ITestResult result) {
	System.out.println("onteststart");
	t=r.startTest(result.getMethod().getMethodName()+"has started");
	t.log(LogStatus.INFO,result.getMethod().getMethodName()+"has started");
	
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("ontestsuccess");
		t.log(LogStatus.PASS,result.getMethod().getMethodName()+ " has Passed");
		
	}
	
}
