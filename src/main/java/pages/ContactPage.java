package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;

public class ContactPage extends BasePage {

    private final String userName = "FirstName1";
    private final String valueToCheck = "City";

    @FindBy(xpath = "//button[@id='add-contact']")
    private WebElement addNewContactButton;

    @FindBy(xpath = "//tr/td[contains(.,'"+userName+"')]")
    private WebElement nameAdded;

    @FindBy(xpath = "//tr/td[contains(.,'"+userName+"')]/following-sibling::td[contains(.,'"+valueToCheck+"')]")
    private WebElement elementToCheck;

    By addNewContactBy = By.xpath("//button[@id='add-contact']");
    By nameAddedBy = By.xpath("//tr/td[contains(.,'"+userName+"')]");
    By valueToCheckBy = By.xpath("//tr/td[contains(.,'"+userName+"')]/following-sibling::td[contains(.,'"+valueToCheck+"')]");

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public AddContact addNewContactClick() {
        WaitUtils.visibilityOfElementLocated(addNewContactBy);
        addNewContactButton.click();
        return new AddContact(driver);
    }

    public boolean isNewNameDisplayed() {
        WaitUtils.visibilityOfElementLocated(nameAddedBy);
        return nameAdded.isDisplayed();
    }

    public boolean isValueDisplayed() {
        WaitUtils.visibilityOfElementLocated(valueToCheckBy);
        return elementToCheck.isDisplayed();
    }


}
