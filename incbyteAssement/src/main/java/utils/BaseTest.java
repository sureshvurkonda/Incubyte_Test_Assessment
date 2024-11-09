package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected WebDriver driver;

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
