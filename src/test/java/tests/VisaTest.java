package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DashBoard;
import pages.VisaPage;

public class VisaTest  extends BaseTests  {

	DashBoard DashObject ;
	VisaPage visaObject ;
	
	
	@Test
	public void apply_visa_sucessfully() throws InterruptedException
	{
	
		DashObject = new DashBoard(driver) ;
		DashObject.Open_visa_link();
		
		visaObject = new VisaPage(driver) ;
		visaObject.visa_apply("Egypt", "Canada" ,"mooo" ,"Ahmed" ,"mohamed00105@gmail.com" ,"01150439940","20-10-2022" ,"i love Automation");
		
		Assert.assertTrue( visaObject.sucessful_massage.getText().contains("Your visa form has been submitted"));
		
		
	}
}
