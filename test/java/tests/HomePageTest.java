package tests;

import io.techleadacademy.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends TestBase {
    HomePage homePage;
    @BeforeMethod
    public void setUp(){
        initializer();
        homePage = new HomePage();
    }

    @Test
    public void verifyHomeTitle(){
        Assert.assertEquals(driver.getTitle(),"Shop Trendy Women's Fashion | Womens Clothing | SHEIN USA");
    }

}
