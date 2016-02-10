package testRunner;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginTrueSeleniumIDE {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://192.168.4.121/ecrm/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testLoginTrue() throws Exception {
    driver.get(baseUrl);
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | main | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=main | ]]
    driver.findElement(By.id("txtUsuario")).clear();
    driver.findElement(By.id("txtUsuario")).sendKeys("1018");
    driver.findElement(By.id("txtClave")).clear();
    driver.findElement(By.id("txtClave")).sendKeys("7375");
    driver.findElement(By.id("NeoIngresarButton1")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=header | ]]
    driver.findElement(By.id("lblCRM")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=Seleccion | ]]
    new Select(driver.findElement(By.id("cboCRM"))).selectByVisibleText("5 - CRM-LM");
    driver.findElement(By.cssSelector("option[value=\"5\"]")).click();
    driver.findElement(By.id("btnAceptar")).click();
    assertEquals(closeAlertAndGetItsText(), "El CRM seleccionado está en modo 'Test', recuerde pasarlo a modo 'Production' cuando finalice la configuración.");
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
