package day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLoginTitleVerification {
    public F2_IncorrectLoginTitleVerification() {
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        WebElement inputUsername = driver.findElement(By.id("email"));
        inputUsername.sendKeys(new CharSequence[]{"something1213@gmail.com"});
        WebElement inputPassword = driver.findElement(By.id("pass"));
        inputPassword.sendKeys(new CharSequence[]{"some wrong password" + Keys.ENTER});
        String expectedTitle = "Log into Facebook";
        System.out.println("expectedTitle = " + expectedTitle);
        Thread.sleep(20000L);
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAILED!");
        }

    }
}