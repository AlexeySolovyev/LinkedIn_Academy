import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/opt/WebDriver/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement fullName = driver.findElement(By.id("name"));
        WebElement date = driver.findElement(By.id("date"));

        // Create new object actions and move (in ths case scroll down) to the web element
        Actions actions = new Actions(driver);
        actions.moveToElement(fullName);

        fullName.sendKeys("TestUser");
        date.sendKeys("01/01/2021");
        Thread.sleep(3000);

        driver.quit();
    }
}
