package WheatherTestClasses;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.homepage;

import utility.Browser;

public class CityAndTemparature {
	
	/*
           This class is only for Printing the temp for all cities 
	 */
	
	WebDriver driver;
	@BeforeClass
	
	public void openbrowser()
	 {
  driver=Browser.Openbrowser();
  
	 }

	@BeforeMethod
	
	public void ClickOnallCityNames()
	{
	List<WebElement> clickOnCity=driver.findElements(By.xpath("//div[@class='message']"));
	for(int i=0;i<clickOnCity.size();i++)
	{
	
	WebElement city=clickOnCity.get(i);
	city.click();
//	String nameOfCities=city.getText();
//	System.out.println(nameOfCities);
	}
	}
	
	@Test
	
	public void  getTemparatureOfallCities()
	{
	
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		List<WebElement> allcities= driver.findElements(By.xpath("//div[@class='outerContainer']"));
		for(int i=0;i<allcities.size();i++)
		{
		WebElement temp=allcities.get(i);
		String s=temp.getText();
		System.out.println(s);
		
		}
	}
}
