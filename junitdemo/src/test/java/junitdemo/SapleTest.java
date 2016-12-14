/*package junitdemo;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SapleTest {
	
 @Test
 public void simpleTestPass(){
	 int a = 1;
	 int b = 2;
	 assertTrue(a+b ==3);
 }
 @Test
 public void simpleTestFail(){
	 int a = 2;
	 int b = 2;
	 assertTrue(a+b ==4);
 }
  
 
	
	WebDriver driver;
	
	@Before
	public void startUp(){
		System.setProperty("webdriver.chrome.driver",  "src/main/resources/chromedriver");
	 driver = new ChromeDriver();
	}
	@After
	public void tearDown(){
		driver.quit();
	}
	@Test
	public void testMe(){
		driver.get("http://www.google.com");
		assertTrue(driver.getTitle().equalsIgnoreCase("google"));
	}
	
	
	
	
	
}
*/