package PO_Functions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewUserPage {
	
	
		WebDriver driver;
	
		
	public AddNewUserPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//*[@id='app']/div/div[2]/div[1]/div/nav/ul/li[3]/a/p")
	WebElement lnkUser;
	
	@FindBy(xpath="//span[@class='capitalize']")
	WebElement lnkAddUser;
	
	@FindBy(xpath="//*[@id='scroller']/div/div[1]/input")
	WebElement txtfirstname;
	
	@FindBy(xpath="//*[@id='scroller']/div/div[2]/input")
	WebElement txtlastname;
	
	@FindBy(xpath="//*[@id='scroller']/div/div[4]/input")
	WebElement txtemployeeid;
	
	@FindBy(xpath="//select[@id='UserTypeId']")
	WebElement usertype;
	
	@FindBy(xpath="//button[@class='button primary']")
	WebElement btnsave;
	
	@FindBy(xpath="//*[@id='modal-container']/div/div/button")
	WebElement btndone;
	
	
	
	public void clickuser() {
		lnkUser.click();
	}
	

	public void clickadduser() {
		lnkAddUser.click();
	}
	
	public void firstname(String fname) {
		txtfirstname.sendKeys(fname);
	}
	
	public void lastname(String lname) {
		txtlastname.sendKeys(lname);
	}
	
	public void employeeid(String eid) {
		txtemployeeid.sendKeys(eid);
	}
	
	public void usertype() {
		usertype.click();
		Select menu=new Select(usertype);
		menu.selectByVisibleText("User");
	}
	
	public void Clicksave() {
		btnsave.click();
	}
	
	public void ClickDone() {
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		Actions action=new Actions(driver);
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler);
		
		wait.until(ExpectedConditions.elementToBeClickable(btndone));
		action.moveToElement(btndone).click().perform();
	}

	
}
