package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverWeb {
    public static WebDriver driver;

    public static void setUpAll() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @AfterEach
    void closeDrivers() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void openURL() {
        driver.manage().window().maximize();
//        driver.get(Property.get("browser.url_1"));
        driver.get("https://taip.su/");
    }
}
