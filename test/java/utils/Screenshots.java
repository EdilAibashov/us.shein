package utils;

import io.techleadacademy.base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class Screenshots extends TestBase {
    public static void captureScreenShot(String screenshotName){
        try{
            File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("./src/main/resources/ScreenShots/" + screenshotName + ".jpeg"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
