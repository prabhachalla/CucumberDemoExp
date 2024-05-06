package StepDefinations;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
	import io.cucumber.java.en.When;
import pages.Loginpage;
import pages.settingpage;
import io.cucumber.java.en.Then;

	public class LoginAndSettingsSteps {
		
		private WebDriver driver;
		private settingpage  Settingpage;
		private Loginpage loginpage;
		
		@Before
		public void setup() {
			
			driver=new ChromeDriver();
		}
//		@After
//		public void tearDown() {
//			if(driver!=null) {
//				driver.quit();
//			}
//		}
		
	    @Given("I am on the Diathriv login page")
	    public void iAmOnTheDiathrivLoginPage() {
	    	
	    	 driver.get("https://web-staging.diathrive.com/");
	    	 driver.manage().window().maximize();
	    	 loginpage =new Loginpage(driver);
	    	 Settingpage = new settingpage(driver);
	    	
	    }

	    @When("I enter a valid username and password")
	    public void iEnterValidUsernameAndPassword() {
	    	loginpage.enterEmail("prabhach56@gmail.com");
	    	loginpage.enterPassword("Prabha@0421");

	    }

	    @When("I click on the login buttons1")
	    public void iClickOnLoginButton() throws InterruptedException {
	        // Click on the login button
	    	loginpage.clickLoginButton();
	    	loginpage.Requestfailed();
	    	loginpage.closebutton1();
			

	    }

	    @Then("I should be logged in successfully")
	    public void iShouldBeLoggedInSuccessfully() {
	        // Verify successful login
	    	
	    }

	    @Then("I should be able to click on the settings button")
	    public void iShouldBeAbleToClickOnSettingsButton() throws InterruptedException {
	        // Click on the settings button
	    	Settingpage.checksetttingpage();
	    	
	    }

	    @Then("I should be able to navigate to My Contacts dashboard")
	    public void iShouldBeAbleToNavigateToMyContactsDashboard() throws InterruptedException {
	        // Navigate to My Contacts
	    	Settingpage.Checkmycontact();
	    	Settingpage.Addcontact();
	    	Settingpage.ContactDetails("prabhakar","ch");
	    	
	    }

	    @Then("I should be able to check and validate fields in settings")
	    public void iShouldBeAbleToCheckAndValidateFieldsInSettings() {
	        // Validate fields in settings
	    }
	}



