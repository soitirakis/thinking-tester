package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Constants;
import driver.WaitUtils;

public class HomePage extends BasePage{

    @FindBy(xpath = "//h1[contains(.,'Contact List App')]")
    private WebElement pageTitle;

    By pageTitleBy =  By.xpath("//h1[contains(.,'Contact List App')]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage open() {
        navigate(Constants.PAGE_URL);
        return this;
    }

    public boolean isHeadingDisplayed() {
        WaitUtils.visibilityOfElementLocated(pageTitleBy);
        return pageTitle.isDisplayed();
    }
}
