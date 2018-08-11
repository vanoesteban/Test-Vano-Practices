package com.practices.phptravels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	//public Screenshot screenshot;
	WebDriverWait wait;
	WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		//this.screenshot = new Screenshot(webDriver);
		this.wait = new WebDriverWait(driver, 30);
		try {
			PageFactory.initElements(driver, this);
			} 
			catch (Exception e) {
				e.printStackTrace();
				throw e;
				}
			}
	}

