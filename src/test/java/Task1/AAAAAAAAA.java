package Task1;

import io.cucumber.java.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AAAAAAAAA {
    WebDriver webDriver;

    @BeforeEach
    public void openDriver() throws Exception {
        DesiredCapabilities settings = new DesiredCapabilities();
        settings.setCapability("browserName", "chrome");
        settings.setCapability("browserVersion", "108.0");
        settings.setCapability("enableVNC", true);
        settings.setCapability("enableVideo", false);


        try {
            webDriver = new RemoteWebDriver( new URI("http://149.154.71.152:4444/wd/hub").toURL(), settings);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void s3(){
        webDriver.get("http://149.154.71.152:8080/food");

    }

}
