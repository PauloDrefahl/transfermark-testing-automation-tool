import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import java.time.Duration;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ClassTestNG1 {
    static WebDriver driver;

    @Test(priority = 1)
    void test1() throws InterruptedException {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ph-mo\\OneDrive\\Documents\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        driver = new ChromeDriver();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Navigate to the website
        driver.get("https://www.transfermarkt.us/");
    }
}