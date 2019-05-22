package demoPackage;

import java.io.IOException;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.BaseClass;

public class HomePageTest extends BaseClass {
	
	@Test(dependsOnMethods= {"validateTitle"})/*(dataProvider="getData")*/
	public void getHomePage() throws IOException  {
		initializeDriver();
		String url = prop.getProperty("url");
		driver.get(url);
		LandingPage lap = new LandingPage(driver);
		lap.getLogin().click();

		LoginPage lop = new LoginPage(driver);
		//data from properties file 
		lop.getUsername().sendKeys(prop.getProperty("username"));
		lop.getPassword().sendKeys(prop.getProperty("password"));
		lop.getLogInBtn().click(); 
		
		//data from DataProvider annotation
/*		lop.getUsername().sendKeys(username);
		lop.getPassword().sendKeys(password);
		lop.getLogInBtn().click();
*/	
		driver.close();
	}
	
/*	@DataProvider
	public String[][] getData() {
		String [][] data = new String[2][2];
		
		data[0][0] = "machhanilesh@gmail.com";
		data[0][1] = "1001@NielsM";
		
		data[1][0] = "nileshmachha@gmail.com";
		data[1][1] = "1001@NielsM";
		
		return data;
	}
*/	
	@Test
	public void getPage1() {
		
	}
	
	@Test
	public void getPage2() {
		
	}
	
	@Test
	public void getPage3() {
		
	}
}
