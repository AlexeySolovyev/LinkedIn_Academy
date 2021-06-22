import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/opt/WebDriver/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();
        WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
        autocompleteItem.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
