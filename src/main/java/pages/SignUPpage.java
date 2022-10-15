package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUPpage {


	public  WebDriver driver ;

	By frist_name = By.name("first_name") ;
	By last_name = By.name("last_name") ;
	By phone = By.name("phone") ;
	By E_mail = By.name("email") ;

	By password = By.name("password") ;
	By account_type = By.id("account_type") ;

	// out of the scope 
	By captcha = By.xpath("//*[@id=\"recaptcha-anchor\"]") ;
	
	By signup_btn = By.id("button") ;


	public SignUPpage( WebDriver driver)

	{
		this.driver = driver ;
	}

	public void  Signup (String FristName ,String LastName ,String PhoneNum ,String Email , String pass  , String text) 
	{

		driver.findElement(frist_name).sendKeys(FristName);	
		driver.findElement(last_name).sendKeys(LastName);	
		driver.findElement(phone).sendKeys(PhoneNum);
		driver.findElement(E_mail).sendKeys(Email);	


		Select selectOption = new Select(driver.findElement(account_type)) ;	
		selectOption.selectByVisibleText(text);

		driver.findElement(password).sendKeys(pass);

		// captcha out of the scope
		//driver.findElement(not_robot).click();

		driver.findElement(signup_btn).click(); 


	}

	

}
