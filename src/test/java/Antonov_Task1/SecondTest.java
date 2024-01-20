package Antonov_Task1;

import io.cucumber.java.Before;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import java.net.MalformedURLException;
import java.net.URI;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class SecondTest extends BaseClass{




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
        btnElement4 = driver.findElement(By.xpath("//div/input[@id= 'name']"));
        btnElement4.sendKeys("Вячеслав");

        Assertions.assertEquals("Вячеслав",
                btnElement4.getAttribute("value"), "Другое значение!");

        WebElement btnElement5;
        btnElement5 = driver.findElement(By.xpath("//div/select[@id= 'type']"));
        btnElement5.click();

        WebElement Spisok = driver.findElement(By.xpath("//div/select[@id= 'type']"));
        Assertions.assertEquals("                                Овощ\n" +
                "                                Фрукт\n" +
                "                            ",Spisok.getText(), "Это не выпадающий список");

        WebElement btnElement6;
        btnElement6 = driver.findElement(By.xpath("//div/select[@id= 'type']/option[1]"));
        btnElement6.click();

        Assertions.assertEquals("Овощ", btnElement6.getText(),
                "Другой тип!");

        WebElement btnElement7;
        btnElement7 = driver.findElement(By.xpath("//div[@class='form-group form-check']/input[@id= 'exotic']"));
        btnElement7.click();

        Assertions.assertTrue(btnElement7.isSelected()==true, "Не экзотический тип");

        WebElement btnElement8;
        btnElement8 = driver.findElement(By.xpath("//button[@id= 'save']"));
        btnElement8.click();

        WebElement Sohranka = driver.findElement(By.xpath("//td[contains(text(),'Вячеслав')]"));
        Assertions.assertEquals("Вячеслав", Sohranka.getText(),
                "Товар не сохранился");

    }
}