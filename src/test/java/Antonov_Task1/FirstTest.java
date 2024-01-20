package Antonov_Task1;
import io.cucumber.java.Before;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.lang.module.Configuration;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;
import java.net.MalformedURLException;
import java.net.URI;


public class FirstTest extends BaseClass {


    @Test
    public void test() throws InterruptedException {


        driver.get("http://149.154.71.152:8080/food");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement titleSpisokTovarov = driver.findElement(By.xpath("//div[@class='container-fluid']/h5"));
        Assertions.assertEquals("Список товаров", titleSpisokTovarov.getText(),
                "Список товаров не открылся");

        WebElement btnElement3;
        btnElement3 = driver.findElement(By.xpath("//div/button [@type = 'button' and " +
                "contains(text(), 'Добавить')]"));
        btnElement3.click();
        Thread.sleep(1000);

        WebElement titleDobavka = driver.findElement(By.xpath("//div[@class='modal-header']/h5"));
        Assertions.assertEquals("Добавление товара", titleDobavka.getText(),
                "Окошко добавления товаров не открылось");


        WebElement btnElement4;
        btnElement4 = driver.findElement(By.xpath("//input[@placeholder='Наименование' and @id='name']"));
        btnElement4.sendKeys("!\"№;%:?*()_+/ЭЖХЪ,ЮБ12312роффшkjhjksojhiHDhuhUHГРГРои");

        Thread.sleep(1000);

        Assertions.assertEquals("!\"№;%:?*()_+/ЭЖХЪ,ЮБ12312роффшkjhjksojhiHDhuhUHГРГРои",
                btnElement4.getAttribute("value"), "Другое значение!");


        WebElement btnElement5;
        btnElement5 = driver.findElement(By.xpath("//div/select[@id= 'type']"));
        btnElement5.click();

        Assertions.assertEquals("                                Овощ\n" +
                "                                Фрукт\n" +
                "                            ",btnElement5.getText(), "Это не выпадающий список");



        WebElement btnElement6;
        btnElement6 = driver.findElement(By.xpath("//div/select[@id= 'type']/option[2]"));
        btnElement6.click();

        Assertions.assertEquals("Фрукт", btnElement6.getText(),
                "Другой тип!");


        WebElement btnElement7;
        btnElement7 = driver.findElement(By.xpath("//button[@id= 'save']"));
        btnElement7.click();

        WebElement Sohranka = driver.findElement(By.xpath("//td[contains(text(),"+
                "'!\"№;%:?*()_+/ЭЖХЪ,ЮБ12312роффшkjhjksojhiHDhuhUHГРГРои')]"));
        Assertions.assertEquals("!\"№;%:?*()_+/ЭЖХЪ,ЮБ12312роффшkjhjksojhiHDhuhUHГРГРои", Sohranka.getText(),
                "Товар не сохранился");


    }


}
