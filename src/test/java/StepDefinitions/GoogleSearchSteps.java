package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	
//	WebDriver driver = null;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
////		driver.manage().window().fullscreen();
//	}
//	
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		driver.get("https://www.google.com/");
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() {
//		driver.findElement(By.id("APjFqb")).sendKeys("Automation Testing");
//	}
//
//	@When("hits enter")
//	public void hits_enter() {
//		WebElement search = driver.findElement(By.id("APjFqb"));
//		search.sendKeys(Keys.ENTER);
//	}
//
//	@Then("user is navigated to the search results")
//	public void user_is_navigated_to_the_search_results() {
//		driver.getPageSource().contains("Test automation");
//		driver.close();
//		driver.quit();
//	}

}
