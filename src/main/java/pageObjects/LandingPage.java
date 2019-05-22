package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By logIn = By.cssSelector("input[data-testid='royal_login_button']");
	
	By linkText = By.linkText("Forgotten account?");
	
	public WebElement getLogin() {
		return driver.findElement(logIn);
	}
	
	public WebElement getLinkText() {
		return driver.findElement(linkText);
	}

}
