package demoPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.BaseClass;

public class ValidateTitleTest extends BaseClass{
	
	@Test
	public void validateTitle() throws IOException {
		driver = initializeDriver();
		String url = prop.getProperty("url");
		driver.get(url);
		LandingPage lap = new LandingPage(driver);
		Assert.assertEquals(lap.getLinkText().getText(), "Forgotten account?");
		driver.close();
	}

}
