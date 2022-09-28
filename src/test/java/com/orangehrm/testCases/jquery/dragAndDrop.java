package com.orangehrm.testCases.jquery;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dragAndDrop {

	@Test
	public void test() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/draggable/");
		
		System.out.println("Step 1 : entered URL. ");
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(iframe);
		System.out.println("Step 2 : switched to frame. ");
		
		
		WebElement dragElement = driver.findElement(By.xpath("//p[text()='Drag me around']"));
		Actions action=new Actions(driver);
		dragElement.click();
		System.out.println("Step 3 : click on the element. ");
		action.dragAndDropBy(dragElement, 200,100).perform();
		System.out.println("Step 4 : drag and drop the element. ");
		
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		System.out.println("Step 5 : switch control back to parent Window. ");
		
		driver.manage().window().minimize();
		driver.quit();
		
		
	}
}
