package com.testNGappPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testNGappTestcases.BaseClass;


public class LoginPage {
	//WebDriver driver;	
	public LoginPage(WebDriver driver){
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(xpath="//div[contains(text(),'Students')]/parent::div/preceding-sibling::div") WebElement studentsradiobutton;
@FindBy(xpath="//div[contains(text(),'Login')]") private WebElement LoginButton;
// Mobile number and password input fields

@FindBy(xpath="//input[@type='number']")  WebElement inputmobilenumber;

@FindBy(xpath="//input[@type='password']")  WebElement inputpassword;

//Login Button

@FindBy(xpath="//div[contains(text(),'LOGIN')]/parent::div")  WebElement enterlogin;



public void clickonLoginButton() {
	LoginButton.click();
}

public void entercredentials(String MobileNumber,String Password) {
	inputmobilenumber.sendKeys(MobileNumber);
	inputpassword.sendKeys(Password);
}
public void clickonenterLoginButton() {
	enterlogin.click();
}
}
