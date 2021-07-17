package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel_POM {
	
	public WebDriver driver;
	
	
	public SelectHotel_POM(WebDriver driver2) {


		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getRadiobutton() {
		return radiobutton;
	}


	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	
	@FindBy(id="continue")
	private WebElement continueClick;


	public WebElement getContinueClick() {
		return continueClick;
	}
	
	
	
	
	

}
