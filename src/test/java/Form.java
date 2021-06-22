import Pages.ConfirmationPage;
import Pages.FormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/opt/WebDriver/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        FormPage.submitForm(driver);
        ConfirmationPage confirmationPage = new ConfirmationPage();
        ConfirmationPage.waitForAlertBanner(driver);
        Assert.assertEquals(ConfirmationPage.getAlertBannerText(driver), "The form was successfully submitted!");
        driver.quit();
    }
}
