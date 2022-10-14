package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	
public static WebDriver Openbrowser() {
		
		System.setProperty("webdriver.chrome.driver","F:\\My D Drive Data\\New folder\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://social.ndtv.com/static/Weather/report/#pfrom=home-ndtv_topsubnavigation");
		driver.manage().window().maximize();
		return driver;
	}
}
