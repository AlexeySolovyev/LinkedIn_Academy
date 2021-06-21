import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSample {
    public static void main(String[] args) {
        // Set system property for webdriver.chrome.driver to be the location you my local download of chromedriver
        System.setProperty("webdriver.chrome.driver", "/opt/WebDriver/bin/chromedriver");
        // Create the new instance of Chromedriver
        WebDriver driver = new ChromeDriver();
        // Use it foe visit Google web page
        driver.get("https://www.google.com");
        // Enter the text input element
        WebElement element = driver.findElement(By.name("q"));
        // Submit the form
        element.sendKeys("Cheese!");
        // Close the browser
        driver.quit();
    }
}
