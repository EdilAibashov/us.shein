package tests;

import TestData.NewUserInformation;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import utils.SeleniumUtils;

public class RegisterPageTest extends RegisterPage {


    @Test(groups = {"smoke"})
    public void verifyMyAccount() throws InterruptedException {
        NewUserInformation info = new NewUserInformation();
        RegisterPage reg = new RegisterPage();
        HomePage home = new HomePage();
        SeleniumUtils.highlightElement(home.robots);
        reg.registerNewUser();
        String actual = driver.getTitle();
        Assert.assertEquals(actual, "Challenge – Revolution Robotics Foundation");

    }
}