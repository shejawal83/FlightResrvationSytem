package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utility.commonutil;

public abstract class BaseTestClass {
	
	protected WebDriver driver;	
	protected commonutil comm=new commonutil();	
	@BeforeClass	
	public void beforeClass(){		
		
		driver=commonutil.getWebdriver();
		
		comm.stepInfo("opening the application." );
		driver.get("https://blazedemo.com/");	
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	}
	
	@AfterClass	
	public void afterClass(){		
	
		comm.stepInfo("Close the application." );
		driver.close();		
		
	}

}
