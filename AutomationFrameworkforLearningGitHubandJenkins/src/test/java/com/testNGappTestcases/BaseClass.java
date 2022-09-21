package com.testNGappTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testNGappPages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
	public static WebDriver driver;
	
	@Before
	
	public void BrowserSetup() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://spicejet.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@After
	
	public void TearDown() {
		driver.close();
	}

}
