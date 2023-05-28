package BestBuyBase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import BestBuyUtils.Utils;

public class BaseClass extends Utils{
	
	@BeforeMethod
	public void start() {
		
		browserLaunch(getProperties("browser"));
		launchUrl(getProperties("url"));
			
	}
	
	@AfterMethod
	public void close() {
		
		//driver.close();
		
	}
}
