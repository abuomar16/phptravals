package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class BaseTests {
	
	public static WebDriver driver  ;
	
	
	@BeforeSuite
	public void setUp() 
	{
			
		
		System.setProperty("webdriver.chrome.driver" , "driver/chromedriver.exe") ;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://phptravels.net/");
		
	}

	
	@AfterSuite
	public void stop ()
	{
		driver.quit();	
	}



}
