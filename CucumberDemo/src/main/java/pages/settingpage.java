package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class settingpage {
	
	private WebDriver driver;
//	private By emailInputLocator = By.xpath("//input[@type='email']");
//    private By passwordInputLocator = By.xpath("//input[@type='password']");
//    private By loginButtonLocator = By.xpath("//div[@class='css-146c3p1 r-1mgje8r r-ubezar r-135wba7 r-12kyg2d']");
//    
//    //private By Requistfailed=By.xpath("//div[contains(text(),'Continue')]");
//    private By Requistfailed=By.xpath("//div[@data-testid='BottomExpandableDrawer-Button-1']");
//    private By  closebutton=By.xpath("(//div[@data-testid='Button-Text-Title'])[3]");
    private By Settingpa=By.xpath("//div[contains(text(),'Settings')]");
    private By Mycontacts=By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[5]/div[1]/div[2]");
    private  By Addnewcontact=By.xpath("//div[@class='css-146c3p1 r-1mgje8r r-ubezar r-135wba7 r-12kyg2d']");
    private By firstname=By.xpath("//input[@Class='css-11aywtz r-6taxm2 r-10paoce'][1]");
    private By lastname=By.xpath("//div[3]//div[2]//input[1]");
    private By relationship=By.xpath("//div[@class='css-175oi2r']//div[@class='css-175oi2r r-1loqt21 r-1otgn73']");
    private By relationship1=By.xpath("//body/div/div[@class='r-1p0dtai r-1d2f490 r-1xcajam r-zchlnj r-ipm5af r-sfbmgh r-1ielgck r-1uypc71 r-1qulhi1 r-ghxds0']/div[@class='css-175oi2r']/div[@role='dialog']/div[@class='css-175oi2r r-13awgt0 r-ipm5af']/div[@class='css-175oi2r r-1q5og4l r-13awgt0 r-17s6mgv r-173mn98 r-1oji4za']/div[@class='css-175oi2r r-97e31f r-bv2aro r-hxflta r-10xqauy r-14lw9ot r-wowrgg r-oho8x9']/div[@class='css-175oi2r r-d23pfw']/div[@class='css-175oi2r r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-agouwx r-1wzrnnt']/div[@class='css-175oi2r']/div[3]/div[1]/div[1]//*[name()='svg']//*[name()='circle' and contains(@cx,'9')]");
    private By relationshipconfirm=By.xpath("//div[@class='css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r-1xktl5x r-1867qdf r-13awgt0 r-18u37iz r-1awozwy r-1777fci']");
    private By phonenumber=By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/div[2]/input[1]");
    private By email=By.xpath("//input[@type='email']");
    private By submit=By.xpath("//div[contains(text(),'Save')]");
    
    
    //Constructor
    public settingpage(WebDriver driver) {
        this.driver = driver;
    }
    
//    public void enterEmail(String email) {
//        WebElement emailInput = driver.findElement(emailInputLocator);
//        emailInput.sendKeys(email);
//    }
//
//    public void enterPassword(String password) {
//        WebElement passwordInput = driver.findElement(passwordInputLocator);
//        passwordInput.sendKeys(password);
//    }
//
//    public void clickLoginButton() throws InterruptedException {
//        WebElement loginButton = driver.findElement(loginButtonLocator);
//        loginButton.click();
//        Thread.sleep(50000);
//    }
//    public void Requestfailed()   {
//        WebElement Button = driver.findElement(Requistfailed);
//        Button.click();
//        
//    }
//    public void closebutton1() throws InterruptedException {
//    	
//    	WebElement closeButton = driver.findElement(closebutton);
//        closeButton.click();
//        Thread.sleep(5000);
//        
//    }

    // Methods
    public void checksetttingpage( ) throws InterruptedException {
        WebElement clicksetting = driver.findElement(Settingpa);
        clicksetting.click();
        Thread.sleep(2000);
        
    }
    
    public void Checkmycontact( ) throws InterruptedException   {
        WebElement clickmycontact=driver.findElement(Mycontacts);
        clickmycontact.click();
        Thread.sleep(2000);
        
    }
    public void Addcontact( )   {
        WebElement addcontacts=driver.findElement(Addnewcontact);
        addcontacts.click();
        
    }
    
    public void ContactDetails(String firstnames, String lastnames ) throws InterruptedException   {
        WebElement contactdetails=driver.findElement(firstname);
        contactdetails.sendKeys(firstnames);
        WebElement Lastname=driver.findElement(lastname);
        Lastname.sendKeys(lastnames);
        	Thread.sleep(2000);
        WebElement Relationship=driver.findElement(relationship);
        Relationship.click();
        Thread.sleep(2000);
        WebElement Relationships=driver.findElement(relationship1);
        Relationships.click();
    
        WebElement confirmButton=driver.findElement(relationshipconfirm);
        confirmButton.click();
     Thread.sleep(2000);
        WebElement number=driver.findElement(phonenumber);
        number.sendKeys("9676790858");
        
        WebElement Gmail=driver.findElement(email);
        Gmail.sendKeys("prabhach58@gmail.com");
        
        WebElement Button=driver.findElement(submit);
        Button.click();
          
    }
    

   

}
