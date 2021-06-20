package day12_action_upload_jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.Driver;

public class JSExecutorPractices {

    @Test
    public void scroll_using_jsExecutor_test1(){

        //Get the page: http://practice.cybertekschool.com/infinite_scroll

        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");

        //((JavascriptExecutor) Driver.getDriver()).executeScript("")
        BrowserUtils.sleep(2);
        // Down casting our driver type to JavascriptExecutor so we can reach methods in this interface
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //using js we reach executeScript method so we are allowed to pass JavaScript functions.
        //this method is capable of accepting JavaScript functions and apply that into our Java+Selenium code

        //in each iteration, it will scroll down 750 pixels
        for (int i = 0; i < 10; i++) {

            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0, 750)");

        }
        // this would go 750 pixels up
        js.executeScript("window.scrollBy(0, -750)");

    }
    @Test
    public void scroll_using_jsExecutor_test2(){
        //Go to this page: http://practice.cybertekschool.com/large
        Driver.getDriver().get("http://practice.cybertekschool.com/large");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        WebElement cybertekSchoolLink= Driver.getDriver().findElement(By.linkText("Cybertek School"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("home"));

        // use js.executor with different scrolling JavaScript function
        js.executeScript("arguments[0].scrollIntoView(true)", cybertekSchoolLink);

        //scroll up to Home Link
        BrowserUtils.sleep(1);
        js.executeScript("arguments[0].scrollIntoView(true)", homeLink);
    }
}