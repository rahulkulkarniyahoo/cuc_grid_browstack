package junitdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.Scenario;

public class SampleExtentReportStandAlone {

	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;
	
	@Test
	public void verifyTitle() throws Exception{
		
		System.out.println("************  user dir :" + System.getProperty("user.dir"));
		System.out.println("**********    user home :" + System.getProperty("user.home"));
		
		
		report = new ExtentReports("src/test/reports/report.html");
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
		logger = report.startTest("Verify Yahoo! title");
		driver = new ChromeDriver();
		logger.log(LogStatus.INFO, "Browser Started");
		driver.get("http://www.yahoo.com");
		logger.log(LogStatus.INFO, "Application is up and Running");
		
		Assert.assertTrue(driver.getTitle().contains("Yahoo"));
		String screenshotPath = captureScreenShot(driver, "MyTestName");
	
		//String screenshotPath = captureScreenShot(driver, "MyTestName");
		//logger.log(LogStatus.PASS, "Title Verified");
		String image = logger.addScreenCapture(System.getProperty("user.dir") +"/"+ screenshotPath);
		//String image = logger.addScreenCapture(screenshotPath);
		
		System.out.println("Path to Image = " + image);
		logger.log(LogStatus.FAIL, "Title Verified", "I think this qualifies as Pass");
		//logger.log
		
		report.endTest(logger);
		report.flush();
		driver.get("src/test/reports/report.html");

		
	}
	
	@After
	public void tearDown(){
		System.out.println("Test Completed");
		driver.quit();
	}
	
	public static String captureScreenShot(WebDriver driver, String screenshotName) throws Exception{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = "src/test/reports/"+ screenshotName+".png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);
		System.out.println("Screenshot Captured");
		
		return dest;
		
	}
	
	
}
