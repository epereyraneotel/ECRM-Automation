package testRunner;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

import static org.openqa.selenium.OutputType.*;

public class google {
    FirefoxDriver wd;
    
    @BeforeClass
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void gooogle(){
        wd.get("https://www.google.com.ar/?gfe_rd=cr&ei=53KzVq3yKqKB8Qef1Y_YCA&gws_rd=ssl");
        wd.findElement(By.id("lst-ib")).click();
        wd.findElement(By.id("lst-ib")).clear();
        wd.findElement(By.id("lst-ib")).sendKeys("gg");
        wd.findElement(By.id("lst-ib")).click();
        wd.findElement(By.id("lst-ib")).sendKeys("\n");
        wd.findElement(By.linkText("Editorial Gustavo Gili: Libros de arquitectura, diseño, moda ...")).click();
        wd.navigate().back();
        wd.findElement(By.xpath("//a[@id='logo']/img")).click();
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
