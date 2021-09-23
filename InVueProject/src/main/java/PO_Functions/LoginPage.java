package PO_Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

          WebDriver driver;
          
          
	
		public LoginPage(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
	
		
		
	@FindBy(xpath="//input[@class='login-input-field'][1]")
	WebElement txtusername;
	
	@FindBy(xpath="//*[@id='app']/div/div[2]/div[2]/form/div[2]/div/input")
	WebElement txtpassword;
	
	@FindBy(xpath="//span[@class='button_label']")
	WebElement btnlogin;
	
	
	
	public void setUserName(String uname) {
		
		txtusername.sendKeys(uname);
		
	} 
	
	
    public void setPassword(String pwd) {
		
		txtpassword.sendKeys(pwd);
		
	}
	
    public void ClickLogin() {
	
	   btnlogin.click();
	   
	
    }

	
	
	
}

	

