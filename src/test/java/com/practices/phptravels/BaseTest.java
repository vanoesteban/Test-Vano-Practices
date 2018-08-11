package com.practices.phptravels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	WebDriver driver;
	BasePage page;
	WebDriverWait wait;
	String urlHome = "https://www.phptravels.net/";
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.get(urlHome);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		
		if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.get(urlHome);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		
		if(browser.equalsIgnoreCase("EDGE")) {
			driver = new EdgeDriver();
			driver.get(urlHome);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		
	}
	
	@AfterMethod
	public void Driverquit() {
		//driver.quit();
	}

	
}
