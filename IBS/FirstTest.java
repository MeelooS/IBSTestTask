package org.IBS;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;


public class FirstTest extends BaseClass{


    @Test
    void test() throws InterruptedException {



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

        WebElement Spisok = driver.findElement(By.xpath("//div/select[@id= 'type']"));
        Assertions.assertEquals("                                Овощ\n" +
                "                                Фрукт\n" +
                "                            ",Spisok.getText(), "Это не выпадающий список");



        WebElement btnElement6;
        btnElement6 = driver.findElement(By.xpath("//div/select[@id= 'type']/option[2]"));
        btnElement6.click();

        WebElement titleFrukt = driver.findElement(By.xpath("//div/select[@id= 'type']/option[2]"));
        Assertions.assertEquals("Фрукт", titleFrukt.getText(),
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
