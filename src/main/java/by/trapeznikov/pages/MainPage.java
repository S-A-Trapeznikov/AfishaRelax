package by.trapeznikov.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage {
	
	private WebDriver driver;
	private static final String BASE_URL = "http://www.relax.by/";
	private  final Logger logger = LogManager.getRootLogger();
	
	public MainPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(this.driver,this);
		
	}
	
		
	@Override
	public void openPage(){
		
		driver.navigate().to(BASE_URL);
		logger.info("Main Page Open");
		
	}
	
	

}
