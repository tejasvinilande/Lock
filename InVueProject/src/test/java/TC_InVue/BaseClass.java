package TC_InVue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.ReadConfig;




public class BaseClass {

	
     ReadConfig pro= new ReadConfig();
	
	public String baseURL=pro.getApplicationURL();
	public String username=pro.getUserName();
	public String password=pro.getpassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	
	@BeforeClass
	public void setup() throws IOException {
		
		logger=Logger.getLogger("LockDemo");
		PropertyConfigurator.configure("log4j.properties");
		
		if(pro.getbrowser().equalsIgnoreCase("chrome")) {
			
		System.setProperty("webdriver.chrome.driver",pro.getchromepath());
		driver=new ChromeDriver();
		
		}
		else if(pro.getbrowser().equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",pro.getfirefoxpath());
            driver = new FirefoxDriver();
			
		}
		else if(pro.getbrowser().equalsIgnoreCase("edge")) {
			

            System.setProperty("webdriver.edge.driver",pro.getedgepath());
            driver = new EdgeDriver();
		}
		
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
}
