package com.orangehrm.testCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.orangehrm.base.baseClass;
import com.orangehrm.pages.LeavePage;
import com.orangehrm.pages.LoginPage;

public class LeavepageTest extends baseClass{

	@Test
	public void leaveLink() throws InterruptedException {
	
		ExtentTest test1 = extent.createTest("LeavepageTest");
		test1.log(Status.PASS, "this is pass");
	
	LeavePage leave=new LeavePage(driver);
	
	LoginPage login=new LoginPage(driver);
	login.setLoginMethod(user_name, password_name);
	
	leave.leaveClickMethod();
	
	}

}
