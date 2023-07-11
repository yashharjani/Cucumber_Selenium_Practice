package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PageFactory {
	
	@FindBy(id = "logout")
	WebElement btn_logout;
	
	WebDriver driver;
	public HomePage_PageFactory(WebDriver driver){   //Constructor is used to initialize the state of the object created.
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void checkLogoutIsDisplayed() {
		btn_logout.isDisplayed();
	}

}
