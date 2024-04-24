import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class lastArticleBubble {
    @Test
    public void lastArticleBubble() throws InterruptedException  {
            // change path to chrome driver !!!
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ph-mo\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            // Go to Transfermarkt website
            driver.get("https://www.transfermarkt.com/");
            driver.manage().window().maximize();
            // Wait
            try {
                Thread.sleep(2000); // Wait for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            driver.switchTo().frame(driver.findElement(By.cssSelector("#sp_message_iframe_953358")));

            // Find the accept button within the iframe and click it
            WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"notice\"]/div[3]/div[1]/div/button"));
            acceptButton.click();

            driver.switchTo().defaultContent();

            // Click the final spotlight bubble
            WebElement element1 = driver.findElement(By.xpath("//*[@id=\"swiper-newsRotation\"]/div[2]/span[8]"));
            element1.click();

            // Wait
            try {
                Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Click that article
            WebElement element2 = driver.findElement(By.xpath("//*[@id=\"swiper-newsRotation\"]/div[1]/div[9]/a/div[1]"));
            element2.click();

            try {
                Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");


            WebElement elementToHover = driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div[1]/div[1]/div/div/div[5]/div[6]/a[1]/div"));

            Actions actions = new Actions(driver);
            actions.moveToElement(elementToHover).perform();

            try {
                Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            driver.get("https://www.transfermarkt.com/footballs-oldest-competition-the-teams-with-the-most-fa-cup-titles-in-history/fehlerformular/intern/431992");


            try {
                    Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            WebElement element4 = driver.findElement(By.xpath("//*[@id=\"fehlerformular-form\"]/input[2]"));
            element4.click();
            driver.close();
    }
}
