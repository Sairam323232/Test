
import java.util.List;
import java.util.concurrent.TimeUnit;

import action.PageAction;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import pages.PageElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import utiliy.CoreBrowser;
import utiliy.WebDriverDependancy;

public class Testing {
    WebDriver driver;
    PageAction act;

    @BeforeMethod
    public void initMethod() {
        CoreBrowser.browser();
        CoreBrowser.setUrl();
        PageFactory.initElements(driver, PageElement.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test(priority = 0)
    public void shouldAnswerWith() throws InterruptedException {
        PageFactory.initElements(driver, PageElement.class);
        PageElement.GOOGLE_SEARCH_INPUT.sendKeys("GMAIL lo");
        PageElement.GOOGLE_SEARCH_INPUT.sendKeys(Keys.ENTER);
        List<WebElement> list = driver.findElements(By.tagName("a"));
        for (WebElement w : list) {
            if (w.getText().contains("Login - GMAIL")) {
                w.click();
            }
        }
    }

    @Test(priority = 1)
    public void logInGMAIL() {
        PageFactory.initElements(driver, PageElement.class);
        PageElement.GMAIL_EMAIL_INPUT.sendKeys("sobhaxyz@gmail.com");
        PageElement.GMAIL_PASSWORD_INPUT.sendKeys("xyzyush");
    }

    @AfterTest
    void close() throws Exception {
        CoreBrowser.closeUrl();
    }

}
