package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	
	Properties pro;
	
	public ReadConfig() {
		
		File src= new File("./configuration/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
		} catch (Exception e) {
			
			System.out.println("Exception is "+e.getMessage());
		}
		
				
	}

	public String getApplicationURL() {
		
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getUserName() {
		
		String username=pro.getProperty("username");
		return username;
	}
	
	public String getpassword() {
		
		String password=pro.getProperty("password");
		return password;
	}
	
	public String getchromepath() {
		
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getfirefoxpath() {
		
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	
   public String getedgepath() {
		
		String edgepath=pro.getProperty("edgepath");
		return edgepath;
	}
   
   public String getbrowser() {
		
		String browser=pro.getProperty("browser");
		return browser;
	}
	
}
