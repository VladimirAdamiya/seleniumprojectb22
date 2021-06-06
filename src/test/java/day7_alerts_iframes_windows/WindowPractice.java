package day7_alerts_iframes_windows;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class WindowPractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

       // driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");
    }
    @Test
    public void window_test(){
        //4. Assert: Title is “Practice”
        String actualTitleBeforeClick = driver.getTitle();
        String expectedTitleBeforeClick = "Practice";

        //5. Click to: “Click Here” text
        //6. Switch to new Window.
        //7. Assert: Title is “New Window”
    }
}