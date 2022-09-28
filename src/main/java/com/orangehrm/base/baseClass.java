package com.orangehrm.base;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.orangehrm.utility.ReadConfig;

public class baseClass {

	ReadConfig readconfig=new ReadConfig();
	public String base_URL=readconfig.getApplicationUrl();
	public String user_name=readconfig.getUserName();
	public String password_name=readconfig.getPassword();
	public WebDriver driver; 
	public ExtentReports extent = new ExtentReports();
	public ExtentSparkReporter spark = new ExtentSparkReporter("./test-output/extentReport.html");
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(@Optional("chrome") String brow) {
		
		extent.attachReporter(spark);
		
		
		if(brow.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			driver=new ChromeDriver();
		}
		else if(brow.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			driver=new FirefoxDriver();
		}
		else if(brow.equals("edge")) {
			System.setProperty("webdriver.edge.driver",readconfig.getEdgePath());
			driver=new EdgeDriver();
		}
		
		driver.get(base_URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	@AfterClass
	public void tearDown() {
		extent.flush();
		driver.quit();
	}
}
