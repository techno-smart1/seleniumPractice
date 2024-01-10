package TestPackage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ObjectReposatory.RegisterAccount;
public class RegisterTest {

	@Test
	public void validRegistation() throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		RegisterAccount ra=new RegisterAccount(driver);
		
		ra.firstname().sendKeys("Albert");
		Thread.sleep(2000);
		ra.lastname().sendKeys("Desouza");
		Thread.sleep(2000);
		ra.emailfield().sendKeys("albert.d@gmail.com");
		Thread.sleep(2000);
		ra.telephone().sendKeys("2343455670");
		Thread.sleep(2000);
		ra.password().sendKeys("test@123");
		Thread.sleep(2000);
		ra.confirmpassword().sendKeys("test@123");
		Thread.sleep(2000);
		ra.privacycheckbox().click();
		Thread.sleep(2000);
		ra.continuebutton().click();
		Thread.sleep(5000);
		driver.close();
	
	}

}
