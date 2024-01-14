package data.Base;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.util.Properties;

import java.sql.*;

//Переносим атрибуты из таблицы в программу
public class BaseData {
    private int food_id ;
    private String food_name ;
    private String food_type ;
    private int food_exotic ;

    public BaseData(){};
    public BaseData(int food_id, String food_name, String food_type, int food_exotic){
        this.food_id = food_id;
        this.food_name = food_name;
        this.food_type = food_type;
        this.food_exotic = food_exotic;
    }

    public Integer getFood_id(){
        return food_id;
    }

    public void setFood_id(int Food_id){
        food_id = Food_id;
    }

    public String getFood_name(){
        return food_name;
    }

    public void setFood_name(String Food_name){
        food_name = Food_name;
    }

    public String getFood_type(){
        return food_type;
    }

    public void setFood_type(String Food_type) {
        food_type = Food_type;
    }

    public Integer getFood_exotic(){
        return food_exotic;
    }

    public void setFood_exotic(int Food_exotic) {
        food_exotic = Food_exotic;
    }
}
