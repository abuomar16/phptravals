package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import data.JsonReader;
import pages.DashBoard;
import pages.HotelsPage;

public class HotelsTest extends BaseTests {
	
	JsonReader jsonObject ;
	DashBoard DashObject ;
	HotelsPage HotelsObject ;
	
	@Test
	public void revers_hotel_sucessfully() throws InterruptedException, FileNotFoundException, IOException, ParseException
	{
		
		jsonObject = new JsonReader() ;
		jsonObject.jsonReader() ;
		
		DashObject = new DashBoard(driver) ;
		DashObject.Open_hotels_link();
		
		HotelsObject = new HotelsPage(driver) ;
		HotelsObject.revers_hotel(jsonObject.City_Name);
	}

}
