package pom;

import java.util.List;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class homepage {
	
	WebDriver driver ;
	
	@FindBy  (xpath="//div[@class='message']") List<WebElement> clickOnAllcities;
	
	@FindBy  (xpath="//div[@class='outerContainer']") List<WebElement> GetAllCityWithTemp;
	
	
	public homepage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public void ClickOnallCityNames()
	{
		//int a=clickOnAllcities.size();
		// System.out.println(a);
	for(int i=0;i<5;i++)
	{
	
	WebElement city=clickOnAllcities.get(i);
	city.click();// here i select first 6 city and click one by one
	
	String nameOfCities=city.getText();
	System.out.println(nameOfCities); // here i print names of selected city on console
	}
	}
		
	public void  getTemparatureOfallCities()
	{
		
		//int b=GetAllCityWithTemp.size();
		
		for(int i=0;i<6;i++)
		{
		WebElement temp=GetAllCityWithTemp.get(i);
		String s=temp.getText();
		
//		System.out.println(s);// if i want to print all city names along with temp then i simply print string s
	
		
		System.out.println("********************");
	System.out.println(s.substring(0, 5).trim()); // here by using substring we  get result in double format
		
		}
	}
		
		
	}
	
	


