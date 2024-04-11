package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class loginPage {
	
	
	WebDriver driver;
	
	
	  //By txt_username = By.id("user-name"); 
	  //By txt_password = By.id("password"); 
	  //By submitButton = By.id("login-button"); 
	  //By appLogo = By.xpath("//div[@class = 'app_logo']");
	 
	
	
	@FindBy (id = "user-name")
	WebElement txt_username;
	
	@FindBy (id ="password")
	WebElement txt_password;
	
	@FindBy (id = "login-button")
	WebElement submitButton;
	
	@FindBy (xpath = "//div[@class = 'app_logo']")
	WebElement appLogo;
	
	public loginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUsername (String username) {
		
		txt_username.sendKeys(username);
		
		
	}
	
	public void enterPassword (String password) {
		
		
		txt_password.sendKeys(password);
		
	}
	
	public void clickLogin () {
		
		
	submitButton.click();
		
	}
	
	public void userLogin (String username, String password) {
		
		txt_password.sendKeys(username);
		txt_password.sendKeys(password);
	
		submitButton.click();
		
	}
	
	public void appLogoDisplayed () {
		
	appLogo.isDisplayed();
		
	}
	
}
