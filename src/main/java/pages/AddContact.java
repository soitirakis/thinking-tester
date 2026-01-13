package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddContact extends BasePage{

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastName;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;
    @FindBy(xpath = "//input[@id='birthdate']")
    private WebElement dateOfBirth;
    @FindBy(xpath = "//input[@id='phone']")
    private WebElement phoneNumber;
    @FindBy(xpath = "//input[@id='street1']")
    private WebElement streetAddress1;
    @FindBy(xpath = "//input[@id='street2']")
    private WebElement streetAddress2;
    @FindBy(xpath = "//input[@id='city']")
    private WebElement city;
    @FindBy(xpath = "//input[@id='stateProvince']")
    private WebElement state;
    @FindBy(xpath = "//input[@id='postalCode']")
    private WebElement postalCode;
    @FindBy(xpath = "//input[@id='country']")
    private WebElement country;
    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submitButton;

    public AddContact(WebDriver driver) {
        super(driver);
    }

    public void addFirstName(String url) {
        firstName.sendKeys(url);
    }
    public void addLastName(String url) {
        lastName.sendKeys(url);
    }
    public void addEmail(String url) {
        email.sendKeys(url);
    }
    public void addDateOfBirth(String url) {
        dateOfBirth.sendKeys(url);
    }
    public void addPhoneNumber(String url) {
        phoneNumber.sendKeys(url);
    }
    public void addStreetAddress1(String url) {
        streetAddress1.sendKeys(url);
    }
    public void addStreetAddress2(String url) {
        streetAddress2.sendKeys(url);
    }
    public void addCity(String url) {
        city.sendKeys(url);
    }
    public void addPostalCode(String url) {
        postalCode.sendKeys(url);
    }
    public void addState(String url) {
        state.sendKeys(url);
    }
    public void addCountry(String url) {
        country.sendKeys(url);
    }
    public void addSubmit() {
        submitButton.click();
    }
}
