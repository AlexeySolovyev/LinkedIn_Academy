import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/opt/WebDriver/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement mainAddress = driver.findElement(By.id("autocomplete"));
        WebElement streetAddress = driver.findElement(By.id("street_number"));
        WebElement streetAddress2 = driver.findElement(By.id("route"));
        WebElement city = driver.findElement(By.id("locality"));
        WebElement state = driver.findElement(By.id("administrative_area_level_1"));
        WebElement zip = driver.findElement(By.id("postal_code"));
        WebElement country = driver.findElement(By.id("country"));

        mainAddress.click();
        mainAddress.clear();
        mainAddress.sendKeys("24 - 1");
        streetAddress.click();
        streetAddress.clear();
        streetAddress.sendKeys("Third Avenue");
        streetAddress2.click();
        streetAddress2.clear();
        streetAddress2.sendKeys("private front house");
        city.click();
        city.clear();
        city.sendKeys("New York");
        state.click();
        state.clear();
        state.sendKeys("New York");
        zip.click();
        zip.clear();
        zip.sendKeys("11021");
        country.click();
        country.clear();
        country.sendKeys("USA");
        Thread.sleep(3000);
        driver.quit();
    }
}
