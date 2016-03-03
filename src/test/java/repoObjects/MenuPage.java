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
	
	
	//ConfiguracionGeneral

	@FindBy (how = How.XPATH, using = "//form/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/p/table/tbody/tr[1]/td/div")
	public static WebElement ConfiguracionGeneral;
	
	@FindBy (how = How.XPATH, using = "//form/div[1]/span/table/tbody/tr[1]/td")
	public static WebElement GeneralPlataforma;
	
	@FindBy (how = How.XPATH, using = "//form/div[1]/span/table/tbody/tr[2]/td")
	public static WebElement GeneralCodigoInternacionales;
	
	@FindBy (how = How.XPATH, using = "//form/div[1]/span/table/tbody/tr[3]/td/div")
	public static WebElement GeneralCodigoNacionales;
	
	@FindBy (how = How.XPATH, using = "//form/div[1]/span/table/tbody/tr[4]/td/div")
	public static WebElement GeneralCodigoInterconexion;
	
	@FindBy (how = How.XPATH, using = "//form/div[1]/span/table/tbody/tr[5]/td/div")
	public static WebElement GeneralMascaras;
	
	@FindBy (how = How.XPATH, using = "//form/div[2]/span/table/tbody/tr[1]/td/div")
	public static WebElement GeneralMascaraIN;
	
	@FindBy (how = How.XPATH, using = "//form/div[2]/span/table/tbody/tr[2]/td/div")
	public static WebElement GeneralMascaraOUT;
	
	@FindBy (how = How.XPATH, using = "//form/div[1]/span/table/tbody/tr[6]/td/div")
	public static WebElement GeneralFeriados;
	
	@FindBy (how = How.XPATH, using = "//form/div[1]/span/table/tbody/tr[7]/td/div")
	public static WebElement GeneralHorariosTramasHorarios;
	
	@FindBy (how = How.XPATH, using = "//form/div[1]/span/table/tbody/tr[8]/td/div")
	public static WebElement GeneralMoneda;
	
	@FindBy (how = How.XPATH, using = "//form/div[1]/span/table/tbody/tr[9]/td/div")
	public static WebElement GeneralListaNegra;
	
	@FindBy (how = How.XPATH, using = "//form/div[1]/span/table/tbody/tr[10]/td/div")
	public static WebElement GeneralListaVerde;
	
	@FindBy (how = How.XPATH, using = "//form/div[1]/span/table/tbody/tr[11]/td/div")
	public static WebElement GeneralClaves;
	
	
	
	//Clientes
	
	@FindBy (how =How.XPATH, using = "//form/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/p/table/tbody/tr[2]/td")
	public static WebElement Clientes;
	
	
	
	//Servidores&Clientes
	
	@FindBy (how = How.XPATH, using = "//form/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/p/table/tbody/tr[3]/td")
	public static WebElement ServidoresClientes;
	
	@FindBy (how = How.XPATH, using = "//form/div[3]/span/table/tbody/tr[1]/td/div")
	public static WebElement SERVIDORES;
	
	@FindBy (how = How.XPATH, using = "//form/div[4]/span/table/tbody/tr[1]/td/div")
	public static WebElement SERVIDORESTelefonia;
	
	@FindBy (how = How.XPATH, using = "//form/div[4]/span/table/tbody/tr[2]/td/div")
	public static WebElement SERVIDORESNoTelefonia;
	
	@FindBy (how = How.XPATH, using = "//form/div[3]/span/table/tbody/tr[2]/td/div")
	public static WebElement PLACAS;
	
	@FindBy (how = How.XPATH, using = "//form/div[5]/span/table/tbody/tr[1]/td/div")
	public static WebElement PLACASCanal;
	
	@FindBy (how = How.XPATH, using = "//form/div[5]/span/table/tbody/tr[2]/td/div")
	public static WebElement PLACASPosicion;
	
	@FindBy (how = How.XPATH, using = "//form/div[3]/span/table/tbody/tr[3]/td/div")
	public static WebElement DISPOSITIVOS;
	
	@FindBy (how = How.XPATH, using = "")
	public static WebElement DISPOSITIVOSCanal;
	
	@FindBy (how = How.XPATH, using = "")
	public static WebElement DISPOSITIVOSPosicion;
	
	
	
	//ProveedoresCostos&Rutas  
	
	@FindBy (how = How.XPATH, using = "//form/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/p/table/tbody/tr[4]/td")
	public static WebElement ProveedoresCostosRutas;
	
	@FindBy (how = How.XPATH, using = "//form/div[7]/span/table/tbody/tr[1]/td")
	public static WebElement ProveedoresCostosRutasProvedores;
	
	@FindBy (how = How.XPATH, using = "//form/div[7]/span/table/tbody/tr[2]/td")
	public static WebElement ProveedoresCostosRutasCostos;
	
	@FindBy (how = How.XPATH, using = "//form/div[7]/span/table/tbody/tr[3]/td")
	public static WebElement ProveedoresCostosRutasPrecios;

	@FindBy (how = How.XPATH, using = "//form/div[7]/span/table/tbody/tr[4]/td")
	public static WebElement ProveedoresCostosRutasRutas;
	
	
	
	//LocucionesMusicaEspera
	
	@FindBy (how = How.XPATH, using = "//form/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/p/table/tbody/tr[5]/td/div")
	public static WebElement LocucionesMusicaEspera;
	
	@FindBy (how = How.XPATH, using = "//form/div[8]/span/table/tbody/tr[1]/td/div")
	public static WebElement Locuciones;
	
	@FindBy (how = How.XPATH, using = "//form/div[8]/span/table/tbody/tr[2]/td/div")
	public static WebElement MusicaEspera;
	
	@FindBy (how = How.XPATH, using = "//form/div[8]/span/table/tbody/tr[2]/td/div")
	public static WebElement Gramatica;
	
	
	//---------------------------------------------------------------------------------
	//UsuarioGrupos
	//---------------------------------------------------------------------------------
	
	@FindBy (how = How.XPATH, using = "//form/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/p/table/tbody/tr[6]/td/div")
	public static WebElement  UsuariosGrupos;
	
	@FindBy (how = How.XPATH, using = "//form/div[9]/span/table/tbody/tr[1]/td/div" )
	public static WebElement UsuariosGruposUSUARIOS;
	
	@FindBy (how = How.XPATH, using = "//form/div[10]/span/table/tbody/tr[2]/td/div" )
	public static WebElement UsuariosGruposUSUARIOSTelemarketers;
	
	@FindBy (how = How.XPATH, using = "//form/div[10]/span/table/tbody/tr[1]/td/div" )
	public static WebElement UsuariosGruposUSUARIOSDirectos;
	
	@FindBy (how = How.XPATH, using = "//form/div[9]/span/table/tbody/tr[2]/td/div")
	public static WebElement UsuariosGruposGRUPOS;
	
	@FindBy (how = How.XPATH, using = "//form/div[11]/span/table/tbody/tr[1]/td/div")
	public static WebElement UsuariosGruposGRUPOSDirectos;

	@FindBy (how = How.XPATH, using = "//form/div[11]/span/table/tbody/tr[2]/td/div")
	public static WebElement UsuariosGruposGRUPOSTelemarketrs;
	
	@FindBy (how = How.XPATH, using = "//form/div[9]/span/table/tbody/tr[3]/td/div")
	public static WebElement UsuariosGruposPERFILES;
	

	//---------------------------------------------------------------------------------
	//Calendarios,Colas & Arboles
	//---------------------------------------------------------------------------------
	
	@FindBy (how = How.XPATH, using = "//form/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/p/table/tbody/tr[7]/td/div")
	public static WebElement CalendariosColasArboles;
	
	@FindBy (how = How.XPATH, using = "//form/div[12]/span/table/tbody/tr[1]/td/div")
	public static WebElement CalendarioColasArbolesCALENDARIO;
	
	@FindBy (how = How.XPATH, using = "//form/div[12]/span/table/tbody/tr[2]/td/div")
	public static WebElement CalendarioColasArbolesCOLAS;
	
	@FindBy (how = How.XPATH, using = "//form/div[12]/span/table/tbody/tr[3]/td/div")
	public static WebElement CalendarioColasArbolesARBOLES;
	
	

	//---------------------------------------------------------------------------------
	//BolquesyBases
	//---------------------------------------------------------------------------------
	
	@FindBy (how = How.XPATH, using = "//form/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/p/table/tbody/tr[8]/td/div")
	public static WebElement BloquesBases;
	

	@FindBy (how = How.XPATH, using = "//form/div[13]/span/table/tbody/tr[1]/td/div")
	public static WebElement BloquesBasesBloqueos;

	@FindBy (how = How.XPATH, using = "//form/div[14]/span/table/tbody/tr[1]/td")
	public static WebElement BloquesBasesBloqueosEntrantes;
	

	@FindBy (how = How.XPATH, using = "//form/div[14]/span/table/tbody/tr[2]/td/div")
	public static WebElement BloquesBasesBloqueosSalientes;
	
	@FindBy (how = How.XPATH, using = "//form/div[13]/span/table/tbody/tr[2]/td/div")
	public static WebElement BloquesBasesBloqueosDB;
	
	@FindBy (how = How.XPATH, using = "//form/div[15]/span/table/tbody/tr[1]/td/div")
	public static WebElement BloquesBasesBloqueosDBInternas;
	
	@FindBy (how = How.XPATH, using = "//form/div[15]/span/table/tbody/tr[2]/td/div")
	public static WebElement BloquesBasesBloqueosDBExternas;
	
	//---------------------------------------------------------------------------------
	//DNIsAplicaciones
	//---------------------------------------------------------------------------------
	
	@FindBy (how = How.XPATH, using = "//form/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/p/table/tbody/tr[9]/td/div")
	public static WebElement DNIsAplicaciones;
	
	@FindBy (how = How.XPATH, using = "//form/div[16]/span/table/tbody/tr[1]/td/div")
	public static WebElement DNIS;
	
	@FindBy (how = How.XPATH, using = "//form/div[16]/span/table/tbody/tr[2]/td/div")
	public static WebElement Aplicaciones;
	
	//---------------------------------------------------------------------------------
	//Campañas
	//---------------------------------------------------------------------------------
	
	@FindBy (how = How.XPATH, using = "//form/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/p/table/tbody/tr[10]/td/div")
	public static WebElement Campañas;	
	
	@FindBy (how = How.XPATH, using = "//form/div[17]/span/table/tbody/tr[1]/td/div")
	public static WebElement CampañasTelefonia;
	
	@FindBy (how = How.XPATH, using = "//form/div[17]/span/table/tbody/tr[2]/td/div")
	public static WebElement CampañasRedesSociales;
	
	@FindBy (how = How.XPATH, using = "//form/div[17]/span/table/tbody/tr[3]/td/div")
	public static WebElement CampañaDepuracionDeCampaña;
	
	
	//---------------------------------------------------------------------------------
	//Reportes
	//---------------------------------------------------------------------------------

	@FindBy (how = How.XPATH, using = "//form/table/tbody/tr/td[1]/div[2]/table/tbody/tr/td/p/table/tbody/tr[11]/td/div")
	public static WebElement Reportes;
	
	
	
	
	
	
	
	@FindBy (how = How.XPATH, using = "")
	public static WebElement aa;
	
	public void Constructor(WebDriver driver){ 

	    this.wd = driver; 

	    } 
	
	public void SelectTelemarketer (){
		
		wd.switchTo().defaultContent();
    	wd.switchTo().frame("main");
		
		UsuariosGrupos.click();
		
		UsuariosGruposUSUARIOS.click();
		
		UsuariosGruposUSUARIOSTelemarketers.click();
		

	}
	
	public void SelectConfiguracionGeneralPlataforma (){
		
		ConfiguracionGeneral.click();
		
		GeneralPlataforma.click();
		
		
	}

}
