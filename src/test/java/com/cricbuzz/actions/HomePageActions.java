package com.cricbuzz.actions;

import org.openqa.selenium.WebDriver;

import com.cricbuzz.pages.HomePage;

public class HomePageActions extends HomePage {
	
	public HomePageActions(WebDriver driver) {
		super(driver);
	}

	public void clickSchedule() {
		Schedule.click();
	}
	
	public void clickArchives() {
		Archives.click();
	}
	
}
