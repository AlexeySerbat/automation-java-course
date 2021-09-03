package PageObject;

import Driver.DriverSettings;
import org.junit.Assert;
import org.openqa.selenium.*;

public class ContactsPage extends DriverSettings {
    public static class Elements {
        static WebElement element;

        public static WebElement createContactBtn(WebDriver driver) {
            element = driver.findElement(By.linkText("Создать контактное лицо"));
            return element;
        }

        public static WebElement lastName(WebDriver driver) {
            element = driver.findElement(By.name("crm_contact[lastName]"));
            return element;
        }

        public static WebElement firstName(WebDriver driver) {
            element = driver.findElement(By.name("crm_contact[firstName]"));
            return element;
        }

        public static WebElement middleName(WebDriver driver) {
            element = driver.findElement(By.name("crm_contact[middleName]"));
            return element;
        }

        public static WebElement orgDropdown(WebDriver driver) {
            element = driver.findElement(By.cssSelector(".select2-chosen"));
            return element;
        }

        public static WebElement firstOrgValue(WebDriver driver) {
            element = driver.findElement(By.cssSelector("ul.select2-results > li:nth-child(2)"));
            return element;
        }

        public static WebElement jobTitle(WebDriver driver) {
            element = driver.findElement(By.name("crm_contact[jobTitle]"));
            return element;
        }

        public static WebElement saveAndCloseBtn(WebDriver driver) {
            element = driver.findElement(By.cssSelector("div:nth-child(4) > button"));
            return element;
        }

        public static WebElement successCreatedContactMsg(WebDriver driver) {
            element = driver.findElement(By.cssSelector("flash-messages-holder"));
            return element;
        }
    }

    public static class Methods {
        public static void createContact(String firstName,
                                         String lastName,
                                         String middleName,
                                         String jobTitle) {
            GeneralMethods.waitForElement(Elements.lastName(driver));
            Elements.lastName(driver).sendKeys(lastName);
            Elements.firstName(driver).sendKeys(firstName);
            Elements.middleName(driver).sendKeys(middleName);
            Elements.jobTitle(driver).sendKeys(jobTitle);
            Elements.orgDropdown(driver).click();
            GeneralMethods.waitForElement(Elements.firstOrgValue(driver));
            Elements.firstOrgValue(driver).click();
        }

        public static void clickSaveAndClose() {
            Elements.saveAndCloseBtn(driver).click();
        }

        public static void verifyContactCreated() {
            GeneralMethods.waitForElement(Elements.successCreatedContactMsg(driver));
            Assert.assertEquals(Elements.successCreatedContactMsg(driver).getText(), "Контактное лицо сохранено");
        }
    }
}
