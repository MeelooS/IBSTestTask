package Steps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.ru.Допустим;
import io.cucumber.java.ru.И;
import org.openqa.selenium.support.ui.Sleeper;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MyOwnSteps {
    @И("открыта страница по адресу {string}")
    public void открыта_страница_по_адресу(String string) {
        // Реализация
    }

    @И("выполнено нажатие на {string}")
    public void выполнено_нажатие_на(String string) {
        // Реализация
    }

    @И("открывается окно {string}")
    public void открывается_окно(String string) {
        // Реализация
    }

    @И("поле {string} видимо")
    public void поле_видимо(String string) {
        // Реализация
    }

    @И("поле {string} заполняется значением  {string}")
    public void поле_заполняется_значением(String string, String string2) {
        // Реализация
    }

    @И("в поле {string} выбирается значение  {string}")
    public void в_поле_выбирается_значение(String string, String string2) {
        // Реализация
    }

    @И("чекбокс {string} видимо")
    public void чекбокс(String string) {
        // Реализация
    }

    @И("выполнено нажатие на чекбокс{string}")
    public void выполнено_нажатие_на_чекбокс(String string) {
        // Реализация
    }


}
