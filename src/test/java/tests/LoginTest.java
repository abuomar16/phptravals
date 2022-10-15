package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import data.JsonReader;
import pages.HomePage;
import pages.Loginpage;

public class LoginTest extends BaseTests {

	JsonReader jsonObject ;
	HomePage homeOBbject ;
	Loginpage loginObject ;
	

	@Test
	public void loginSucessfuly () throws InterruptedException, FileNotFoundException, IOException, ParseException 
	{
		
		jsonObject = new JsonReader() ;
		jsonObject.jsonReader() ;

		homeOBbject = new HomePage(driver) ;
		homeOBbject.openLogin_Link();


		loginObject = new Loginpage(driver) ;
		loginObject.login(jsonObject.Email ,  jsonObject.password);

		Assert.assertTrue(loginObject.sucessful_massage.getText().contains("Welcome Back"));

	}


}
