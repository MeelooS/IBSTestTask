package org.example;

import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;

public class Rest1Test {


    @Test
    void test2() {
        System.out.println("Выведем содержимое таблицы без добавленного товара");
        given().cookie("JSESSIONID","1F238E326C7351440284D504C79B0F17")
                .baseUri("http://localhost:8080/")
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .when()
                .get("api/food")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200);
        System.out.println("Добавляем наши товары ...");
        given().cookie("JSESSIONID","1F238E326C7351440284D504C79B0F17")
                .baseUri("http://localhost:8080/")
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .when()
                .body("{\"name\":\"Вячеслав\"," +
                        "\"type\":\"VEGETABLE\"," +
                        "\"exotic\":true}")
                .post("api/food")
                .then()
                .assertThat()
                .statusCode(200);
        given().cookie("JSESSIONID","1F238E326C7351440284D504C79B0F17")
                .baseUri("http://localhost:8080/")
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .when()
                .body("{\"name\":\"роффшkjhjksojhiHDhuhUHГРГРои\"," +
                        "\"type\":\"FRUIT\"," +
                        "\"exotic\":false}")
                .post("api/food")
                .then()
                .assertThat()
                .statusCode(200);
        System.out.println("Выведем содержимое таблицы с добавленными товарами");
        given().cookie("JSESSIONID","1F238E326C7351440284D504C79B0F17")
                .baseUri("http://localhost:8080/")
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .when()
                .get("api/food")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200);



    }
}
