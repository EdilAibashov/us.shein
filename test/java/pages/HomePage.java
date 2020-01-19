package pages;

import io.techleadacademy.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtils;

public class HomePage extends TestBase {
    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//i[@class='iconfont icon-close she-close'])[22]")
    public WebElement close;

    @FindBy(xpath = "//a[@title='MEN']")
    public WebElement Men_Btn;

    public void navigateToHomePage(){
        SeleniumUtils.click(close);
        SeleniumUtils.highlightElement(Men_Btn);
        SeleniumUtils.click(Men_Btn);
    }



}
