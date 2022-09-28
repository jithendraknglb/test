package com.orangehrm.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.orangehrm.base.baseClass;

public class LeavePage extends baseClass{

	WebDriver driver;
	
	
	
	public LeavePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='My Leave']")
	WebElement myLeaveLink;
	
	@FindBy(xpath="//label[text()='From Date']/../following-sibling::div//input")
	WebElement fromDateTextfield;
	
	@FindBy(xpath="//label[text()='To Date']/../following-sibling::div//input")
	WebElement toDateTextfield;
	
	@FindBy(xpath="//label[text()='Show Leave with Status']/../following-sibling::div//div[@class='oxd-select-text--after']")
	WebElement showLeaveDropDown;
	
	@FindBy(xpath="//label[text()='Leave Type']/../following-sibling::div//i")
	WebElement leaveType;
	
	public void leaveClickMethod() throws InterruptedException {
		Thread.sleep(3000);
		myLeaveLink.click();
		Reporter.log("<B><font color = 'blue'>Step5 .</font></B>clicked on leaveList link");
		
		fromDateTextfield.sendKeys("2022-09-27");
		Reporter.log("<B><font color = 'blue'>Step6 .</font></B>entered from Date");
		
		toDateTextfield.sendKeys("2022-09-29");
		Reporter.log("<B><font color = 'blue'>Step7 .</font></B>entered to Date");
		
		showLeaveDropDown.click();
		List<WebElement> leaveList = driver.findElements(By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']/div"));
		for(WebElement ele:leaveList) {
			String actualText=ele.getText();
			if(actualText.equals("Scheduled ")) {
				ele.click();
				break;
			}
		}
		Reporter.log("<B><font color = 'blue'>Step8 .</font></B>clicked on showLeave drop down");
		
		leaveType.click();
		List<WebElement> listTypeDropdown = driver.findElements(By.xpath("//label[text()='Leave Type']/../following-sibling::div/div/div[@role='listbox']/li"));
		System.out.println("listTypeDropdown + " + listTypeDropdown);
		for (WebElement ele : listTypeDropdown) {
			String listLeva = ele.getText();
			if(listLeva.equals("US - Bereavement")) {
				ele.click();
				break;
			}
		}
		Reporter.log("<B><font color = 'blue'>Step9 .</font></B>clicked leaveType drop down");
	}
	
}
