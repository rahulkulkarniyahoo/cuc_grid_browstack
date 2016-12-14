package junitdemo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition {
	
	WebDriver driver;

	@Given("^I go to YouTube Page$")
	public void i_go_to_YouTube_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");	
		driver = new ChromeDriver();
		driver.navigate().to("http://www.youtube.com");;
			
	}

	@Then("^I should be on YouTube Page$")
	public void i_should_be_on_YouTube_Page() throws Throwable {
		Assert.assertTrue(driver.getTitle().contains("YouTube"));
		driver.quit();
	}

}
