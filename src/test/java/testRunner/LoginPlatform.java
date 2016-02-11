package testRunner;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.apache.bcel.verifier.Verifier;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import repoObjects.HomePage;


public class LoginPlatform {
    FirefoxDriver wd;
    HomePage repoObjects;
    
    @BeforeMethod
    public void setUp() throws Exception {
    	
    	//Set new Firefox windows
        wd = new FirefoxDriver();
        
        //Configuracion de tiempos implicitos y no de espera
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        
        //Ventana de Firefox Maximizar
        wd.manage().window().maximize();
        
        //Creo la variable repoObjects instanciando la claseHomepage
        repoObjects = PageFactory.initElements(wd, HomePage.class);
        
        //Url
        wd.get("http://192.168.5.4/ecrm/");
    }
       
    @Test(priority=1)
    public void LoginTrue() throws InterruptedException{
    	
    	//Seleccion de frame principal
    	wd.switchTo().frame("main");
    	
    	//Metodo para el login 
    	repoObjects.LogInCRM("1000", "1122");
    	
    	//Tiempo muerto de espera para carga
    	Thread.sleep(3000);
    	
    	//Cambio de Frame
    	repoObjects.SwitchFrameTop();
    	
    	//Metodo para deslogeo
    	repoObjects.LogOutCRM();

    	//Tiempo muerto de espera para carga
        Thread.sleep(13000);
    	
    	
    	
    }
    
    @Test (priority=2)
    public void LoginFalse() throws InterruptedException{
    	
    	wd.switchTo().frame("main");
    	
    	repoObjects.LogInCRM("1013", "7375");
    	
    	Thread.sleep(3000);
    	
    	if (!wd.findElement(By.tagName("html")).getText().contains("Cliente, Usuario o Clave inválidos.")) 
             System.out.println("verifyTextPresent failed");    	
    	
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
           
    
    
} 
