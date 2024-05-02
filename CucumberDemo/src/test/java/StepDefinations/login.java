package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Loginpage;

public class login {
	
	private WebDriver driver;
	private Loginpage loginpage;
	
	@Before
	public void setup() {
		
		driver=new ChromeDriver();
	}
//	@After
//	public void tearDown() {
//		if(driver!=null) {
//			driver.quit();
//		}
//	}
	
	
	
	@Given("i have open browser")
	public void i_have_open_browser() {
	    driver.get("https://web-staging.diathrive.com/");
	    loginpage =new Loginpage(driver);
	    driver.manage().window().maximize();
	}

	@When("I have entered a valid username and password")
	public void i_have_entered_a_valid_username_and_password() {
	   loginpage.enterEmail("prabhach56@gmail.com");
	   loginpage.enterPassword("Prabha@0421");
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() throws InterruptedException {
	    loginpage.clickLoginButton();
	}
	@When("I click on requiredfailed button")
	public void i_click_on_requiredfailed_button() throws InterruptedException
	{
		
		loginpage.Requestfailed();
		
	}
	@When("I click closebutton")
	public void I_click_closebutton() throws InterruptedException {
		loginpage.closebutton1();
	}
	@Then("click on signout button")
	public void click_on_signout_button() {
		
//		
//		WebElement signout=driver.findElement(By.xpath("//div[@data-testid='SidePannel-div-SignOut']"));
//		
//		signout.click();
		loginpage.clickLogoutButton();
	}

	
}