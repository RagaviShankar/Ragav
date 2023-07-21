package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1 {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement userName;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "login")
	private WebElement loginBtn;
	
	
	
	

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public Login1(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
		
		
	}
	
	

	
}
