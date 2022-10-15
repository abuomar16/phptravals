package data;
import java.io.File ;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {
	
	public String fName ,lName ,phone ,Email  ,password ,
                  Flying_From , Destination , Departure_Date ,
                  City_Name ,Account_Type  ;
	

	
	public void jsonReader() throws FileNotFoundException, IOException, ParseException
	{
		
		String path_json  =System.getProperty("user.dir")+ "/src/test/java/data/userdata.json" ;
		
		File source_file = new File(path_json) ;
		
		JSONParser parser = new JSONParser();
		
		JSONArray   arr = (JSONArray)parser.parse(new FileReader(source_file)) ;
		
	
		for(Object jsonOb  :arr)
		{
			
			JSONObject person = (JSONObject) jsonOb ;
			
			fName = (String) person.get("fName") ;
			lName = (String) person.get("lName") ;
			
			phone = (String) person.get("phone") ;
			Email = (String) person.get("Email") ;
			Account_Type = (String) person.get("Account_Type") ;
			password = (String) person.get("password") ;
			
			
			Flying_From = (String) person.get("Flying_From") ;
			Destination = (String) person.get("Destination") ;
			Departure_Date = (String) person.get("Departure_Date") ;
			
			City_Name = (String) person.get("City_Name") ;
			
		}
		
		
		
		
		
		
	}
	

}
