package com.niraj.eb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.niraj.eb.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page factory - Locators
	
	@FindBy (name="username")
	WebElement username;
	
	@FindBy (name="password")
	WebElement password;
	
	@FindBy (xpath = "//button[text()=' Login ']")
	WebElement login;
	

	
//	@FindBy (xpath="div[@class='']")
//	WebElement loginBtn;
	
	

	
	//Initializing page objects
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public HomePage login(String un, String pwd) throws InterruptedException {

		
		Thread.sleep(3000);
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		
		return new HomePage();
		
		
	}

}
