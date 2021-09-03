package PageObject;

import Driver.DriverSettings;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MyProjectsPage extends DriverSettings {
    static WebElement element;

    public static class Elements {
        public static WebElement createProjectBtn (WebDriver driver) {
            element = driver.findElement(By.linkText("Создать проект"));
            return element;
        }

        public static WebElement projectNameField(WebDriver driver) {
            element = driver.findElement(By.name("crm_project[name]"));
            return element;
        }

        public static WebElement organisationDropdown(WebDriver driver) {
            element = driver.findElement(By.xpath("//span[contains(text(),'Укажите организацию')]"));
            return element;
        }

        public static WebElement firstOrgValue(WebDriver driver) {
            element = driver.findElement(By.xpath("//body/div[@id='select2-drop']/ul[2]/li[2]"));
            return element;
        }

        public static WebElement contactDropdown(WebDriver driver) {
            element = driver.findElement(By.xpath("//div[2]/fieldset[1]/div[4]/div[1]/div[2]/div[1]q"));
            return element;
        }

        public static WebElement firstContactValue(WebDriver driver) {
            element = driver.findElement(By.xpath("//div[8]/ul[2]/li[1]"));
            return element;
        }

        public static WebElement departmentDropdown(WebDriver driver) {
            element = driver.findElement(By.xpath("//div[1]/div[2]/fieldset[1]/div[2]/div[5]/div[2]/div[1]/select[1]"));
            return element;
        }

        public static WebElement projectCoordinatorDropdown(WebDriver driver) {
            element = driver.findElement(By.xpath("//div[1]/div[2]/fieldset[1]/div[2]/div[6]/div[2]/div[1]/select[1]"));
            return element;
        }

        public static  WebElement projectManagerDropdown(WebDriver driver) {
            element = driver.findElement(By.xpath("//div[1]/div[2]/fieldset[1]/div[2]/div[7]/div[2]/div[1]/select[1]"));
            return element;
        }

        public static WebElement projectAdministratorDropdown(WebDriver driver) {
            element = driver.findElement(By.xpath("//div[1]/div[2]/fieldset[1]/div[2]/div[8]/div[2]/div[1]/select[1]"));
            return element;
        }

        public static WebElement managerDropdown(WebDriver driver) {
            element = driver.findElement(By.xpath("//div[1]/div[2]/fieldset[1]/div[2]/div[9]/div[2]/div[1]/select[1]"));
            return element;
        }

        public static WebElement saveAndCloseBtn(WebDriver driver) {
            element = driver.findElement(By.cssSelector(".btn-group:nth-child(4) > .btn"));
            return element;
        }

        public static WebElement successMsg(WebDriver driver) {
            element = driver.findElement(By.xpath("//div[contains(text(),'Проект сохранен')]"));
            return element;
        }
    }

    public static class Methods {
        public static void createProject(String name) {
            Elements.createProjectBtn(driver).click();
            GeneralMethods.waitForElement(Elements.projectNameField(driver));
            Elements.projectNameField(driver).sendKeys(name);
            Elements.organisationDropdown(driver).click();
            GeneralMethods.waitForElement(Elements.firstOrgValue(driver));
            Elements.firstOrgValue(driver).click();
            GeneralMethods.chooseFromSelectDropdown(Elements.departmentDropdown(driver));
            GeneralMethods.chooseFromSelectDropdown(Elements.projectCoordinatorDropdown(driver));
            GeneralMethods.chooseFromSelectDropdown(Elements.projectManagerDropdown(driver));
            GeneralMethods.chooseFromSelectDropdown(Elements.projectAdministratorDropdown(driver));
            GeneralMethods.chooseFromSelectDropdown(Elements.managerDropdown(driver));
        }

        public static void verifyProjectCreated() {
            GeneralMethods.waitForElement(Elements.successMsg(driver));
            Assert.assertEquals("Проект сохранен", Elements.successMsg(driver).getText());
        }

        public static void saveAndCloseProject() {
            Elements.saveAndCloseBtn(driver).click();
        }
    }
}
