package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoard {
	
	public  WebDriver driver ;
	public DashBoard( WebDriver driver )
	{
	  this.driver =driver ;
	}
	
	By Flight    = By.linkText("Flights") ;
	By hotels    = By.linkText("Hotels") ;
	By Tours     = By.linkText("Tours") ;
	By Transfers = By.linkText("Transfers") ;
	By visa      = By.linkText("Visa") ;
	
	
	
	public void  Open_Flight_link() throws InterruptedException
	{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		driver.findElement(Flight).click();
	}
	
	public void  Open_hotels_link()
	{
		driver.findElement(hotels).click();
	}
	
	public void  Open_Tours_link()
	{
		driver.findElement(Tours).click();
	}
	
	public void Open_Transfers_link()
	{
		driver.findElement(Transfers).click();
	}
	
	public void  Open_visa_link()
	{
		driver.findElement(visa).click();
	}
	

}
