import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/opt/WebDriver/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");
        // WebElement chooseButton = driver.findElement(By.cssSelector(".btn.btn-secondary.btn-choose"));
        // WebElement resetButton = driver.findElement(By.cssSelector(".btn.btn-warning.btn-reset"));
        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
        fileUploadField.sendKeys("src/test/files/Contracts.png");

        driver.quit();
    }
}
