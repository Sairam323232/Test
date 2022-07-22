import org.openqa.selenium.remote.tracing.Status;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.*;
import com.aventstack.extentreports.reporter.configuration.*;
import com.aventstack.extentreports.reporter.configuration.Theme;
import utiliy.CoreBrowser;

import static java.lang.System.in;


public class createLoanPage extends CoreBrowser {

//    @BeforeMethod
//    public void init() {
//        CoreBrowser.browser();
//        CoreBrowser.setUrl();
//    }
//
//    @Test(singleThreaded = true,timeOut = 5,enabled = false, alwaysRun = true,  invocationCount = 10)
//    public void launchUrl() {
//
//
//        ExtentTest logger = extent.createTest("Open Google");
//        logger.log(com.aventstack.extentreports.Status.PASS, "Browser Launched");
//
//        CoreBrowser.setUrl();
//        logger.log(com.aventstack.extentreports.Status.PASS, "URL Launched");
//    }
//
//    @Test(priority = 2, enabled = true)
//    public void trackLoan() {
//        ExtentTest logger = extent.createTest("Track Loan");
//        logger.log(com.aventstack.extentreports.Status.PASS, "Browser Launched");
//
//        CoreBrowser.setUrl();
//        logger.log(com.aventstack.extentreports.Status.PASS, "URL Launched");
//    }
//
//    @Test(priority = 3, enabled = true)
//    public void updateBrokerDetails() {
//        ExtentTest logger = extent.createTest("Update Broker Details");
//        logger.log(com.aventstack.extentreports.Status.PASS, "Browser Launched");
//
//        CoreBrowser.setUrl();
//        logger.log(com.aventstack.extentreports.Status.PASS, "URL Launched");
//    }
}
