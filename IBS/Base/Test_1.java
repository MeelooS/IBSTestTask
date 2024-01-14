package data.Base;
import org.h2.tools.Server;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.util.Properties;

import static java.sql.ResultSet.TYPE_SCROLL_SENSITIVE;

public class Test_1 {
    @Test
    public void Throne() throws SQLException {
        Connection connection =
                DriverManager.getConnection("jdbc:h2:tcp://localhost:9092/mem:testdb" ,
                        "user",
                        "pass");
        Statement statement = connection.createStatement();
        PreparedStatement prepare1 = connection.prepareStatement("select * from FOOD");
        ResultSet resultSet = prepare1.executeQuery();
        System.out.println("Выведем таблицу с изначальными данными");
        while(resultSet.next()){
            int food_id = resultSet.getInt("FOOD_ID");;
            String food_name = resultSet.getString("FOOD_NAME"); ;
            String food_type = resultSet.getString("FOOD_TYPE"); ;
            int food_exotic = resultSet.getInt("FOOD_EXOTIC");;
            System.out.printf("%d, %s, %s, %d\n", food_id, food_name, food_type, food_exotic);
        }

        System.out.println("Добавляем товар дуриан...");

        String insert =
                "INSERT INTO  FOOD (food_id, food_name,food_type, food_exotic) " +
                        "values (?, ?, ?, ?)";
        PreparedStatement prst = connection.prepareStatement(insert);
        prst.setInt(1,5);
        prst.setString(2, "Дуриан");
        prst.setString(3, "FRUIT");
        prst.setInt(4,1);
        prst.executeUpdate();
        PreparedStatement prepare2 = connection.prepareStatement("select * from FOOD");
        ResultSet resSet = prepare2.executeQuery();
        System.out.println("Выведем таблицу с добавленным товаром");

        while(resSet.next()){
            int food_id = resSet.getInt("FOOD_ID");;
            String food_name = resSet.getString("FOOD_NAME"); ;
            String food_type = resSet.getString("FOOD_TYPE"); ;
            int food_exotic = resSet.getInt("FOOD_EXOTIC");;
            System.out.printf("%d, %s, %s, %d\n", food_id, food_name, food_type, food_exotic);
        }

        System.out.println("Удаляем товар дуриан...");
        PreparedStatement statement1 = connection.prepareStatement("DELETE FROM FOOD p WHERE p.FOOD_NAME=?");
        statement1.setString(1, "Дуриан");
        statement1.executeUpdate();
        PreparedStatement prepare3 = connection.prepareStatement("select * from FOOD");
        ResultSet rs = prepare3.executeQuery();
        System.out.println("Выведем таблицу с удаленным товаром");
        while(rs.next()){
            int food_id = rs.getInt("FOOD_ID");;
            String food_name = rs.getString("FOOD_NAME"); ;
            String food_type = rs.getString("FOOD_TYPE"); ;
            int food_exotic = rs.getInt("FOOD_EXOTIC");;
            System.out.printf("%d, %s, %s, %d\n", food_id, food_name, food_type, food_exotic);
        }

        connection.close();









    }
}
