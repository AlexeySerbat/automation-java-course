package PageObject;

import Driver.DriverSettings;
import org.openqa.selenium.*;


public class LoginPage extends DriverSettings {
    public static class Elements {
        static WebElement element;

        public static WebElement loginInputField(WebDriver driver) {
            element = driver.findElement(By.id("prependedInput"));
            return element;
        }

        public static WebElement passwordInputField(WebDriver driver) {
            element = driver.findElement(By.id("prependedInput2"));
            return element;
        }

        public static WebElement loginBtn(WebDriver driver) {
            element = driver.findElement(By.id("_submit"));
            return element;
        }
    }

    public static class Methods {
        public static void loginIntoApp(String login, String password) {
            GeneralMethods.waitForElement(Elements.loginInputField(driver));
            Elements.loginInputField(driver).sendKeys(login);
            Elements.passwordInputField(driver).sendKeys(password);
            Elements.loginBtn(driver).click();
        }
    }
}
