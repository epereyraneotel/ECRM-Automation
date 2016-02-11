/* Crate by: Emanuel Pereyra
 * Date: 02-11-2016
 * Update by: -
 * Date: -
 * Summary: Repository of Objects with methods
 */
package repoObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TopFramePage {

	WebDriver wd;
	
	@FindBy (how = How.ID, using= "cmdChat" )
	public static WebElement Chat;
	
	@FindBy (how = How.ID, using= "cmdTelFunctions" )
	public static WebElement FuncionesTel;
	
	@FindBy (how = How.ID, using= "cmdHelp" )
	public static WebElement Help;
	
	@FindBy (how = How.ID, using= "cmdSalir" )
	public static WebElement LogOut;
	
	@FindBy (how = How.ID, using= "cmoCRM" )
	public static WebElement SelectCRM;
	
	@FindBy (how = How.ID, using= "cmoCampaña" )
	public static WebElement SelectCampaña;
	
	@FindBy (how = How.ID, using= "cmoEstado" )
	public static WebElement SelectEstado;
	
	@FindBy (how = How.ID, using= "cmoIdioma" )
	public static WebElement SelectIdioma;
	
	
	public void Constructor(WebDriver driver){ 

	    this.wd = driver; 

	    } 
	
	
	
	
}
