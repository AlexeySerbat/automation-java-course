package PageObject;

import Driver.DriverSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends DriverSettings {
    public static class Elements {
        static WebElement element;
        public static WebElement projectsBtn(WebDriver driver) {
            element = driver.findElement(By.cssSelector("#main-menu > ul > li:nth-child(3)"));
            return element;
        }

        public static WebElement myProjectsBtn(WebDriver driver) {
            element = driver.findElement(By.cssSelector(".dropdown:nth-child(3) .single:nth-child(4) .title"));
            return element;
        }

        public static WebElement contractorBtn(WebDriver driver) {
            element = driver.findElement(By.cssSelector("li[class=\"dropdown first\"]"));
            return element;
        }

        public static WebElement contactsBtn(WebDriver driver) {
            element = driver.findElement(By.xpath("//span[contains(text(),'Контактные лица')]"));
            return element;
        }
    }

    public static class Methods {
        public static void openMyProjects() {
            GeneralMethods.waitForElement(Elements.projectsBtn(driver));
            GeneralMethods.mouseOverOnElement(Elements.projectsBtn(driver));
            GeneralMethods.waitForElement(Elements.myProjectsBtn(driver));
            Elements.myProjectsBtn(driver).click();
        }

        public static void openContacts() {
            GeneralMethods.waitForElement(Elements.contractorBtn(driver));
            GeneralMethods.mouseOverOnElement(Elements.contractorBtn(driver));
            GeneralMethods.waitForElement(Elements.contactsBtn(driver));
            Elements.contactsBtn(driver).click();
        }
    }
}
