package Steps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.ru.Допустим;
import io.cucumber.java.ru.И;
import org.openqa.selenium.support.ui.Sleeper;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MyOwnStepsDatabase {
    @И("устанавлено соединение с БД по url: {string}")
    public void устанавлено_соединение_с_БД_по_url(String string) {
        // Реализация
    }

    @И("введен логин {string}")
    public void введен_логин(String string) {
        // Реализация
    }

    @И("введен пароль {string}")
    public void введен_пароль(String string) {
        // Реализация
    }

    @И("выведем на экран данные из таблицы {string} без добавленного товара")
    public void выведем_на_экран_данные_из_таблицы(String string) {
        // Реализация
    }

    @И("данные из таблицы {string} видимы")
    public void данные_из_таблицы_видимы(String string) {
        // Реализация
    }

    @И("добавим товар {string} в таблицу {string}")
    public void добавим_товар_в_таблицу(String string, String string2) {
        // Реализация
    }

    @И("выведем на экран данные из таблицы {string} с добавленным товаром {string}")
    public void выведем_на_экран_данные_из_таблицы_с_добавленным_товаром(String string, String string2) {
        // Реализация
    }

    @И("удаляем товар {string}")
    public void удаляем_товар(String string) {
        // Реализация
    }

    @И("выведем на экран данные из таблицы {string} с удаленным товаром {string}")
    public void выведем_на_экран_данные_из_таблицы_с_удаленным_товаром(String string, String string2) {
        // Реализация
    }
}