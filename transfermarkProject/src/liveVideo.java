import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;


public class liveVideo {
    @Test
    public void liveVideo() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ph-mo\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the main page
        driver.get("https://www.transfermarkt.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        // Switch to the iframe with the specified title
        driver.switchTo().frame(driver.findElement(By.cssSelector("#sp_message_iframe_953358")));
        Thread.sleep(2000);

        // Find the accept button within the iframe and click it
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"notice\"]/div[3]/div[1]/div/button"));
        acceptButton.click();

        // Switch back to the main page
        driver.switchTo().defaultContent();
        Thread.sleep(3000);

        WebElement liveBtn = driver.findElement(By.xpath("//*[@id=\"main\"]/header/nav/ul/li[7]/a"));
        liveBtn.click();
        Thread.sleep(2000);

        scrollDown(driver, 1000);
        Thread.sleep(2000);

        driver.close();
    }

    public static void scrollDown(WebDriver driver, int pixels) {
        // Create an instance of JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Execute JavaScript code to scroll down the page
        js.executeScript("window.scrollBy(0, " + pixels + ");");
    }
}
