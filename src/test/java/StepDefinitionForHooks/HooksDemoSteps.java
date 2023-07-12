package StepDefinitionForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class HooksDemoSteps {
	
	WebDriver driver = null;
	
	@Before
	public void setUp() {
		
		System.out.println("======== I am inside browser setup ========");
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	}
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	}
	@And("clicks on login button")
	public void clicks_on_login_button() {
	}
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	}
	
	@After
	public void tearDown() {
		System.out.println("======== I am inside TearDown ========");
		driver.close();
		driver.quit();
	}

}
