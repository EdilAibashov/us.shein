package tests;

import io.techleadacademy.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.SeleniumUtils;

public class HomePageTest extends TestBase {
    public HomePageTest() {
        super();
    }
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        homePage = new HomePage();


    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void verifyHomeTitle(){
        SeleniumUtils.sleep(3000);
        Assert.assertEquals(driver.getTitle(),"Revolution Robotics Foundation");
        SeleniumUtils.sleep(3000);
    }

    @Test
    public void testLogIn_Btn(){
        SeleniumUtils.click(homePage.robots);
        SeleniumUtils.click(homePage.Reg_Btn);

    }


}
