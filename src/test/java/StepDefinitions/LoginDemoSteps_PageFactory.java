package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.HomePage_PageFactory;
import PageFactory.LoginPage_PageFactory;
import io.cucumber.java.en.*;

public class LoginDemoSteps_PageFactory {
	
	WebDriver driver = null;
	LoginPage_PageFactory login; //This is declaration of the object of the LoginPage_PageFactory class.
	HomePage_PageFactory home; //This is declaration of the object of the HomePage_PageFactory class.
	
	@Given("browser is open")
	public void browser_is_open() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
//		driver.manage().window().fullscreen();
	}
	
	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.get("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_automation_testing_and(String username, String password) throws InterruptedException {
		login = new LoginPage_PageFactory(driver); // Creating object of LoginPage_PageFactory class.
		login.enterUsername(username);
		login.enterPassword(password);
		Thread.sleep(1000);
	}

	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
		login.clickLogin();
		Thread.sleep(1000);
	}

	@Then("user should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
		home = new HomePage_PageFactory(driver); // Creating object of HomePage_PageFactory class.
		home.checkLogoutIsDisplayed();
		driver.close();
		driver.quit();
	}

}
