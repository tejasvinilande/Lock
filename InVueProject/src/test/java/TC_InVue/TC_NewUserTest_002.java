package TC_InVue;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import PO_Functions.AddNewUserPage;
import PO_Functions.LoginPage;



public class TC_NewUserTest_002 extends BaseClass {

	@Test
	public void AddNewUser() {
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.ClickLogin();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		AddNewUserPage newuser=new AddNewUserPage(driver);
		newuser.clickuser();
		newuser.clickadduser();
		newuser.firstname("Tej");
		newuser.lastname("user");
		newuser.employeeid("t345");
		newuser.usertype();
		newuser.Clicksave();
		newuser.ClickDone();
		
	/*	boolean res=driver.getPageSource().contains("User created sucessfully.");
		
		if (res==true) {
			
			Assert.assertTrue(true);
			logger.info("user created");
		}
		
		else {
			
			Assert.assertTrue(false);
			logger.info("user not created");
			
			}
	*/	
	
		
		
	}
	
}
