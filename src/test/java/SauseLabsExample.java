import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class SauseLabsExample {

    public static final String USERNAME = "sauselab_username";
    public static final String ACCESS_KEY = "sauselab_access_key";
    public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.sauselabs.com:80/wd/hub";

    public static void main(String[] args) throws Exception {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("platform", "macOS 10.12");
        capabilities.setCapability("version", "66.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), capabilities);
        driver.get("http://formy-project.herokuapp.com");
    }
}
