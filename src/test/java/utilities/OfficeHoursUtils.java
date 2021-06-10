package utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfficeHoursUtils {
    public static void productAdder(WebDriver driver, String category, String product){
        driver.findElement(By.xpath("//a[.='"+category+"']")).click();
        BrowserUtils.sleep(1);
        driver.findElement(By.xpath("//a[.='"+product+"']")).click();
        BrowserUtils.sleep(1);
        driver.findElement(By.xpath("//a[.='Add to cart']")).click();
        BrowserUtils.sleep(1);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        BrowserUtils.sleep(1);
        driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();
    }
}
