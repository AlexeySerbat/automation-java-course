package PageObject;

import Driver.DriverSettings;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    public static void chooseFromSelectDropdown(WebElement element, String element2) {
        Select select = new Select(element);
        select.selectByValue(element2);
    }
}
