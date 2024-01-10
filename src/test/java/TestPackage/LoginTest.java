package TestPackage;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import ObjectReposatory.LoginPage;

public class LoginTest {
	@Test
	
	public void login() throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

LoginPage lo=new LoginPage(driver);
Thread.sleep(3000);
lo.emailfield().sendKeys("robert.f@gmail.com");
Thread.sleep(3000);
lo.passwordfield().sendKeys("test@123");
Thread.sleep(3000);
lo.loginbutton().click();
driver.close();

 
	}

	@Test
	public void loginwithinvalidcredentials() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		LoginPage lo1=new LoginPage(driver);
		Thread.sleep(3000);
		lo1.emailfield().sendKeys("robert1.f@gmail.com");
		Thread.sleep(3000);
		lo1.passwordfield().sendKeys("test@123");
		Thread.sleep(3000);
		lo1.loginbutton().click();
		driver.close();	
		
	}
	public void generateTime() {
		Date date=new Date();
		
	}
	
}


