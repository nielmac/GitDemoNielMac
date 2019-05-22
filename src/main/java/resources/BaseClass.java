package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

	public WebDriver driver;
	ChromeOptions options;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("F:\\softwares\\Selenium_WebDriver\\Maven\\MavenFramework\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		options = new ChromeOptions();
		options.addArguments("--disable-infobars");
		
		String browser = prop.getProperty("browser");
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\softwares\\Selenium_WebDriver\\New_Setup\\chromedriver.exe");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
		}
		
		else if(browser.equals("ie")) {
			/* code to invoke ie browser */
		}
		
		else {
			/* code to invoke firefox browser */
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
