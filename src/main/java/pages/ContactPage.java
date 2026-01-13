package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WaitUtils;

public class ContactPage extends BasePage {

    @FindBy(xpath = "//button[@id='add-contact']")
    private WebElement addNewContactButton;

    By addNewContactBy = By.xpath("//button[@id='add-contact']");

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public AddContact addNewContactClick() {
        WaitUtils.visibilityOfElementLocated(addNewContactBy);
        addNewContactButton.click();
        return new AddContact(driver);
    }

}
