package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightsPage {


	public  WebDriver driver ;

	By one_way =By.id("one-way") ;
	By Flight_Type =By.id("flight_type") ;

	By Flying_From = By.id("autocomplete") ; 
	By Flying_From_list = By.cssSelector("div.autocomplete-result") ;

	By Destination = By.id("autocomplete2") ;
	By Destination_list = By.cssSelector("div.autocomplete-result") ;
	By Departure_Date = By.id("departure") ;

	By  Passengers = By.cssSelector("a.dropdown-toggle.dropdown-btn.waves-effect")    ;
	By  Adults_Passengers = By.xpath("//*[@id=\"onereturn\"]/div[3]/div/div/div/div/div[1]/div/div/div[2]/i") ;
	By  Childs_Passengers = By.xpath("//*[@id=\"onereturn\"]/div[3]/div/div/div/div/div[2]/div/div/div[2]") ;
	By  infants_Passengers = By.xpath("//*[@id=\"onereturn\"]/div[3]/div/div/div/div/div[3]/div/div/div[2]");


	By	Search = By.id("flights-search") ;

	By BookNow_btn =By.cssSelector("span.btn.btn-primary") ;

	By sucess_massage = By.cssSelector("h2.sec__title.text-white.text-center") ;
	
	public String sucessful ;
	
	

	public FlightsPage( WebDriver driver )
	{
		this.driver =driver ;
	}

	public void revers_sucessfully(String text1 , String text2 ,String text3 ) throws InterruptedException
	{
		driver.findElement(one_way).click();
		Select selectOptions = new Select (driver.findElement(Flight_Type)) ;
		selectOptions.selectByIndex(2);


		driver.findElement(Flying_From).sendKeys(text1);
		driver.findElement(Flying_From_list).click();

		driver.findElement(Destination).sendKeys(text2);
		driver.findElement(Destination_list).click();
		WebElement  dep = driver.findElement(Departure_Date) ;
		dep.clear();
		dep.sendKeys(text3);


		driver.findElement(Passengers).click();

		driver.findElement(Adults_Passengers).click();
		driver.findElement(Childs_Passengers).click();
		driver.findElement(infants_Passengers).click();



		driver.findElement(Search).click();

		driver.findElement(BookNow_btn).click();
		
	    sucessful = driver.findElement(sucess_massage).getText() ;



	}




}
