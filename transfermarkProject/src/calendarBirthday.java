import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class calendarBirthday {

    @Test
    public void calendarBirthday() throws InterruptedException{
// Add the path
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

        // Click .news button
        WebElement newsButton = driver.findElement(By.xpath("//*[@id=\"main\"]/header/nav/ul/li[1]/span"));
        newsButton.click();

        // Wait
        Thread.sleep(2000);



        // Click world
        WebElement todaysBrth = driver.findElement(By.xpath("//*[@id=\"main\"]/header/nav/ul/li[1]/div/div[1]/ul/li[4]/a"));
        todaysBrth.click();

        // Wait
        Thread.sleep(2000);


        JavascriptExecutor js = (JavascriptExecutor) driver;
        long scrollAmount = 200; // Adjust this value to change the scroll amount
        js.executeScript("window.scrollBy(0, " + scrollAmount + ")");


        // Click russian bar
        WebElement calArrow = driver.findElement(By.xpath("//*[@id=\"main\"]/main/div[1]/div[2]/div[2]/tm-datepicker/div/div/div/div[1]/div[1]"));
        calArrow.click();

        // Wait
        Thread.sleep(2000);

        // Click russian message bar and type Russia!
        WebElement day = driver.findElement(By.xpath("//*[@id=\"main\"]/main/div[1]/div[2]/div[2]/tm-datepicker/div/div/div/div[2]/div[20]"));

        ///here
        day.click();

        Thread.sleep(3000);

        driver.close();
    }
}
