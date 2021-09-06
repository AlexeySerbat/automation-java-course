package Driver;

import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;


public class DriverSettings {
    public static Singleton browser = Singleton.setDriver();
    public static WebDriver driver = browser.getDriver();

    public static void browserSettings() {
        driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
