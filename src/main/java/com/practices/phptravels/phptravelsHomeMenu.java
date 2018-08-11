package com.practices.phptravels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class phptravelsHomeMenu extends BasePage {
	
	public phptravelsHomeMenu(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath = "/html/body/nav/div/div[1]/a")
	WebElement logoMenu;
	
	@FindBy(xpath = "//*[@id=\"collapse\"]/ul[1]/li[1]/a")
	WebElement homeMenu;
	
	@FindBy(xpath = "//*[@id=\"collapse\"]/ul[1]/li[2]/a")
	WebElement hotelsMenu;
	
	@FindBy(xpath = "//*[@id=\"collapse\"]/ul[1]/li[3]/a")
	WebElement flightsMenu;
	
	@FindBy(xpath = "//*[@id=\"collapse\"]/ul[1]/li[4]/a")
	WebElement toursMenu;
	
	@FindBy(xpath = "//*[@id=\"collapse\"]/ul[1]/li[5]/a")
	WebElement carsMenu;
	
	@FindBy(xpath = "//*[@id=\"collapse\"]/ul[1]/li[6]/a")
	WebElement visaMenu;
	
	@FindBy(xpath = "//*[@id=\"collapse\"]/ul[1]/li[7]/a")
	WebElement offersMenu;
	
	@FindBy(xpath = "//*[@id=\"collapse\"]/ul[1]/li[8]/a")
	WebElement blogMenu;
	
	
	public void MenuTitlesCeiling(String hotel, String flights, String tours, String cars, String visa, String offers, String blog ) {
		
		hotelsMenu.click();
		Assert.assertEquals(driver.getTitle().contains(hotel), true);
		
		flightsMenu.click();
		Assert.assertEquals(driver.getTitle().contains(flights), true);
		
		toursMenu.click();
		Assert.assertEquals(driver.getTitle().contains(tours), true);
		
		carsMenu.click();
		Assert.assertEquals(driver.getTitle().contains(cars), true);
		
		visaMenu.click();
		Assert.assertEquals(driver.getTitle().contains(visa), true);
		
		offersMenu.click();
		Assert.assertEquals(driver.getTitle().contains(offers), true);
		
		blogMenu.click();
		Assert.assertEquals(driver.getTitle().contains(blog), true);
	}
}
