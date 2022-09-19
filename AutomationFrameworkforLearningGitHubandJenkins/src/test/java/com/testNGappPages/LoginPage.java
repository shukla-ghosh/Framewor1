package com.testNGappPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(xpath="//div[contains(text(),'Students')]/parent::div/preceding-sibling::div") WebElement studentsradiobutton;

}
