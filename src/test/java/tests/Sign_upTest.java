
package tests;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import data.JsonReader;
import pages.HomePage;
import pages.SignUPpage;

public class Sign_upTest  extends BaseTests {

	JsonReader jsonObject ;
	HomePage homeOBbject ;
	SignUPpage SignObject ;


	@Test
	public void SignUpSucessfuly () throws InterruptedException, FileNotFoundException, IOException, ParseException 
	{

		jsonObject = new JsonReader() ;
		jsonObject.jsonReader() ;
		
		homeOBbject = new HomePage(driver) ;
		homeOBbject.openSign_up_Link();


		SignObject = new SignUPpage(driver) ;
		SignObject.Signup(jsonObject.fName, jsonObject.lName,jsonObject.phone, jsonObject.Email,jsonObject.password, jsonObject.Account_Type);


	}
}



