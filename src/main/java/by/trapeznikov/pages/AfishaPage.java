package by.trapeznikov.pages;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AfishaPage extends AbstractPage {
	
	private static final String BASE_URL = "http://afisha.relax.by";
	private static final Logger logger = LogManager.getRootLogger();
	
	public AfishaPage(WebDriver driver){
		
		super(driver);
		PageFactory.initElements(this.driver, this);
		
	}
	
	@Override
	public void openPage(){
		
		driver.navigate().to(BASE_URL);
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
}
