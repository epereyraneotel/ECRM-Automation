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

public class Red5 {
    FirefoxDriver wd;
    
    @BeforeClass
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void gooogle(){
    	
    	 wd.get("http://192.168.5.4/ecrm/");
         wd = (FirefoxDriver) wd.switchTo().frame("main");
         wd.findElement(By.xpath("//form/table/tbody/tr/td/table/tbody/tr/td/div[2]/div/input[1]")).click();
         wd.findElement(By.xpath("//form/table/tbody/tr/td/table/tbody/tr/td/div[2]/div/input[1]")).sendKeys("\\9");
         wd.findElement(By.xpath("//form/table/tbody/tr/td/table/tbody/tr/td/div[2]/div/input[2]")).click();
         wd.findElement(By.xpath("//form/table/tbody/tr/td/table/tbody/tr/td/div[2]/div/input[2]")).clear();
         wd.findElement(By.xpath("//form/table/tbody/tr/td/table/tbody/tr/td/div[2]/div/input[2]")).sendKeys();
         wd.findElement(By.xpath("//form/table/tbody/tr/td/table/tbody/tr/td/div[2]/div/input[2]")).click();
         wd.findElement(By.xpath("//form/table/tbody/tr/td/table/tbody/tr/td/div[2]/div/input[2]")).clear();
         wd.findElement(By.xpath("//form/table/tbody/tr/td/table/tbody/tr/td/div[2]/div/input[2]")).sendKeys("1000");
         wd.findElement(By.xpath("//form/table/tbody/tr/td/table/tbody/tr/td/div[2]/div/input[1]")).click();
         wd.findElement(By.xpath("//form/table/tbody/tr/td/table/tbody/tr/td/div[2]/div/input[1]")).clear();
         wd.findElement(By.xpath("//form/table/tbody/tr/td/table/tbody/tr/td/div[2]/div/input[1]")).sendKeys("1122");
         wd.findElement(By.xpath("//form/table/tbody/tr/td/table/tbody/tr/td/div[2]/p/input")).click();
    	
    	
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
}}