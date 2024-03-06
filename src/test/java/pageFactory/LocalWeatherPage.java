package pageFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baseClass.BaseClass;



public class LocalWeatherPage  {
	
	
    //Object Repository

    private @FindBy (id = "inputstring") WebElement textBox;
    private @FindBy (xpath = "//input[@id='btnSearch']") WebElement search;
    private @FindBy (xpath = "(//div[@class='row row-odd row-forecast'])[1]") WebElement forecast;
    private @FindBy (xpath = "(//div[@id='current_conditions-summary'])") WebElement conditions;
    
  //Constructor of the class
    public LocalWeatherPage() {
    		
    		PageFactory.initElements(BaseClass.driver, this);
    	}
	

   //Page Actions

public void clickTextArea() {
	textBox.click();
}

public void enterZipCode() {
textBox.sendKeys("61874");
 
}
public void clickGo() {
	search.click();
}

public void getCondition() {
	String temp = conditions.getText();
	System.out.println(temp);
}

public void scrollPageDown() {
	JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver;
	js.executeScript("window.scrollBy(0,500)", "");
}
public void  print() {
	String text = forecast.getText();
	System.out.println(text);
	
	
}
}

