package PageObject;

import Driver.DriverSettings;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.UUID;

public class GeneralMethods extends DriverSettings {
    static WebDriverWait wait = new WebDriverWait(driver, 50);

    public static WebDriverWait waitForElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return wait;
    }

    public static void mouseOverOnElement (WebElement element) {
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
    }

    public static void chooseFromSelectDropdown(WebElement element) {
        Select select = new Select(element);
        element.click();
        select.selectByIndex(1);
    }

    public static String generateString() {
        return UUID.randomUUID().toString();
    }
}
