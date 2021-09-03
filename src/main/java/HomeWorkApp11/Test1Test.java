package HomeWorkApp11;

import Driver.DriverSettings;
import PageObject.LoginPage;
import PageObject.MainPage;
import PageObject.MyProjectsPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1Test extends DriverSettings{
  //private WebDriver driver;

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
    String departmentValue = "Research & Development";
    String projectCoordinatorValue = "Applanatest Applanatest Applanatest";
    String projectManagerValue = "Applanatest Applanatest Applanatest";
    String projectAdministratorValue = "Applanatest Applanatest Applanatest";
    String managerValue = "Applanatest Applanatest Applanatest";



    LoginPage.Methods.loginIntoApp("Applanatest1", "Student2020!");
    MainPage.Methods.openMyProjects();
    MyProjectsPage.Methods.createProject("Project123",
            departmentValue,
            projectCoordinatorValue,
            projectManagerValue,
            projectAdministratorValue,
            managerValue);
    MyProjectsPage.Methods.saveAndCloseProject();
  }
}
