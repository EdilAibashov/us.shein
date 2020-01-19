package tests;

import TestData.NewUserInformation;
import io.techleadacademy.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import utils.SeleniumUtils;

public class RegisterPageTest extends TestBase {
    @Test
    public void verifyRegisterPageTitle() {
        String expected = driver.getTitle();
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void verifyMyAccount() throws InterruptedException {
        NewUserInformation info = new NewUserInformation();
        RegisterPage reg = new RegisterPage();
        HomePage home = new HomePage();

        SeleniumUtils.highlightElement(home.robots);
        //home.clickSignUp();
        reg.registerNewUser();
    }
}
