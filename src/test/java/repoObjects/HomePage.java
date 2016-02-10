package repoObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	WebDriver wd; 
	
	@FindBy (how = How.ID_OR_NAME, using= "rfvUsuario" )
	public static WebElement User;
	
	@FindBy (how = How.ID, using= "txtClave" )
	public static WebElement Pass;
	
	@FindBy (how = How.ID, using= "NeoIngresarButton1" )
	public static WebElement ButtonLogin;
	
	
	
	public void Login(WebDriver driver){ 

	    this.wd = driver; 

	    } 
	
	public void LogInCRM(String Users,String password ) {
	    User.clear();
	    User.sendKeys(Users);
	    Pass.clear();
	    Pass.sendKeys(password);
	    ButtonLogin.click();
	}
	

}
