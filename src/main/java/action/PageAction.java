package action;

import org.openqa.selenium.WebDriver;
import pages.PageElement;
import utiliy.WebDriverDependancy;

import java.util.Iterator;
import java.util.Set;

public class PageAction {
    WebDriver driver;
    private WebDriverDependancy dependancy;

    public PageAction(WebDriverDependancy dependancy) {
        this.dependancy = dependancy;
        this.driver =dependancy.webDriver;
    }

    public void switchWindow() throws InterruptedException {
        String mainWindow = new String();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> itr = windows.iterator();
        while (itr.hasNext()) {
            String childWindow = itr.next();
            if (!childWindow.equals(mainWindow)) {
                driver.switchTo().window(childWindow);
                    PageElement.POP_UP_BUTTON.click();
                Thread.sleep(1000);
                driver.switchTo().window(mainWindow);
            }
        }
    }}
