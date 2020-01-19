package pages;

import TestData.NewUserInformation;
import io.techleadacademy.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtils;

public class RegisterPage extends TestBase {
    public RegisterPage() {
        super();
        PageFactory.initElements(driver, this);
    }

    NewUserInformation user = new NewUserInformation();
    @FindBy(id = "FirstName")
    public WebElement firstName;

    @FindBy(id = "LastName")
    public WebElement lastName;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "CreatePassword")
    public WebElement password;

    @FindBy(xpath = "//input[@class='btn btn--full']")
    public WebElement signUp_Btn;


    public void navigateToRegisterPage() {
        HomePage homePage = new HomePage();
    }

    public void registerNewUser() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.clickSignUp();
        Thread.sleep(2000);
        SeleniumUtils.sendKeys(firstName, user.getFirstName());
        SeleniumUtils.sendKeys(lastName, user.getLastName());
        SeleniumUtils.sendKeys(email, user.getEmail());
        SeleniumUtils.sendKeys(password, user.getPassword());


        clickSignUp();
    }

    public void clickSignUp() {
        SeleniumUtils.click(signUp_Btn);
    }

    public String getTilte() {
        return driver.getTitle();
    }
}