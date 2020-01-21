package tests;

import TestData.ListOfProducts;
import io.techleadacademy.base.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ShopPage;
import utils.SeleniumUtils;

import java.util.List;
import java.util.Set;

public class ShopPageTest extends ShopPage {


    @Test(groups = {"smoke"})
    public void verifyShop() {
        ShopPage title = new ShopPage();
        SeleniumUtils.highlightElement(title.shop_Btn);
        shop_Btn.click();
        String actual = driver.getTitle();
        Assert.assertEquals(actual, "Products – Revolution Robotics Foundation");
        product_Btn.click();
        List<WebElement> List = List_Btn;
        for (WebElement ls : List) {
            System.out.println(ls.getText());
        }
        SeleniumUtils.highlightElement(addToCard_Btn);
        addToCard_Btn.click();
        SeleniumUtils.highlightElement(plus_Btn);
        plus_Btn.click();
        SeleniumUtils.highlightElement(close_Btn);
        close_Btn.click();
        SeleniumUtils.highlightElement(closeMenu_Btn);
        closeMenu_Btn.click();

    }
}
