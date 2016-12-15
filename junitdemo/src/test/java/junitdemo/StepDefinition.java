package junitdemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition {
	
/*	WebDriver driver;

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
	}*/
	
	  
	
	  public static final String USERNAME = "rahulkulkarni1";
	  public static final String AUTOMATE_KEY = "UM87iniPkMqbiZ1SaTJ8";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  WebDriver driver;
	  DesiredCapabilities caps;
	  @Before
	  public void startUp() throws MalformedURLException{
		  System.out.println("I started .. ");
	  }
	  



	@Given("^I go to YouTube Page$")
	public void i_go_to_YouTube_Page() throws Throwable {
		/*System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");	
		driver = new ChromeDriver();*/
		caps =  DesiredCapabilities.firefox();
		  System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
		  caps.setPlatform(Platform.MAC);
		  caps.setCapability("browserstack.debug", "true");
		  driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("http://www.youtube.com");;
			
	}

	@Then("^I should be on YouTube Page$")
	public void i_should_be_on_YouTube_Page() throws Throwable {
		Assert.assertTrue(driver.getTitle().contains("YouTube"));
		driver.quit();
	}

}
