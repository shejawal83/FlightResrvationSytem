package common;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListner extends BaseTestClass implements ITestListener  {
	
	public void onTestFailure(ITestResult Result) 					
    {		
    System.out.println("The name of the testcase failed is :"+Result.getName());
    TakesScreenshot failureScreenShot =((TakesScreenshot) driver );
    File failureScreenShotFile=failureScreenShot.getScreenshotAs(OutputType.FILE);
    File reportFailureFile=new File("C:\\workspace\\FlightResrvationSytem\\src\\test\\java\\report\\" + Result.getName()+ ".png");
    try {
		FileUtils.copyFile(failureScreenShotFile, reportFailureFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    }	

}
