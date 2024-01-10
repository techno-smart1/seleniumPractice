package ObjectReposatory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	
	private By emailfield=By.xpath("//input[@id=\"input-email\"]");
	private By passwordfield=By.xpath("//input[@id=\"input-password\"]");
	private By loginbutton=By.xpath("//input[@type=\"submit\"]");

	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement emailfield() {
		return driver.findElement(emailfield);
	
}

	public WebElement passwordfield() {
		return driver.findElement(passwordfield);
	
}	
	public WebElement loginbutton() {
		return driver.findElement(loginbutton);
	
}	
}
