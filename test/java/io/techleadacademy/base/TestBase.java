package io.techleadacademy.base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver = null;
    public static final String propertyPath = "src/main/resources/configurations/configurations.properties";
    private static long implicitWait = Long.parseLong(ConfigReader.readProperty(propertyPath,"implicitWait"));
    private static String url = ConfigReader.readProperty(propertyPath, "url");
    private static String browser = ConfigReader.readProperty(propertyPath, "browser");



    public TestBase(){
        getDriver();
    }

    @BeforeMethod
    public void setUp(){
        initialize(ConfigReader.readProperty(propertyPath,"browser"));
    }

//    @AfterMethod
//    public void tearDown(){
//        closeDriver();
//    }


    public static void initialize(String browser){
        if (driver != null )
            return;
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            default:
                System.out.println("Invalid browser type");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        driver.get(url);
    }
    public static void closeDriver(){
        if (driver != null){
            driver.close();
            driver = null;
        }
    }

    public static void quitDriver(){
        if (driver!=null)
            driver.quit();
        driver = null;
    }

    public void getDriver(){
        if (driver != null)
            return;
        initialize(ConfigReader.readProperty(propertyPath,"browser"));
    }
    public static void initializer(){
        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        driver.get(url);
    }




}


