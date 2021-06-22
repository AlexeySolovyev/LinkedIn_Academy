import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/opt/WebDriver/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");
        WebElement checkBox1 = driver.findElement(By.id("checkbox-1"));
        WebElement checkBox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        WebElement checkBox3 = driver.findElement(By.xpath("//input[@id='checkbox-3']"));

        checkBox1.click();
        Thread.sleep(500);
        checkBox2.click();
        Thread.sleep(500);
        checkBox3.click();
        Thread.sleep(500);
        checkBox1.click();
        Thread.sleep(500);
        checkBox2.click();
        Thread.sleep(500);
        checkBox3.click();
        Thread.sleep(500);

        driver.quit();
    }
}
