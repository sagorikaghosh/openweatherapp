package org.openweathermap.automation.base;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CreateDriverInstance {
	
	public WebDriver generateDriverInstance()   //generates driver instance
	{
		WebDriver driver ;
		ResourceBundle config = ResourceBundle.getBundle("config");
		if(config.getString("browser").equalsIgnoreCase("chrome"))
				{
			       System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			       driver = new ChromeDriver();
				}
		else if(config.getString("browser").equalsIgnoreCase("firefox"))
				{
			   System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		       driver = new FirefoxDriver();
			    }
		else if(config.getString("browser").equalsIgnoreCase("ie"))
				{
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
		       driver = new InternetExplorerDriver();
			    }
		else
				{
			   System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		       driver = new ChromeDriver();
			    }
			driver.get(config.getString("applicationURL"));
			return driver;
	}
	
	public void closeDriver(WebDriver driver)  //closes driver instance
	{
		driver.quit();
	}
	
	

}
