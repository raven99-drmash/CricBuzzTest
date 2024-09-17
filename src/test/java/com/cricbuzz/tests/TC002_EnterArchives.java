package com.cricbuzz.tests;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cricbuzz.pageobjectmanager.PageObjectManager;

public class TC002_EnterArchives {
	public WebDriver driver;
	PageObjectManager pages;
	Logger logger;
	public Properties p;

	@BeforeClass
	public void setup() throws IOException {
		pages = new PageObjectManager();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		logger = LogManager.getLogger(this.getClass());
		FileReader propFile = new FileReader("./src/main/resources/config.properties");
		p = new Properties();
		p.load(propFile);
		driver.get(p.getProperty("cricbuzzURL"));
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

	@Test
	public void test1() {
		pages.getHomePage(driver).clickArchives();
		logger.info("Hey there... end of test case 2");	
	}

}
