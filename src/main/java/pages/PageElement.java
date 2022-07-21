package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageElement {
    PageElement(){
    }
    @FindBy(how = How.XPATH, using = ".//*[text()='No thanks']")
    public static WebElement POP_UP_BUTTON;
    @FindBy(how = How.XPATH, using = ".//*[text()='Sign in']/../.././../../.././following-sibling::div[2]/form/div/div/div/div/div[2]/input")
    public static WebElement GOOGLE_SEARCH_INPUT;

    @FindBy(how = How.XPATH, using = ".//*[@aria-label='Google Search']")
    public static WebElement GOOGLE_SEARCH;
    @FindBy(how = How.XPATH, using = ".//*[@name='email']")
    public static WebElement GMAIL_EMAIL_INPUT;

    @FindBy(how = How.XPATH, using = ".//*[@name='password']")
    public static WebElement GMAIL_PASSWORD_INPUT;
}
