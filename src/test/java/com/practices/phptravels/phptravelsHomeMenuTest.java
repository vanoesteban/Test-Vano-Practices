package com.practices.phptravels;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.practices.phptravels.phptravelsHomeMenu;

public class phptravelsHomeMenuTest extends BaseTest{
	

	phptravelsHomeMenu click;

	@Test (priority=0) 
	public void checktitle() {
		Assert.assertEquals(driver.getTitle().contains("PHPTRAVELS | Travel Technology Partner"), true);
	}
	
	@Test (priority=1) 
	public void clickmenu() throws InterruptedException{
		click.MenuTitlesCeiling("Search Results", 
								"Flights List", 
								"Tours Listings",
								"Cars Listing",
								"Visa",
								"Special Offers",
								"Blog");
		
		/*clickMenu.hotelsMenu.click();
		Assert.assertEquals(driver.getTitle().contains("Search Results"), true);
		
		clickMenu.flightsMenu.click();
		Assert.assertEquals(driver.getTitle().contains("Flights List"), true);
		
		clickMenu.toursMenu.click();
		Assert.assertEquals(driver.getTitle().contains("Tours Listings"), true);
		
		clickMenu.carsMenu.click();
		Assert.assertEquals(driver.getTitle().contains("Cars Listings"), true);
		
		clickMenu.visaMenu.click();
		Assert.assertEquals(driver.getTitle().contains("Visa"), true);
		
		clickMenu.offersMenu.click();
		Assert.assertEquals(driver.getTitle().contains("Special Offers"), true);
		
		clickMenu.blogMenu.click();
		Assert.assertEquals(driver.getTitle().contains("Blog"), true);
		*/
		//driver.navigate().back();	
	}
	
	
	

}
