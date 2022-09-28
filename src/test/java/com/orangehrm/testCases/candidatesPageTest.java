package com.orangehrm.testCases;

import org.testng.annotations.Test;

import com.orangehrm.base.baseClass;
import com.orangehrm.pages.CandidatesPage;
import com.orangehrm.pages.LoginPage;

public class candidatesPageTest extends baseClass{
	
	@Test
	public void test() throws InterruptedException {

		LoginPage login=new LoginPage(driver);
		login.setLoginMethod(user_name, password_name);
		
		CandidatesPage candidate=new CandidatesPage(driver);
		candidate.addCandidate();
		
		Thread.sleep(5000);
	}
}
