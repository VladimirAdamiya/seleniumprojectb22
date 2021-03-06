package day4_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class P6_xpath_MultipleButtons {
    public P6_xpath_MultipleButtons() {
    }

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        String expectedText = "Clicked on button one!";
        String actualText = resultText.getText();
        if (actualText.equals(expectedText)) {
            System.out.println("Result text verification PASSED!");
        } else {
            System.out.println("Result text verification FAILED!!!");
        }

    }
}