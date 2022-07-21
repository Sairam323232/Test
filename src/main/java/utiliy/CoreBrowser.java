package utiliy;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class CoreBrowser {
    protected ExtentKlovReporter htmlReporter;
    protected static ExtentReports extent;
    protected static ExtentTest logger;
    public static WebDriver driver;

    @BeforeTest
    public void startReport() {
        htmlReporter = new ExtentKlovReporter(System.getProperty("user.dir") + "/src/test/java/in/com/selenium/Reports/AutomationRepot.html");
        System.out.println(System.getProperty("user.dir") + "/src/test/java/in/com/selenium/Reports/AutomationRepot.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Environment", "Test");
        extent.setSystemInfo("Environment", config.url);

        htmlReporter.setReportName("Automation Test Report");
        htmlReporter.initWithDefaultSettings();
    }

    @AfterSuite
    public void getResult() {
        extent.flush();
    }

    @AfterTest
    public void Close() throws Exception {
        CoreBrowser.closeUrl();
    }

    public static void browser() {
        String path = System.getProperty("user.dir");
        String browser = config.browser;
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
//			System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\chromedriver.exe");
                driver = new ChromeDriver();
                break;

            case "firefox":

//			System.setProperty("webdriver.gecko.driver", path + "\\fox\\geckodriver");
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
//			System.setProperty("webdriver.gecko.driver", path + "\\fox\\geckodriver");
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriverManager().getWebDriver();
                break;
            case "ie":
//			System.setProperty("webdriver.gecko.driver", path + "\\fox\\geckodriver");
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
        }
    }

    public static void setUrl() {
        driver.get(config.url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public static void closeUrl() throws Exception {
        Thread.sleep(1000);
        driver.close();
    }

}
