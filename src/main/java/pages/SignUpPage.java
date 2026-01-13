package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage{

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submitButton;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void addFirstName(String url){
        firstName.sendKeys(url);
    }
    public void addLastName(String url){
        lastName.sendKeys(url);
    }
    public void addEmail(String url){
        email.sendKeys(url);
    }
    public void addPassword(String url){
        password.sendKeys(url);
    }
    public ContactPage clickSubmitButton(){
        submitButton.click();
        return new  ContactPage(driver);
    }
}
