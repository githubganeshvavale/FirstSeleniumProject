package StepDefination;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.loginPage;

public class LoginStepsDefinations {
	
	WebDriver driver;
	loginPage login;
	@Given("User is on lgin page")
	public void user_is_on_lgin_page() {
	    
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
	}

	@When("User enters {string} and {string}")
	public void user_enters_username_and_password(String uname, String password) {
	    
		login = new loginPage(driver);
		
		login.enterUsername(uname);
		//driver.findElement(By.id("user-name")).sendKeys(uname);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		login.enterPassword(password);
		//driver.findElement(By.id("password")).sendKeys(password);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

	@And("click on login button")
	public void click_on_login_button() {
	    
		login.clickLogin();
		//driver.findElement(By.id("login-button")).click();
	}

	@Then("user is navigated to Home page")
	public void user_is_navigated_to_home_page() {
	  
		login.appLogoDisplayed();
		
		System.out.println("I am on Home page ");
	}

	@And("close the browser")
	public void close_the_browser() {
	   driver.close();
	}


}
