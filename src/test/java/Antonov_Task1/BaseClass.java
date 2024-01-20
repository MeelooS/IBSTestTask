package Antonov_Task1;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.Before;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class BaseClass {

    public static WebDriver driver = new ChromeDriver() ;

 /*   @BeforeAll
    public static void openDriver()throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("browserVersion", "108.0");
        capabilities.setCapability("selenoid:option", Map.<String, Object> of(
                "enableVNC", true,
                "enableVideo", false));
        try {
            driver = new RemoteWebDriver( new URI("http://149.154.71.152:4444/wd/hub").toURL(), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    } */

}



