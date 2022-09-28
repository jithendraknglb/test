package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.orangehrm.base.baseClass;

public class LoginPage extends baseClass{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='username']")
	WebElement usernameTextfield;
	
	@FindBy(name="password")
	WebElement passwordTextfield;
	
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement loginButton;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a")
	WebElement leaveModule;
	
	public void setLoginMethod(String uname , String pwd) {
		usernameTextfield.sendKeys(uname);
		Reporter.log("<B><font color = 'blue'>Step1 .</font></B>entered username");
		
		passwordTextfield.sendKeys(pwd);
		Reporter.log("<B><font color = 'blue'>Step2 .</font></B>entered password");
		
		loginButton.click();
		Reporter.log("<B><font color = 'blue'>Step3 .</font></B>clicked on loginButton");
		
		leaveModule.click();
		Reporter.log("<B><font color = 'blue'>Step4 .</font></B>clicked on leaveModule link");
	}
	
	public void setpassword() {
	
	}
	
	public void clicklogin() {
	
	}
	
	public void leaveModuleLink() {
		
	}
	
	
	
	
}
