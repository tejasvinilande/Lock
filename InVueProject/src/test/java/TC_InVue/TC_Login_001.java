package TC_InVue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PO_Functions.LoginPage;



public class TC_Login_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException {

		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered Username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		
		
		lp.ClickLogin();
		
		if(driver.getTitle().equals("InVue Access Manager")) {
			
			Assert.assertTrue(true);
			logger.info("Login Test passed");
		}
		
		else
		{
			Assert.assertTrue(false);
			logger.info("Login Test failed");
		}
	}
	
}
