package Antonov_Task1;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;


public class BaseClass {

    protected static WebDriver driver = new ChromeDriver();
    @BeforeAll()

    public static void s1(){

        driver.get("http://149.154.71.152:8080/food");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement titleSpisokTovarov = driver.findElement(By.xpath("//div[@class='container-fluid']/h5"));
        Assertions.assertEquals("Список товаров", titleSpisokTovarov.getText(),
                "Список товаров не открылся");

    }
   @AfterAll()

     public static void s2(){
        driver.quit();
     }
}
