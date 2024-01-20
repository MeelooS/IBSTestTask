package Steps;
import Antonov_Task1.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.ru.Допустим;
import io.cucumber.java.ru.И;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;



public class MyOwnSteps extends BaseClass {
    @И("открыта страница по адресу {string}")
    public void открыта_страница_по_адресу(String string) {
        driver.get("http://149.154.71.152:8080/food");
    }

    @И("открывается меню {string}")
    public void открывается_меню(String string) {
        WebElement titleSpisokTovarov = driver.findElement(By.xpath("//div[@class='container-fluid']/h5"));
        Assertions.assertEquals("Список товаров", titleSpisokTovarov.getText(),
                "Список товаров не открылся");
    }

    @И("выполнено нажатие на {string}")
    public void выполнено_нажатие_на(String string) throws InterruptedException {
        WebElement btnElement3;
        btnElement3 = driver.findElement(By.xpath("//div/button [@type = 'button' and " +
                "contains(text(), 'Добавить')]"));
        btnElement3.click();
        Thread.sleep(1000);
    }

    @И("открывается окно {string}")
    public void открывается_окно(String string) {
        WebElement titleDobavka = driver.findElement(By.xpath("//div[@class='modal-header']/h5"));
        Assertions.assertEquals("Добавление товара", titleDobavka.getText(),
                "Окошко добавления товаров не открылось");
    }

    @И("поле {string} видимо")
    public void поле_видимо(String string)  {
        WebElement btnElement4;
        btnElement4 = driver.findElement(By.xpath("//input[@placeholder='Наименование' and @id='name']"));
    }

    @И("поле {string} заполняется значением  {string}")
    public void поле_заполняется_значением(String string, String string2) {
        WebElement btnElement4;
        btnElement4 = driver.findElement(By.xpath("//div/input[@id= 'name']"));
        btnElement4.sendKeys("!\"№;%:?*()_+/ЭЖХЪ,ЮБ12312роффшkjhjksojhiHDhuhUHГРГРои");
        Assertions.assertEquals("!\"№;%:?*()_+/ЭЖХЪ,ЮБ12312роффшkjhjksojhiHDhuhUHГРГРои",
                btnElement4.getAttribute("value"), "Другое значение!");
    }
    @И("поле1 {string} заполняется значением  {string}")
    public void поле1_заполняется_значением(String string, String string2) {
        WebElement btnElement4;
        btnElement4 = driver.findElement(By.xpath("//div/input[@id= 'name']"));
        btnElement4.sendKeys("Вячеслав");

        Assertions.assertEquals("Вячеслав",
                btnElement4.getAttribute("value"), "Другое значение!");
    }


    @И("поле1 {string} видимо")
    public void поле1_видимо(String string)  {
        WebElement btnElement5;
        btnElement5 = driver.findElement(By.xpath("//div/select[@id= 'type']"));
    }

    @И("в поле {string} выбирается значение  {string}")
    public void в_поле_выбирается_значение(String string, String string2) {
        WebElement btnElement6;
        btnElement6 = driver.findElement(By.xpath("//div/select[@id= 'type']/option[2]"));
        btnElement6.click();
        Assertions.assertEquals("Фрукт", btnElement6.getText(),
                "Другой тип!");
    }

    @И("в поле1 {string} выбирается значение  {string}")
    public void в_поле1_выбирается_значение(String string, String string2) {
        WebElement btnElement6;
        btnElement6 = driver.findElement(By.xpath("//div/select[@id= 'type']/option[1]"));
        btnElement6.click();

        Assertions.assertEquals("Овощ", btnElement6.getText(),
                "Другой тип!");
    }

    @И("чекбокс {string} видим")
    public void чекбокс(String string) {
        WebElement btnElement7;
        btnElement7 = driver.findElement(By.xpath("//div[@class='form-group form-check']/input[@id= 'exotic']"));
    }

    @И("выполнено нажатие на чекбокс{string}")
    public void выполнено_нажатие_на_чекбокс(String string) {
        WebElement btnElement7;
        btnElement7 = driver.findElement(By.xpath("//div[@class='form-group form-check']/input[@id= 'exotic']"));
        btnElement7.click();
    }

    @И("кнопка {string} видима")
    public void кнопка_видима(String string) {
        WebElement btnElement7;
        btnElement7 = driver.findElement(By.xpath("//button[@id= 'save']"));
    }

    @И("выполнено нажатие1 на {string}")
    public void выполнено_нажатие1_на(String string) {
        WebElement btnElement7;
        btnElement7 = driver.findElement(By.xpath("//button[@id= 'save']"));
        btnElement7.click();
    }

    @И("добавленный товар {string} сохранился")
    public void добавленный_товар_сохранился(String string) {
        WebElement Sohranka = driver.findElement(By.xpath("//td[contains(text(),"+
                "'!\"№;%:?*()_+/ЭЖХЪ,ЮБ12312роффшkjhjksojhiHDhuhUHГРГРои')]"));
        Assertions.assertEquals("!\"№;%:?*()_+/ЭЖХЪ,ЮБ12312роффшkjhjksojhiHDhuhUHГРГРои", Sohranka.getText(),
                "Товар не сохранился");
    }

    @И("добавленный товар1 {string} сохранился")
    public void добавленный_товар1_сохранился(String string) {
        WebElement Sohranka = driver.findElement(By.xpath("//td[contains(text(),'Вячеслав')]"));
        Assertions.assertEquals("Вячеслав", Sohranka.getText(),
                "Товар не сохранился");
    }




}
