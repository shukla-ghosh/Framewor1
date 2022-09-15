package com.testNGappTestcases;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.testNGUtilities.BrowserFactory;

public class LoginTest {
WebDriver driver;
	@Test
	public void LoginApp() {
		driver=BrowserFactory.startApplication(driver, "Chrome", "https://www.spicejet.com/");
	}
	
	
	
}
