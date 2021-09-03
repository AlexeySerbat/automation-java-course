package HomeWorkApp11;

import Driver.DriverSettings;
import PageObject.ContactsPage;
import PageObject.LoginPage;
import PageObject.MainPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test2Test extends DriverSettings {

  @BeforeEach
  public void setUpTest() {
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
