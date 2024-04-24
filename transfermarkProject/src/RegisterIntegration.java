import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterIntegration {
    @Test
    public void RegisterIntegration() throws InterruptedException {
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

        WebElement login = driver.findElement(By.id("login"));
        login.click();
        Thread.sleep(2000);

        WebElement register = driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[8]/div/a[3]"));
        register.click();
        Thread.sleep(2000);

        WebElement nickname = driver.findElement(By.id("user_nick"));
        nickname.sendKeys("Messi219742");
        Thread.sleep(2000);

        WebElement firstname = driver.findElement(By.id("vorname"));
        firstname.sendKeys("The");
        Thread.sleep(2000);

        WebElement lastname = driver.findElement(By.id("nachname"));
        lastname.sendKeys("GOAT");
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("argentina2022@gmail.com");
        Thread.sleep(2000);

        WebElement repeatEmail = driver.findElement(By.id("RegisterForm_email2"));
        repeatEmail.sendKeys("argentina2022@gmail.com");
        Thread.sleep(2000);

        WebElement registerpassword = driver.findElement(By.id("passwort1"));
        registerpassword.sendKeys("123456Msi!!");
        Thread.sleep(2000);

        WebElement registerpassword2 = driver.findElement(By.id("passwort2"));
        registerpassword2.sendKeys("123456Msi!!");
        Thread.sleep(2000);

        scrollDown(driver, 500);

        WebElement TOS = driver.findElement(By.xpath("//*[@id=\"RegisterForm_nutzungsbedingungen_flag\"]"));
        TOS.click();
        Thread.sleep(2000);

        WebElement registerBTN = driver.findElement(By.xpath("//*[@id=\"register-form\"]/fieldset/div[2]/div/div/div[9]/input[2]"));
        registerBTN.click();
        Thread.sleep(2000);

        System.out.println("REGISTERED!");


        driver.close();
    }
    public static void scrollDown(WebDriver driver, int pixels) {
        // Create an instance of JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Execute JavaScript code to scroll down the page by specified pixels
        js.executeScript("window.scrollBy(0, " + pixels + ");");
    }
}
