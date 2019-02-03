package org.openweathermap.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidCity {
	
	public void enterCity (WebDriver driver)
	{
		driver.findElement(By.id("q"));
	}

	public void search (WebDriver driver)
	{
		driver.findElement(By.id(""));
	}

}
