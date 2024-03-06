package stepDefinitions;

import static org.testng.Assert.assertTrue;

import com.aventstack.extentreports.util.Assert;

import baseClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LocalWeatherPage;

public class LocalWeather extends LocalWeatherPage {
	
	
	@Given("User is on weather page")
	public void user_is_on_weather_page() {
		String url = BaseClass.driver.getCurrentUrl();
		assertTrue(url.contains("weather.gov"));
		System.out.println(url);
		 
	    
	}

	@When("User enters zipcode")
	public void user_enters_zipcode() {
		clickTextArea();
		enterZipCode();
		
	    
	}

	@When("User clicks go")
	public void user_clicks_go() throws InterruptedException {
		Thread.sleep(3000);
		clickGo();
	}

	@Then("User is on local weather page")
	public void user_is_on_local_weather_page() throws InterruptedException {
		getCondition();
		Thread.sleep(3000);
		scrollPageDown();
		//Thread.sleep(3000);
		print();
	    
	}
	

}
	
	

