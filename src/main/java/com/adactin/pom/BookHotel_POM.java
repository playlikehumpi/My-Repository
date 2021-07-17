package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel_POM {
	
	public WebDriver driver;
	
	
	public BookHotel_POM(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver2, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCVVNumber() {
		return CVVNumber;
	}

	public WebElement getBook_now() {
		return book_now;
	}

	@FindBy(id="first_name")
	private WebElement firstname;
	
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement address;
	
	
	@FindBy(id="cc_num")
	private WebElement cc_num;
	

	@FindBy(id="cc_type")
	private WebElement cardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement month;
	
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement CVVNumber;
	
	@FindBy(id="book_now")
	private WebElement book_now;
	

	public WebElement getMy_itinerary() {
		return my_itinerary;
	}

	@FindBy(xpath="//input[@class='c']")
	private WebElement my_itinerary;
	
	
	
	
	

}
