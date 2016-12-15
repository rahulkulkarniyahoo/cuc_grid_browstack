package junitdemo;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinitions {
	WebDriver driver;
	
	
	@Before
	public void setUp(){
		System.out.println("Your WebDriver:  " + System.getProperty("webdriver"));
		System.out.println("Your Remote URL:  " + System.getProperty("webdriver.remote.url"));
		/*
		 * Put this in the maven / jenkins to execute : 
		 * test -Dwebdriver="firefox and chrome" -Dwebdriver.remote.url="http://www.gohome.com"
		 * 
		 */
		
		
		
	}
	

	@Given("^I go to YouTube Page$")
	public void i_go_to_YouTube_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");	
		driver = new ChromeDriver();
		driver.navigate().to("http://www.youtube.com");
			
	}

	@Then("^I should be on YouTube Page$")
	public void i_should_be_on_YouTube_Page() throws Throwable {
		System.out.println("Hello Me");
		Assert.assertTrue(driver.getTitle().contains("YouTube"));
		driver.quit();
	}
}
