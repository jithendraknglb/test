package com.orangehrm.utility;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;

public class Listerners extends TestListenerAdapter{

	public ExtentReports extent;
	
	public void onTestStart(ITestResult tr) {
		System.out.println("Test Started");
	}
	
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test Passed");
	}
	
	public void onTestSkip(ITestResult tr) {
		System.out.println("Test Skipped");
	}
	
	public void onTestFailure(ITestResult tr) {
		System.out.println("Test Failed");
	}
	

	
}
