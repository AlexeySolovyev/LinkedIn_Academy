import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAndMouseInput {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/opt/WebDriver/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/keypress");
        WebElement field = driver.findElement(By.id("name"));
        WebElement button = driver.findElement(By.id("button"));
        field.click();
        field.clear();
        field.sendKeys("TestName");
        button.click();
        driver.quit();
    }
}
