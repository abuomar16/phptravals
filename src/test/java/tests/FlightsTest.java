package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import data.JsonReader;
import pages.DashBoard;
import pages.FlightsPage;
import pages.HomePage;
import pages.Loginpage;

public class FlightsTest extends BaseTests {

	JsonReader jsonObject ;
	HomePage homeOBbject ;
	Loginpage loginObject ;
	DashBoard DashObject ;
	FlightsPage FlightObject ;

	@Test
	public void Revers_flights_Sucessfuly () throws InterruptedException, FileNotFoundException, IOException, ParseException 
	{
		
		jsonObject = new JsonReader() ;
		jsonObject.jsonReader() ;

		
		homeOBbject = new HomePage(driver) ;
		homeOBbject.openLogin_Link();

		loginObject = new Loginpage(driver) ;
		loginObject.login( jsonObject.Email ,  jsonObject.password);
		
        

		DashObject = new DashBoard (driver) ;
		DashObject.Open_Flight_link();

		FlightObject = new FlightsPage(driver) ;
		FlightObject.revers_sucessfully(jsonObject.Flying_From,jsonObject.Destination ,jsonObject.Departure_Date );
		
		Assert.assertEquals("Flights Booking",FlightObject.sucessful) ;
	}
}
