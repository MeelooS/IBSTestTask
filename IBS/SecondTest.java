package org.IBS;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SecondTest extends BaseClass{

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

        WebElement titleOwosh = driver.findElement(By.xpath("//div/select[@id= 'type']/option[1]"));
        Assertions.assertEquals("Овощ", titleOwosh.getText(),
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