package pages;

import io.techleadacademy.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtils;

public class HomePage extends TestBase {
    HomePage homePage;
    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='site-nav__link site-nav__link--icon small--hide']")
    public WebElement robots;

    @FindBy(id = "customer_register_link")
    public WebElement Reg_Btn;




    public void ClickHomePage(){
        robots.click();
    }
    public void clickSignUp(){
        ClickHomePage();
        Reg_Btn.click();
    }
}
