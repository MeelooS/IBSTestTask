package Steps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.ru.Допустим;
import io.cucumber.java.ru.И;
import org.openqa.selenium.support.ui.Sleeper;

import java.sql.*;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MyOwnStepsDatabase {
    @Допустим ("устанавлено соединение с БД по url: {string}, введен логин {string}, введен пароль {string}")
    public void устанавлено_соединение_с_БД_по_url_введен_логин_введен_пароль
            (String string, String string2, String string3) throws SQLException {
        Connection connection =
                DriverManager.getConnection("jdbc:h2:tcp://localhost:9092/mem:testdb" ,
                        "user",
                        "pass");
    }


    @Допустим("выведем на экран данные из таблицы {string} без добавленного товара")
    public void выведем_на_экран_данные_из_таблицы(String string) throws SQLException {
        System.out.println("Выведем таблицу с изначальными данными");
        Connection connection =
                DriverManager.getConnection("jdbc:h2:tcp://localhost:9092/mem:testdb",
                        "user",
                        "pass");
        Statement statement = connection.createStatement();
        PreparedStatement prepare1 = connection.prepareStatement("select * from FOOD");
        ResultSet resultSet = prepare1.executeQuery();
        while (resultSet.next()) {
            int food_id = resultSet.getInt("FOOD_ID");
            ;
            String food_name = resultSet.getString("FOOD_NAME");
            ;
            String food_type = resultSet.getString("FOOD_TYPE");
            ;
            int food_exotic = resultSet.getInt("FOOD_EXOTIC");
            ;
            System.out.printf("%d, %s, %s, %d\n", food_id, food_name, food_type, food_exotic);
        }
    }

    @Допустим("добавляем новый товар {string}")
    public void добавляем_новый_товар(String string) throws SQLException {
        System.out.println("Добавляем товар дуриан...");
        Connection connection =
                DriverManager.getConnection("jdbc:h2:tcp://localhost:9092/mem:testdb",
                        "user",
                        "pass");
        String insert =
                "INSERT INTO  FOOD (food_id, food_name,food_type, food_exotic) " +
                        "values (?, ?, ?, ?)";
        PreparedStatement prst = connection.prepareStatement(insert);
        prst.setInt(1,5);
        prst.setString(2, "Дуриан");
        prst.setString(3, "FRUIT");
        prst.setInt(4,1);
        prst.executeUpdate();
    }


    @Допустим("выведем на экран данные из таблицы {string} с добавленным товаром {string}")
    public void выведем_на_экран_данные_из_таблицы_с_добавленным_товаром(String string, String string2) throws SQLException {
        System.out.println("Выведем таблицу с добавленным товаром");
        Connection connection =
                DriverManager.getConnection("jdbc:h2:tcp://localhost:9092/mem:testdb",
                        "user",
                        "pass");
        Statement statement = connection.createStatement();
        PreparedStatement prepare2 = connection.prepareStatement("select * from FOOD");
        ResultSet resSet = prepare2.executeQuery();
        while(resSet.next()){
            int food_id = resSet.getInt("FOOD_ID");;
            String food_name = resSet.getString("FOOD_NAME"); ;
            String food_type = resSet.getString("FOOD_TYPE"); ;
            int food_exotic = resSet.getInt("FOOD_EXOTIC");;
            System.out.printf("%d, %s, %s, %d\n", food_id, food_name, food_type, food_exotic);
        }
    }

    @Допустим("удаляем товар {string}")
    public void удаляем_товар(String string) throws SQLException {
        System.out.println("Удаляем товар дуриан...");
        Connection connection =
                DriverManager.getConnection("jdbc:h2:tcp://localhost:9092/mem:testdb",
                        "user",
                        "pass");
        PreparedStatement statement1 = connection.prepareStatement("DELETE FROM FOOD p WHERE p.FOOD_NAME=?");
        statement1.setString(1, "Дуриан");
        statement1.executeUpdate();
    }

    @Допустим("выведем на экран данные из таблицы {string} с удаленным товаром {string}")
    public void выведем_на_экран_данные_из_таблицы_с_удаленным_товаром(String string, String string2) throws SQLException {
        System.out.println("Выведем таблицу с удаленным товаром");
        Connection connection =
                DriverManager.getConnection("jdbc:h2:tcp://localhost:9092/mem:testdb",
                        "user",
                        "pass");
        PreparedStatement prepare3 = connection.prepareStatement("select * from FOOD");
        ResultSet rs = prepare3.executeQuery();
        while(rs.next()){
            int food_id = rs.getInt("FOOD_ID");;
            String food_name = rs.getString("FOOD_NAME"); ;
            String food_type = rs.getString("FOOD_TYPE"); ;
            int food_exotic = rs.getInt("FOOD_EXOTIC");;
            System.out.printf("%d, %s, %s, %d\n", food_id, food_name, food_type, food_exotic);
        }
    }
}