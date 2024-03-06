package testRunner;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;


@CucumberOptions(
		features = {"src/test/resources/Features"},
		glue = {"stepDefinitions", "applicationHooks"},
		plugin = {"pretty", "html:target/cucumbertest.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				
		},
		monochrome=true
		)

public class TestRunner extends AbstractTestNGCucumberTests{

	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
    }
}
