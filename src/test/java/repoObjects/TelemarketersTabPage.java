package repoObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TelemarketersTabPage {

	WebDriver wd; 
	
	@FindBy (how = How.ID, using= "NeoAgregarButton1" )
	public static WebElement AddUser;

	@FindBy (how = How.ID, using= "txtNombre" )
	public static WebElement NameUser;
	
	@FindBy (how = How.ID, using= "txtApellido" )
	public static WebElement LastNameUser;
	
	@FindBy (how = How.ID, using= "txtDomicilio" )
	public static WebElement AddressUser;
	
	@FindBy (how = How.ID, using= "txtLocalidad" )
	public static WebElement LocalityUser;
	
	@FindBy (how = How.ID, using= "txtDNI" )
	public static WebElement DNIUser;
	
	@FindBy (how = How.ID, using= "txtTelefono" )
	public static WebElement PhoneUser;
	
	@FindBy (how = How.ID, using= "txtClave" )
	public static WebElement PassUser;
	
	@FindBy (how = How.ID, using= "chkGrabaConversacion" )
	public static WebElement RecordUser;
	
	@FindBy (how = How.XPATH, using= "//form/table/tbody/tr/td/table/tbody/tr/td/div/div[3]/select//option[1]" )
	public static WebElement TypeProfileUser;
	
	@FindBy (how = How.ID, using= "btnAceptar" )
	public static WebElement AcceptNewUser;
	
	
	
	public void Constructor(WebDriver driver){ 

	    this.wd = driver; 

	    }
	
	public void AgregarTelemarketer(String Nombre,String Apellido, String Domicilio, String Localidad, String DNI, String Telefono, String Password ){
		
		wd.switchTo().defaultContent();
    	wd.switchTo().frame("main");
    	wd.switchTo().frame("iframe_tabs-1");
		
		AddUser.click();
		
		wd.switchTo().defaultContent();
    	wd.switchTo().frame("main");
    	wd.switchTo().frame("iframe_tabs-1");
    	
    	NameUser.click();
    	NameUser.clear();
    	NameUser.sendKeys(Nombre);
    	
    	LastNameUser.click();
    	LastNameUser.clear();
    	LastNameUser.sendKeys(Apellido);
    	
    	AddressUser.click();
    	AddressUser.clear();
    	AddressUser.sendKeys(Domicilio);
    	
    	LocalityUser.click();
    	LocalityUser.clear();
    	LocalityUser.sendKeys(Localidad);
    	
    	DNIUser.click();
    	DNIUser.clear();
    	DNIUser.sendKeys(DNI);
    	
    	PhoneUser.click();
    	PhoneUser.clear();
    	PhoneUser.sendKeys(Telefono);
		
    	PassUser.click();
    	PassUser.clear();
    	PassUser.sendKeys(Password);
    	
    	RecordUser.click();
    	
    	TypeProfileUser.click();
    	
    	AcceptNewUser.click();
    	
	}
	
	
}
