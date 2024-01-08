package org.IBS;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SecondTest {

    @Test
    void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.setProperty("webdriver.chromedriver.driver",
                "C:\\Users\\Admin\\IdeaProjects\\first-project-antonov\\src\\test\\resources\\chromedriver.exe");

        driver.get("http://localhost:8080");

        WebElement btnElement1;
        btnElement1 = driver.findElement(By.xpath("//*[contains(text(), \"Песочница\")]"));
        btnElement1.click();

        WebElement btnElement2;
        btnElement2 = driver.findElement(By.xpath("//a[@class = \"dropdown-item\" and contains(text(), \"Товары\")]"));
        btnElement2.click();

        WebElement btnElement3;
        btnElement3 = driver.findElement(By.xpath("//div/button [@type = \"button\" and " +
                "contains(text(), \"Добавить\")]"));
        btnElement3.click();

        WebElement btnElement4;
        btnElement4 = driver.findElement(By.xpath("//div/input[@id= \"name\"]"));
        btnElement4.sendKeys("Вячеслав");

        WebElement btnElement5;
        btnElement5 = driver.findElement(By.xpath("//div/select[@id= \"type\"]"));
        btnElement5.click();

        WebElement btnElement6;
        btnElement6 = driver.findElement(By.xpath("//div/select[@id= \"type\"]/option[1]"));
        btnElement6.click();

        WebElement btnElement7;
        btnElement7 = driver.findElement(By.xpath("//div[@class=\"form-group form-check\"]/input[@id= \"exotic\"]"));
        btnElement7.click();

        WebElement btnElement8;
        btnElement8 = driver.findElement(By.xpath("//button[@id= \"save\"]"));
        btnElement8.click();

    }
}