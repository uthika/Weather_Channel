package applicationHooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseClass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;


public class Hooks extends BaseClass{
	
//	@Test
	
//	public Hooks() {
//		super();
//	}

	@BeforeAll
	public static void setUp() {
		initBrowser();
	
	}
	
	@After
	public static void takeScreenshot(Scenario scenario) {
		if(scenario.isFailed()) {
			//take screenshot
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
		}
	}
	
	@AfterAll
	public static void quitBrowser() {
		closeBrowser();
	}
	

}
