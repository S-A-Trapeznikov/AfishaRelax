package by.trapeznikov.steps;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import by.trapeznikov.driver.DriverSingleton;
import by.trapeznikov.pages.AfishaPage;

public class Steps {
	
	private WebDriver driver;
	private final Logger logger = LogManager.getRootLogger();
	
	
	public void initBrowser(){
		
		driver = DriverSingleton.getDriver();
		
	}
	
	public void closeDriver(){
		
		driver.quit();
		driver = null;
	}
	
	public void afishaRelaxBy(){
		
		AfishaPage afishaPage = new AfishaPage(driver);
		
		afishaPage.openPage();
		
		
	}

}
