package com.testNGappPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLoginPage {

	public UserLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	//UserName displayed field
	@FindBy(xpath="//div[@class='css-76zvg2 r-jwli3a r-ubezar']")
	public WebElement userNamedispalyed;
}
