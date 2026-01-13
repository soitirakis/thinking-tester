import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import utils.Constants;
import utils.DriverFactory;

public class ThinkingTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

   /* @AfterMethod
    public void tearDown(){
        DriverFactory.closeDriver();
    }*/

    @Test
    public void thinkingPOMTest() {
//      A. Navigate to homePage
        HomePage homePage = new HomePage(driver);
        homePage.open();
//      B. Login if user already exist
        LoginPage loginPage = new LoginPage(driver);
        loginPage.addLoginEmail(Constants.email);
        loginPage.addLoginPassword(Constants.password);
        ContactPage contactPage = null;
        contactPage = loginPage.clickLoginButton();

        if (loginPage.isLoginErrorDisplayed()) {
            System.out.println("Login Error");
//      B. SignUp using predefined user
            SignUp singUp = new SignUp(driver);
            SignUpPage signUpPage = singUp.clickSignUpButton();
            signUpPage.addFirstName(Constants.firstName);
            signUpPage.addLastName(Constants.lastName);
            signUpPage.addEmail(Constants.email);
            signUpPage.addPassword(Constants.password);
            contactPage = signUpPage.clickSubmitButton();
        } else {
            System.out.println("Login successful");
        }
//      C. Add new contact
        AddContact addContact = contactPage.addNewContactClick();
    }
}
