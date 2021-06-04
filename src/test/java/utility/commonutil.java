package utility;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class commonutil {
	//private static final Logger logger = LogManager.getLogger(commonutil.class);
	
	static WebDriver driver;
	
	public commonutil()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\FlightResrvationSytem\\src\\test\\java\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	
	
	public static WebDriver getWebdriver()
	{
			
		return driver;
		
	}
	
	public void stepInfo(String message)
	{
			
		System.out.println(message);
		
	}

}
