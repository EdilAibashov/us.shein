package TestData;

import io.techleadacademy.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.ShopPage;
import utils.SeleniumUtils;

import java.util.List;

public class ListOfProducts extends ShopPage {
    public ListOfProducts() {
        super();
        PageFactory.initElements(driver, this);
    }

}




