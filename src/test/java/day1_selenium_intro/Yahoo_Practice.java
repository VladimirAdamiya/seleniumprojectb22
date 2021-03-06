package day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Practice {
    public Yahoo_Practice() {
    }

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yahoo.com");
        String expectedTitle = "Yahoo";
        System.out.println("expectedTitle = " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title is as expected. Verification PASSED!");
        } else {
            System.out.println("Title is not as expected. Verification FAILED!!!");
        }

        driver.close();
    }
}