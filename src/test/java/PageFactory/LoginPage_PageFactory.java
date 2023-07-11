package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PageFactory {
	
//	Creating locators using FindBy annotation
	@FindBy(id = "name")	
	WebElement username_login;
	
	@FindBy(id = "password")
	WebElement password_login;
	
	@FindBy(id = "login")
	@CacheLookup
//	CacheLookup can be used to instruct the initelements() method to cache the element once its located and so that it will not be searched over and over again whenever calling it from any method.
//	This works well with a basic web application, but not recommended if you have Ajax applications where DOM changes on user actions. 
	WebElement btn_login;
	
	WebDriver driver;
	public LoginPage_PageFactory(WebDriver driver){   //Constructor is used to initialize the state of the object created.
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
//		In case of Ajax applications, loading time of elements is not handled. To handle timeout of Ajax elements loading time, AjaxElementLocatorFactory class is used.
//		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
//		PageFactory.initElements(factory, this);
	}
	
//	Creating action methods
	public void enterUsername(String username) {
		username_login.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		password_login.sendKeys(password);
	}
	
	public void clickLogin() {
		btn_login.click();
	}
	
}
