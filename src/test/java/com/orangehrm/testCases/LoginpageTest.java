package com.orangehrm.testCases;

import org.testng.annotations.Test;

import com.orangehrm.base.baseClass;
import com.orangehrm.pages.LoginPage;

public class LoginpageTest extends baseClass {
	
	@Test
	public void loginTest() {
		
		LoginPage login=new LoginPage(driver);
		login.setLoginMethod(user_name, password_name);
	
	}
}
