import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/opt/WebDriver/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        WebElement radioButton3 = driver.findElement(By.cssSelector("input[value='option3']"));

        radioButton1.click();
        radioButton2.click();
        radioButton3.click();

        driver.quit();
    }
}
