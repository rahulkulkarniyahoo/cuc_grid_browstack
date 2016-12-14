package junitdemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;

public class TestChromeOnGrid {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		//DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setPlatform(Platform.MAC);
		//cap.setBrowserName("chrome");
		//cap.setCapability("version", "50");
		//cap.setVersion("55.0.2883.87");
		
		URL url = new URL("http://localhost:4444/wd/hub");
		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
		
		//System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
		
		WebDriver driver = new RemoteWebDriver(url, cap);
		driver.get("http://www.google.com");
		//driver.getTitle();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}