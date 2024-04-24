import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class popUpRemoval {
    @Test
    public void popUpRemoval() throws InterruptedException  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ph-mo\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.transfermarkt.com/");
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.cssSelector("#sp_message_iframe_953358")));

        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"notice\"]/div[3]/div[1]/div/button"));
        acceptButton.click();

        driver.switchTo().defaultContent();

        driver.close();
    }
}
