package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalHomePage {
	
	public WebDriver driver;
	
	public PortalHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By arrowBtn = By.id("userNavigationLabel");
	
	public WebElement chkLoginOrNot() {
		return driver.findElement(arrowBtn);
	}

}
