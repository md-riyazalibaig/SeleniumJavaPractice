package com.apt.utils;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumActions {

	WebDriver driver;
	Actions builder;

	public SeleniumActions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		builder = new Actions(driver);
	}

	public void hoverToElement(WebElement element) {
		builder.moveToElement(element).build().perform();
	}

	public void performClick(WebElement element) {
		builder.moveToElement(element).click().build().perform();
	}
	
	public void performSubMenuClick(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		builder.moveToElement(element).click().build().perform();
	}

	public void hoverToElementOffset(WebElement element) {
		builder.moveToElement(element, 20, 20).build().perform();
	}
	
	public void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void explicitWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
