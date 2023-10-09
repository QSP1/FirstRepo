package testCases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc6 {
	
	@Test
	public void m6()
	{
		Reporter.log("M6 Running");
		Reporter.log("M6 Sleeping");
		//
		Reporter.log("M7 Running");
		Reporter.log("M8 Sleeping");
		
	}
	

}
