package repoObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	WebDriver wd; 
	
	@FindBy (how = How.XPATH, using= "//form/table/tbody/tr/td/table/tbody/tr/td/div[2]/div/input[2]" )
	public static WebElement User;
	
	@FindBy (how = How.ID, using= "txtClave" )
	public static WebElement Password;
	
	@FindBy (how = How.ID, using= "NeoIngresarButton1" )
	public static WebElement ButtonLogin;
	
	@FindBy (how = How.ID, using= "cmdSalir" )
	public static WebElement BtnLogOut;
	
	
	public void Login(WebDriver driver){ 

	    this.wd = driver; 

	    } 
	
	public void LogInCRM(String Users,String password ) {
	    
		User.clear();
		User.clear();
	    User.sendKeys(Users);
	    
	    Password.click();
	    Password.clear();
	    Password.sendKeys(password);
	    
	    ButtonLogin.click();
	    
	}
	
	public void LogOutCRM (){
		
		BtnLogOut.click();
		
	}
	
	public void SwitchFrameTop(){
		
		wd.switchTo().defaultContent();
    	wd.switchTo().frame("header");
		
	}
	
	public void SwitchFrameMain(){
		
		wd.switchTo().defaultContent();
    	wd.switchTo().frame("header");
		
	}

}
