import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/opt/WebDriver/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        String originalHandle = driver.getWindowHandle(); // even the new tab in browser has been opened, the focus will still leave on the first page
        for (String handle1: driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }

        driver.switchTo().window(originalHandle);
        Thread.sleep(3000);
        driver.quit();
    }
}
