package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@id='email']")
    private WebElement loginEmail;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement loginPassword;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//span[@id='error']")
    private WebElement errorMessage;

    By errorMessageBy = By.xpath("//span[@id='error']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void addLoginEmail(String email) {
        loginEmail.sendKeys(email);
    }
    public void addLoginPassword(String password) {
        loginPassword.sendKeys(password);
    }
    public ContactPage clickLoginButton() {
        loginButton.click();
        return new ContactPage(driver);
    }
    public boolean isLoginErrorDisplayed() {
        //WaitUtils.visibilityOfElementLocated(errorMessageBy);
        return errorMessage.isDisplayed();
    }

}
