/* Crate by: Emanuel Pereyra
 * Date: 02-11-2016
 * Update by: -
 * Date: -
 * Summary: Crate a new telemarketer on Call Center
 */
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
import repoObjects.MenuPage;
import repoObjects.TelemarketersTabPage;


public class AddNewTelemarketer {
    FirefoxDriver wd;
    HomePage repoObjectsHome;
    MenuPage repoObjectsMenu;
    TelemarketersTabPage repoObjectsTelemarketer;
    
    
    @BeforeMethod
    public void setUp() throws Exception {
    	
    	//Set new Firefox windows
        wd = new FirefoxDriver();
        
        //Configuracion de tiempos implicitos y no de espera
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        
        //Ventana de Firefox Maximizar
        wd.manage().window().maximize();
        
        //Creo la variable repoObjects instanciando la claseHomepage
        repoObjectsHome = PageFactory.initElements(wd, HomePage.class);
        
        //Url
        wd.get("http://192.168.5.4/callcenter/");
    }
       
    @Test(priority=1)
    public void NewTelemarketer() throws InterruptedException{
    	
    	//Seleccion de frame principal
    	wd.switchTo().frame("main");
    	
    	//Metodo para el login 
    	repoObjectsHome.LogInCRM("1000", "1122");
    	
    	//Tiempo muerto de espera para carga
    	Thread.sleep(3000);
    	
    	//Cambio de Frame
    	wd.switchTo().defaultContent();
    	wd.switchTo().frame("main");
    	
    	wd.findElement(By.xpath("//form/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/p/table/tbody/tr[6]/td/div")).click();
    	wd.findElement(By.xpath("//form/div[9]/span/table/tbody/tr[1]/td/div")).click();
    	wd.findElement(By.xpath("//form/div[10]/span/table/tbody/tr[2]/td/div")).click();
    	
    	Thread.sleep(3000);
    	
    	wd.switchTo().defaultContent();
    	wd.switchTo().frame("main");
    	wd.switchTo().frame("iframe_tabs-1");
    	
    	wd.findElement(By.id("NeoAgregarButton1")).click();
    	
    	wd.switchTo().defaultContent();
    	wd.switchTo().frame("main");
    	wd.switchTo().frame("iframe_tabs-1");
    	
    	wd.findElement(By.id("txtNombre")).sendKeys("MR");
    	wd.findElement(By.id("txtApellido")).sendKeys("Roboto");
    	wd.findElement(By.id("txtDomicilio")).sendKeys("Santa Fe 5278");
    	wd.findElement(By.id("txtLocalidad")).sendKeys("Capital Federal");
    	wd.findElement(By.id("txtDNI")).sendKeys("12345678");
    	wd.findElement(By.id("txtTelefono")).sendKeys("42225555");
    	wd.findElement(By.id("txtClave")).sendKeys("9891");
    	wd.findElement(By.id("chkGrabaConversacion")).click();
    	wd.findElement(By.xpath("//form/table/tbody/tr/td/table/tbody/tr/td/div/div[3]/select//option[1]")).click();
    	wd.findElement(By.id("btnAceptar")).click();
    	
    	
    	wd.findElement(By.id("NeoSalirButton1")).click();

    	wd.switchTo().defaultContent();
    	wd.switchTo().frame("main");
    	
    	
    	wd.findElement(By.xpath("//form/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/p/table/tbody/tr[16]/td/div")).click();

    	//Tiempo muerto de espera para carga
        Thread.sleep(13000);
    	
    	
    	
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
           
    
    
} 
