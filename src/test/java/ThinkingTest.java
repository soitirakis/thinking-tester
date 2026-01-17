import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import utils.Constants;
import driver.DriverFactory;

public class ThinkingTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        DriverFactory.closeDriver();
    }

    private ContactPage login() {
        HomePage homePage = new HomePage(driver);
        homePage.open();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.addLoginEmail(Constants.loginEmail);
        loginPage.addLoginPassword(Constants.loginPassword);

        return loginPage.clickLoginButton();
    }

    @Test
    public void thinkingPOMTest() {
//      A. Navigate to homePage
        HomePage homePage = new HomePage(driver);
        homePage.open();

        Assert.assertTrue(homePage.isHeadingDisplayed(), "Page not loaded");

    }
    @Test
    public void loginTest() {
//      B. Login
        ContactPage contactPage = login();
        Assert.assertTrue(contactPage.contactListHeadingIsDisplayed(), "Page not loaded");
    }

    @Test
    public void signUpTest() {
//      C. SignUp using predefined user
        HomePage homePage = new HomePage(driver);
        homePage.open();

        SignUp singUp = new SignUp(driver);
        SignUpPage signUpPage = singUp.clickSignUpButton();

        signUpPage.addFirstName(Constants.firstName);
        signUpPage.addLastName(Constants.lastName);
        signUpPage.addEmail(Constants.newUserEmail);
        signUpPage.addPassword(Constants.newUserPassword);
        ContactPage contactPage = signUpPage.clickSubmitButton();;

        Assert.assertTrue(contactPage.contactListHeadingIsDisplayed(), "Page not loaded");
    }

    @Test
    public void addContactTest() {
//      D. Add new contact
        ContactPage contactPage = login();

        AddContact addContact = contactPage.addNewContactClick();
        addContact.addFirstName(Constants.addContactFirstName);
        addContact.addLastName(Constants.addContactLastName);
        addContact.addEmail(Constants.addContactEmail);
        addContact.addDateOfBirth(Constants.addContactBirthDate);
        addContact.addStreetAddress1(Constants.addContactStreet1);
        addContact.addStreetAddress2(Constants.addContactStreet2);
        addContact.addCity(Constants.addContactCity);
        addContact.addPostalCode(Constants.addContactPostalCode);
        addContact.addCountry(Constants.addContactCountry);
        addContact.addState(Constants.addContactState);
        addContact.addSubmit();

        Assert.assertTrue(contactPage.isNewNameDisplayed(), "New name is not displayed");
        Assert.assertTrue(contactPage.isValueDisplayed(), "Value is not displayed");
    }
}
