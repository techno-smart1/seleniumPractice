package ObjectReposatory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class RegisterAccount {
	WebDriver driver;
	public RegisterAccount(WebDriver driver) {
		
		
		this.driver=driver;
	}
	
private By firstname=By.xpath("//input[@id=\"input-firstname\"]");
private By lastname=By.xpath("//input[@id=\"input-lastname\"]");

private By emailfield=By.xpath("//input[@id=\"input-email\"]");
private By telephone=By.xpath("//input[@id=\"input-telephone\"]");

private By password=By.xpath("//input[@id=\"input-password\"]");

private By confirmpassword=By.xpath("//input[@id=\"input-confirm\"]");

private By privacycheckbox=By.xpath("//input[@name=\"agree\"]");

private By continuebutton=By.xpath("//input[@type=\"submit\"]");


public WebElement firstname() {
	return driver.findElement(firstname);

}
public WebElement lastname() {
	return driver.findElement(lastname);
	

}
public WebElement emailfield() {
	return driver.findElement(emailfield);

}
public WebElement telephone() {
	return driver.findElement(telephone);

}
public WebElement password() {
	return driver.findElement(password);

}
public WebElement confirmpassword() {
	return driver.findElement(confirmpassword);

}
public WebElement privacycheckbox() {
	return driver.findElement(privacycheckbox);
	

}
public WebElement continuebutton() {
	return driver.findElement(continuebutton);
	

}
}
