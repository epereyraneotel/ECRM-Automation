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

public class MenuPage {

	WebDriver wd;
	
	@FindBy (how = How.XPATH, using = "//form/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/p/table/tbody/tr[6]/td/div")
	public static WebElement  UsuariosGrupos;
	
	@FindBy (how = How.XPATH, using = "//form/div[9]/span/table/tbody/tr[1]/td/div" )
	public static WebElement UsuariosGruposUsuarios;
	
	@FindBy (how = How.XPATH, using = "//form/div[10]/span/table/tbody/tr[2]/td/div" )
	public static WebElement UsuariosGruposUsuariosTelemarketers;
	
	public void Constructor(WebDriver driver){ 

	    this.wd = driver; 

	    } 
	
	public void SelectTelemarketer (){
		
		wd.switchTo().defaultContent();
    	wd.switchTo().frame("main");
		
		UsuariosGrupos.click();
		
		UsuariosGruposUsuarios.click();
		
		UsuariosGruposUsuariosTelemarketers.click();
		

	}
	

}
