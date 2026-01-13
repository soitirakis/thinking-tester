package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp extends BasePage {

    @FindBy(xpath = "//button[@id='signup']")
    private WebElement signUpButton;

    public SignUp(WebDriver driver) {
        super(driver);
    }

    public SignUpPage clickSignUpButton() {
        signUpButton.click();
        return new SignUpPage(driver);
    }


}
