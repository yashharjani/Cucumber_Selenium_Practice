package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	WebDriver driver;
	
//	Creating locators using By class
	
	private By username_login = By.id("name");
	private By password_login = By.id("password");
	private By btn_login = By.id("login");
	private By btn_logout = By.id("logout");
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
		if(!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalStateException("This is not Login page. The correct page is: "+driver.getCurrentUrl());
		}
	}
	
//	Creating action methods
	
	public void enterUsername(String username) {
		driver.findElement(username_login).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(password_login).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	
	public void checkLogoutIsDisplayed() {
		driver.findElement(btn_logout).isDisplayed();
	}
	
//	Instead of creating separate methods for each actions, we can combine them to one method.
	public void loginValidUser(String username, String password) {
		driver.findElement(username_login).sendKeys(username);
		driver.findElement(password_login).sendKeys(password);
		driver.findElement(btn_login).click();
		driver.findElement(btn_logout).isDisplayed();
	}

}
