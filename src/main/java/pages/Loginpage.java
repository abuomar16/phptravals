package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	public static WebDriver driver  ;

	public Loginpage(WebDriver driver)
	{
		Loginpage.driver = driver ;
	}

	By E_mail = By.name("email") ;
	By password = By.name("password") ;

	By login_btn = By.cssSelector("button.btn.btn-default.btn-lg.btn-block.effect.ladda-button.waves-effect") ;


	public WebElement sucessful_massage   ;

	public void login (String Email ,String pass)
	{
		driver.findElement(E_mail).sendKeys(Email);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login_btn).click();
		sucessful_massage = driver.findElement(By.cssSelector("span.author__meta")) ;

	}

}
