import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/opt/WebDriver/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        submitForm(driver);
        waitForAlertBanner(driver);
        Assert.assertEquals(getAlertBannerText(driver), "The form was successfully submitted!");
        driver.quit();
    }

    public static void submitForm(WebDriver driver) {
        WebElement firstNameField = driver.findElement(By.id("first-name"));
        WebElement lasNameField = driver.findElement(By.id("last-name"));
        WebElement jobTitleField = driver.findElement(By.id("job-title"));
        WebElement highSchoolRadioButton = driver.findElement(By.id("radio-button-1"));
        WebElement collegeRadioButton = driver.findElement(By.id("radio-button-2"));
        WebElement gradSchoolRadioButton = driver.findElement(By.id("radio-button-3"));
        WebElement sexMaleCheckBox = driver.findElement(By.id("checkbox-1"));
        WebElement sexFemaleCheckBox = driver.findElement(By.id("checkbox-2"));
        WebElement sexPreferNotToSayCheckBox = driver.findElement(By.id("checkbox-3"));
        WebElement experienceDropDownResult = driver.findElement(By.cssSelector("option[value='4']"));
        WebElement datePicker = driver.findElement(By.id("select-menu"));
        WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));

        firstNameField.sendKeys("FirstName");
        lasNameField.sendKeys("LastName");
        jobTitleField.sendKeys("Engineer");
        collegeRadioButton.click();
        sexMaleCheckBox.click();
        experienceDropDownResult.click();
        datePicker.sendKeys("12/12/2015");
        datePicker.sendKeys(Keys.ENTER);
        submitButton.click();
    }

    public static void waitForAlertBanner(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
    }

    public static String getAlertBannerText(WebDriver driver) {
        return driver.findElement(By.className("alert")).getText();
    }
}
