package com.cricbuzz.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.cricbuzz.actions.HomePageActions;

public class PageObjectManager {
	
	private HomePageActions homePage;
	WebDriver driver;
	
	public HomePageActions getHomePage(WebDriver driver) {
		return (homePage == null) ? homePage = new HomePageActions(driver) : homePage;
	}

}
