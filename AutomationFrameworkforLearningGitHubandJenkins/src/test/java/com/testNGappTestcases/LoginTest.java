package com.testNGappTestcases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.testNGUtilities.BrowserFactory;
import com.testNGappPages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest  {
	//WebDriver driver;
LoginPage loginpage=new LoginPage(BaseClass.driver);


@Given("User clicks on the login button")
public void user_clicks_on_the_login_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	loginpage.clickonLoginButton();
	Thread.sleep(3000);
}

//@When("User enters the credentials")
//public void user_enters_the_credentials(String MobileNumber,String Password) {
//    // Write code here that turns the phrase above into concrete actions
// loginpage.entercredentials(MobileNumber, Password);
//}
@When("User enters the credentials {string} and {string}")
public void user_enters_the_credentials_and(String MobileNumber, String Password) {
    // Write code here that turns the phrase above into concrete actions
	loginpage.entercredentials("9724934772", "Pinkuhati@2");
}

@When("clicks on login")
public void clicks_on_login() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	loginpage.clickonenterLoginButton();
	Thread.sleep(3000);
}

@Then("User should be logged in to the website")
public void user_should_be_logged_in_to_the_website() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
}

