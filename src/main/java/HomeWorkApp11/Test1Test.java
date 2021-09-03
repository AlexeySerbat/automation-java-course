package HomeWorkApp11;

import Driver.DriverSettings;
import PageObject.GeneralMethods;
import PageObject.LoginPage;
import PageObject.MainPage;
import PageObject.MyProjectsPage;
import org.junit.jupiter.api.*;

public class Test1Test extends DriverSettings{

  @BeforeEach
  public void setUpTest() {
    driver.get("https://crm.geekbrains.space");
    browserSettings();
  }

  @AfterEach
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void CreateProject() {
    LoginPage.Methods.loginIntoApp("Applanatest1", "Student2020!");
    MainPage.Methods.openMyProjects();
    MyProjectsPage.Methods.createProject(GeneralMethods.generateString());
    MyProjectsPage.Methods.saveAndCloseProject();
    MyProjectsPage.Methods.verifyProjectCreated();
  }
}
