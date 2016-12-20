package junitdemo;
/* Does not work well
 * 
 * creates the html, but image is not embeded.
 * 
 */
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class StandAloneExtentReport {

	 private static ExtentReports extent;

	    public static void main(String[] args) {
	        extent = new ExtentReports("src/test/resources/index.html", true);

	        // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test = extent.startTest("My First Test", "Sample description");

	        // log(LogStatus, details)
	        test.log(LogStatus.INFO, "This step shows usage of log(logStatus, details)");

	        // report with snapshot
	        String img = test.addScreenCapture("src/test/resources");
	        test.log(LogStatus.INFO, "Image", "Image example: " + img);
	        
	        // end test
	        extent.endTest(test);
	        
	        // calling flush writes everything to the log file
	        extent.flush();
	    }

}
