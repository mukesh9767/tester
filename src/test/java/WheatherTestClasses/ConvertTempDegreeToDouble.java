package WheatherTestClasses;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.homepage;
import utility.Browser;

public class ConvertTempDegreeToDouble {
	
	/*
	      In This Class i Convert temp. of cities Into Double And Print Into Console
	 */
	
	WebDriver driver;
	
	@BeforeTest
	
	public void browserOpen()
	{
     driver=Browser.Openbrowser();// here i open the browser
	}
	
	
	@Test
	
	public void ClickOnAllCity()
	{
		homepage home=new homepage(driver);// here i create the object of pom class ie homepage
		
		home.ClickOnallCityNames(); // here i call the homepage class methods
		
		home.getTemparatureOfallCities();
		
	}
	
	

}
