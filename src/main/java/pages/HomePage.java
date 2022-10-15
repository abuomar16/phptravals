package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage  {


	public  WebDriver driver ;

	By account_btn = By.id("ACCOUNT") ;

	By customer_sign_up_link = By.xpath("//*[@id=\"fadein\"]/header/div/div/div/div/div/div[2]/div/div[2]/div[3]/div/ul/li[2]/a") ;

	By customer_login_link = By.xpath("//*[@id=\"fadein\"]/header/div/div/div/div/div/div[2]/div/div[2]/div[3]/div/ul/li[1]/a") ;

	public HomePage(WebDriver driver) 
	{
		this.driver = driver ;
	}


	public void openSign_up_Link() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(1000);
		driver.findElement(account_btn).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(1000);
		driver.findElement(customer_sign_up_link).click(); 

	}
	
	public void openLogin_Link() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(1000);
		driver.findElement(account_btn).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(1000);
		driver.findElement(customer_login_link).click(); 

	}





}
