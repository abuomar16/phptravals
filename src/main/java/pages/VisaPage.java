package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class VisaPage {

	public  WebDriver driver ;
	public VisaPage( WebDriver driver )
	{
		this.driver =driver ;
	}

	By From_country =By.id("from_country") ;
	By to_country =By.id("to_country") ;
	By submit_btn1 =By.id("submit") ;
	
	By first_name =By.name("first_name") ;
	By last_name =By.name("last_name") ;
	By email =By.name("email") ;
	By phone =By.name("phone") ;
	By date =By.name("date") ;
	By notes =By.name("notes") ;
	
	By submit_btn2 =By.id("submit") ;
	
	public WebElement sucessful_massage   ;
	
	
	

	public void visa_apply( String text1 , String text2  , String text3 , String text4 ,
			                String text5 , String text6 , String text7 , String text8  ) throws InterruptedException
	{
		Select options1 = new Select (driver.findElement(From_country)) ;
		options1.selectByVisibleText(text1);

		Select options2 = new Select (driver.findElement(to_country)) ;
		options2.selectByVisibleText(text2);


		
		driver.findElement(submit_btn1).click();

		driver.findElement(first_name).sendKeys(text3);
		driver.findElement(last_name).sendKeys(text4);
		driver.findElement(email).sendKeys(text5);
		driver.findElement(phone).sendKeys(text6);
		driver.findElement(notes).sendKeys(text8);
		
		
		WebElement element  = driver.findElement(submit_btn2) ;
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		jse.executeScript("arguments[0].click()", element); 
		
		
		
		sucessful_massage = driver.findElement(By.cssSelector("div.card-body.my-5.text-center")) ;
	}


}
