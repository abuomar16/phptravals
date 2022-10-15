package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;






public class HotelsPage {
	
	public WebDriver driver ;
	public HotelsPage (WebDriver driver)
	{
		this.driver =driver   ;
		
	}
	
	By city_name =By.cssSelector("div.input-items") ;
	By textbox =By.xpath("//*[@id=\"fadein\"]/span/span/span[1]/input") ;
	By hotel_list = By.cssSelector("span.select2-results") ;
	
	
	By checkin =By.id("checkin") ;
	By checkout =By.id("checkout") ;
	By Travellers =By.cssSelector("div.dropdown.dropdown-contain") ;
	By Rooms =By.xpath("//*[@id=\"hotels-search\"]/div/div/div[3]/div/div/div/div/div[1]/div/div/div[3]") ;
	By Adults =By.xpath("//*[@id=\"hotels-search\"]/div/div/div[3]/div/div/div/div/div[2]/div/div/div[2]") ;
	By search_btn =By.id("submit") ;
	
	
	
	public void revers_hotel(String text) throws InterruptedException
	{
		driver.findElement(city_name).click();
		driver.findElement(textbox).sendKeys(text);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	    
	    driver.findElements(hotel_list).get(0).click();
	    
	    
	    
		JavascriptExecutor js =  ((JavascriptExecutor) driver) ;
		js.executeScript("arguments[0].setAttribute('value','"+"10-10-2024"+"');", driver.findElement(checkin)) ;
		js.executeScript("arguments[0].setAttribute('value','"+"10-10-2025"+"');", driver.findElement(checkout)) ;


		
		driver.findElement(Travellers).click();
		driver.findElement(Rooms).click();
		driver.findElement(Adults).click();
		
		driver.findElement(search_btn).click();
		
	
		
	}
	

}
