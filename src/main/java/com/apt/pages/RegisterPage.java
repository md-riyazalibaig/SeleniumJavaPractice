package com.apt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apt.utils.SeleniumActions;

public class RegisterPage {

	WebDriver driver;
	SeleniumActions actions;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		actions = new SeleniumActions(driver);
	}

	@FindBy(xpath = "//input[@placeholder = 'First Name']")
	WebElement txt_FirstName;

	@FindBy(xpath = "//input[@placeholder = 'Last Name']")
	WebElement txt_LastName;

	@FindBy(xpath = "//textarea[@rows = '3']")
	WebElement txt_Address;

	@FindBy(xpath = "//input[@id='quantity_wanted']")
	WebElement txt_Quantity;

	@FindBy(xpath = "//input[@type = 'email']")
	WebElement txt_email;

	@FindBy(xpath = "//input[@type = 'tel']")
	WebElement txt_Phone;

	@FindBy(xpath = "//input[@value = 'Male']")
	WebElement btn_ContinueShopping;

	public void inputProductDetails(String quantity, String size) {
		txt_FirstName.sendKeys("firstName");
		txt_LastName.sendKeys("lastName");
	}

}
