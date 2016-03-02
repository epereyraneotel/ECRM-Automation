package repoObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.thoughtworks.selenium.webdriven.commands.WaitForCondition;

public class HomePage {

	WebDriver wd; 
	
	@FindBy (how = How.ID, using = "txtUsuario" )
	public static WebElement User;
	
	@FindBy (how = How.ID, using = "txtClave" )
	public static WebElement Password;
	
	@FindBy (how = How.ID, using = "NeoIngresarButton1" )
	public static WebElement ButtonLogin;
	
	@FindBy (how = How.ID, using = "cmdChat" )
	public static WebElement BtnChat;
	
	@FindBy (how = How.ID, using = "cmdTelFuntions" )
	public static WebElement BtnTelFuntions;
	
	@FindBy (how = How.ID, using = "cmdHelp" )
	public static WebElement BtnHelp;
	
	@FindBy (how = How.ID, using = "cmdSalir" )
	public static WebElement BtnLogOut;
	
	@FindBy (how = How.XPATH, using = "//form/table/tbody/tr/td[3]/select//option[2]")
	public static WebElement LangSpa;
	
	@FindBy (how = How.XPATH, using = "//form/table/tbody/tr/td[3]/select//option[3]")
	public static WebElement LangEng;
	
	@FindBy (how = How.XPATH, using = "//form/table/tbody/tr/td[3]/select//option[4]")
	public static WebElement LangPor;
	
	public void ConstructorLogin(WebDriver driver){ 

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
    	wd.switchTo().frame("main");
		
	}
	
	public void SwitchLanguage(){
		
		LangEng.click();
		LangSpa.click();
		LangPor.click();
		
	}
	
	public void ButtonChat(){
		
		BtnChat.click();
		
	}
	
	public void ButtonTelFuntions(){
		
		BtnTelFuntions.click();
		
	}
	
	public void ButtonHelp(){
		
		BtnHelp.click();
		
	}
	
	

}
