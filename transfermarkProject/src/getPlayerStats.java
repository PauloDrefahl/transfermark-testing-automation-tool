import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.lang.InterruptedException;
import java.time.Duration;

public class getPlayerStats {

    @Test
    public void getPlayerStats() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ph-mo\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Transfermarkt website
        driver.get("https://www.transfermarkt.com/");
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.cssSelector("#sp_message_iframe_953358")));

        // Find the accept button within the iframe and click it
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"notice\"]/div[3]/div[1]/div/button"));
        acceptButton.click();

        driver.switchTo().defaultContent();

        try {
            Thread.sleep(1000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Scroll to the bottom of the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        try {
            Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Click on element with XPath /html/body/div[1]/main/div[1]/div[12]/div[3]/div/a
        WebElement element1 = driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div[12]/div[3]/div/a"));
        element1.click();

        try {
            Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Click on element with XPath /html/body/div/main/div[1]/div[1]/div/div[1]/div/form/div/div/table/tbody/tr[1]/td[2]/div/div
        WebElement element2 = driver.findElement(By.xpath("/html/body/div/main/div[1]/div[1]/div/div[1]/div/form/div/div/table/tbody/tr[1]/td[2]/div/div"));
        element2.click();

        try {
            Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Click on element with XPath /html/body/div/main/div[1]/div[1]/div/div[1]/div/form/div/div/table/tbody/tr[1]/td[2]/div/div/div/ul/li[4]
        WebElement element3 = driver.findElement(By.xpath("/html/body/div/main/div[1]/div[1]/div/div[1]/div/form/div/div/table/tbody/tr[1]/td[2]/div/div/div/ul/li[4]"));
        element3.click();

        try {
            Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Click on element with XPath /html/body/div/main/div[1]/div[1]/div/div[1]/div/form/div/div/table/tbody/tr[7]/td[2]/input
        WebElement element4 = driver.findElement(By.xpath("/html/body/div/main/div[1]/div[1]/div/div[1]/div/form/div/div/table/tbody/tr[7]/td[2]/input"));
        element4.click();

        try {
            Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollTo(0, document.body.scrollHeight/2)");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element10 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/main/div[1]/div[1]/div/div[3]/div/table/tbody/tr[10]/td[2]/table/tbody/tr[1]/td[2]/a")));
        element10.click();

        try {
            Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Get text value from element with XPath //*[@id="svelte-performance-data"]/div/main/div/div[2]/div[2]/ul[1]/li[2]/a
        WebElement element6 = driver.findElement(By.xpath("//*[@id='svelte-performance-data']/div/main/div/div[2]/div[2]/ul[1]/li[2]/a"));
        String textValue = element6.getText();
        System.out.println("Text value: " + textValue);

        try {
            Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Put an alert
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("alert('Goals:" + textValue + "');");

        try {
            Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Handle the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        try {
            Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();

    }
}
