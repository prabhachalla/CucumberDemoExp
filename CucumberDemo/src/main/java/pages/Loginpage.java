package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Loginpage {
	
	private WebDriver driver;

    // Locators
    private By emailInputLocator = By.xpath("//input[@type='email']");
    private By passwordInputLocator = By.xpath("//input[@type='password']");
    private By loginButtonLocator = By.xpath("//div[@class='css-146c3p1 r-1mgje8r r-ubezar r-135wba7 r-12kyg2d']");
    
    //private By Requistfailed=By.xpath("//div[contains(text(),'Continue')]");
    private By Requistfailed=By.xpath("//div[@data-testid='BottomExpandableDrawer-Button-1']");
    private By  closebutton=By.xpath("(//div[@data-testid='Button-Text-Title'])[3]");
    private By logoutLinkLocator = By.xpath("//div[@data-testid='SidePannel-div-SignOut']");
    private By signout=By.xpath("//div[@class='css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r-1867qdf r-18u37iz r-1awozwy r-1777fci']");
	//private By message=By.xpath("//div[@class='css-146c3p1 r-1n4zqn1 r-vtw7wd r-1b43r93 r-10yl4k r-knv0ih']");

    // Constructor
    public Loginpage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void enterEmail(String email) {
        WebElement emailInput = driver.findElement(emailInputLocator);
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordInput = driver.findElement(passwordInputLocator);
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() throws InterruptedException {
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
        Thread.sleep(50000);
    }
    public void Requestfailed()   {
        WebElement Button = driver.findElement(Requistfailed);
        Button.click();
        
    }
    public void closebutton1() throws InterruptedException {
    	
    	WebElement closeButton = driver.findElement(closebutton);
        closeButton.click();
        Thread.sleep(5000);
        
    }
    public void clickLogoutButton() {
        WebElement logoutButton = driver.findElement(logoutLinkLocator);
        logoutButton.click();
        WebElement signout1=driver.findElement(signout);
        signout1.click();
        
    }
    
//    public String Messagetext() {
//    	
//    	return driver.findElement(message).getText();
//    }

}

