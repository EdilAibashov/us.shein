package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends HomePage{
    public HomePageTest() {
        super();
    }
    HomePage homePage;

    @BeforeMethod
    public void setUp(){
        homePage = new HomePage();


    }
    @Test
    public void verifyHomeTitle(){
        String actual = driver.getTitle();
        Assert.assertEquals(actual, "Revolution Robotics Foundation");

    }


}
