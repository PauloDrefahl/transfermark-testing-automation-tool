import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class mapAmericaCompetitions {
    @Test
    public void mapAmericaCompetitions() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ph-mo\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Transfermarkt website
        driver.get("https://www.transfermarkt.com/");
        driver.manage().window().maximize();
        // Wait
        try {
            Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.switchTo().frame(driver.findElement(By.cssSelector("#sp_message_iframe_953358")));

        // Find the accept button within the iframe and click it
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"notice\"]/div[3]/div[1]/div/button"));
        acceptButton.click();

        driver.switchTo().defaultContent();

        // Click Competitions
        WebElement element1 = driver.findElement(By.xpath("/html/body/div[1]/header/nav/ul/li[4]/span"));
        element1.click();

        // Wait
        try {
            Thread.sleep(4000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click America

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/header/nav/ul/li[4]/div/div[3]/ul/li[4]/a")));
        element2.click();

        // Wait
        try {
            Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click the little american flag
        WebElement element3 = driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div[1]/div[1]/div/map/area[5]"));
        element3.click();


        try {
            Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Close the browser

        JavascriptExecutor js = (JavascriptExecutor) driver;
        long windowHeight = (long) js.executeScript("return window.innerHeight");
        long documentHeight = (long) js.executeScript("return document.body.scrollHeight");
        long middle = documentHeight / 2;
        long scrollTo = middle - (windowHeight / 2);
        js.executeScript("window.scrollTo(0, " + scrollTo + ")");

        try {
            Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement element4 = driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/div[1]/div[2]/div/table/tbody/tr[10]/td[1]/table/tbody/tr/td[2]/a"));
        element4.click();

        try {
            Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();
    }
}
