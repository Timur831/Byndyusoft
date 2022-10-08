package test.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseSelenideTest {

    @BeforeAll
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless =false;
        Configuration.holdBrowserOpen = false;
        Configuration.timeout = 7000;
        Configuration.clickViaJs = true;
    }

    @AfterAll
    public static void tearDown(){
        Selenide.closeWebDriver();
    }
}
