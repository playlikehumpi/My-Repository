package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	
public loginPage(WebDriver driver2) {
		this.driver= driver2;
		
		PageFactory.initElements(driver2, this);
	}
	
	

public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}



	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement login;

	
	

}
