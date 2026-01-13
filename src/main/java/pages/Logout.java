package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;

public class Logout extends BasePage{

    @FindBy(xpath = "//button[@id='logout']")
    private WebElement logoutButton;

    By logoutButtonBy = By.xpath("//button[@id='logout']");

    public Logout(WebDriver driver) {
        super(driver);
    }

    public boolean isLogoutButtonDisplayed() {
        WaitUtils.visibilityOfElementLocated(logoutButtonBy);
        return logoutButton.isDisplayed();
    }
}
