package HomeWorkApp11;

import Driver.DriverSettings;
import PageObject.ContactsPage;
import PageObject.LoginPage;
import PageObject.MainPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2Test extends DriverSettings {
  private WebDriver driver;

  @BeforeEach
  public void setUpTest() {
    driver = new ChromeDriver();
    DriverSettings.browserSettings();
    driver.get("https://crm.geekbrains.space");
  }

  @AfterEach
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void CreateContact() {
    LoginPage.Methods.loginIntoApp("Applanatest1", "Student2020!");
    MainPage.Methods.openContacts();
    ContactsPage.Elements.createContactBtn(driver).click();
    ContactsPage.Methods.createContact("Валерий", "Жмышенко", "Альбертович", "Черт");
    ContactsPage.Methods.clickSaveAndClose();
    ContactsPage.Methods.verifyContactCreated();
  }
}
