import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoExp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://web-staging.diathrive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("prabhach56@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Prabha@0421");
		driver.findElement(By.xpath("//div[@class='css-146c3p1 r-1mgje8r r-ubezar r-135wba7 r-12kyg2d']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@data-testid='BottomExpandableDrawer-Button-1']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='css-146c3p1 r-1mgje8r r-ubezar r-135wba7 r-12kyg2d']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='SidePannel-div-SignOut']")).click();

	}

}
