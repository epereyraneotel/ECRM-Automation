package testRunner;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import repoObjects.HomePage;


public class LoginTrue {
    FirefoxDriver wd;
    HomePage repoObjects;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        repoObjects = PageFactory.initElements(wd, HomePage.class);
        wd.get("http://192.168.4.121/ecrm/");
    }
       
    @Test
    public void Login() throws InterruptedException{
    	
    	//wd.findElement(By.xpath("//form/table/tbody/tr[1]/td/table/tbody/tr/td/div[2]/div[3]/input[2]")).click();
    	//wd.findElement(By.xpath("//form/table/tbody/tr[1]/td/table/tbody/tr/td/div[2]/div[3]/input[2]")).sendKeys("1018");
    	
    	
    	repoObjects.LogInCRM("1018", "7375");
        //Thread.sleep(3000);
        
    }
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
           
    
    
} 
