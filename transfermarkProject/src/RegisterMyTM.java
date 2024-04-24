import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RegisterMyTM {
    @Test
    public void RegisterMyTM() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ph-mo\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Transfermarkt website
        driver.get("https://www.transfermarkt.com/");

        try {
            Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.cssSelector("#sp_message_iframe_953358")));

        // Find the accept button within the iframe and click it
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"notice\"]/div[3]/div[1]/div/button"));
        acceptButton.click();

        driver.switchTo().defaultContent();


        try {
            Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Hover over element with XPath /html/body/div[1]/header/nav/ul/li[7]/a
        WebElement element1 = driver.findElement(By.xpath("/html/body/div[1]/header/nav/ul/li[6]/span"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element1).perform();


        try {
            Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click on element with XPath /html/body/div[1]/header/nav/ul/li[6]/div/div[1]/ul/li[1]/a
        WebElement element2 = driver.findElement(By.xpath("/html/body/div[1]/header/nav/ul/li[6]/div/div[1]/ul/li[1]/a"));
        element2.click();


        try {
            Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement element7 = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div[2]/div/div[1]/div[7]/input"));
        element7.click();

        // Fill all items from /html/body/div[1]/main/div[1]/div[1]/div/form/fieldset/div[2]/div/div/div[1]/input to /html/body/div[1]/main/div[1]/div[1]/div/form/fieldset/div[2]/div/div/div[7]/input
        for (int i = 1; i <= 7; i++) {
            String xpath = "/html/body/div[1]/main/div[1]/div[1]/div/form/fieldset/div[2]/div/div/div[" + i + "]/input";
            WebElement element = driver.findElement(By.xpath(xpath));
            element.sendKeys("Item " + i);

            Thread.sleep(500); // Wait for 2 seconds (you might need to adjust this)

        }

        // Check the box with XPath /html/body/div[1]/main/div[1]/div[1]/div/form/fieldset/div[2]/div/div/label[1]/input[2]
        WebElement checkbox1 = driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div[1]/div/form/fieldset/div[2]/div/div/label[1]/input[2]"));
        checkbox1.click();

        try {
            Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check the box with XPath /html/body/div[1]/main/div[1]/div[1]/div/form/fieldset/div[2]/div/div/label[2]/input[2]
        WebElement checkbox2 = driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div[1]/div/form/fieldset/div[2]/div/div/label[2]/input[2]"));
        checkbox2.click();

        try {
            Thread.sleep(4000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        checkbox2.sendKeys(Keys.TAB);
        WebElement elementAfterTabs1 = driver.switchTo().activeElement();
        elementAfterTabs1.sendKeys(Keys.TAB);

        WebElement elementAfterTabs = driver.switchTo().activeElement();
        elementAfterTabs.sendKeys(Keys.ENTER);

        try {
            Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Put an alert
        js.executeScript("alert('Invalid Registration Recieved');");

        try {
            Thread.sleep(2000); // Wait for 2 seconds (you might need to adjust this)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Handle the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.close();

    }
}
