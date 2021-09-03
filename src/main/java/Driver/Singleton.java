package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Singleton {
    private static Singleton instance = null;
    private WebDriver driver;

    private Singleton() {
        System.setProperty("webdriver.chrome.driver", "/Users/anduser/projects/automation-java-course/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(capabilities);
    }

    public static Singleton setDriver() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void closeBrowser() {
        driver.quit();
    }
}
