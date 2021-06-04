package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.commonutil;

public class confirmationPage {
	
	static WebDriver driver;
	private WebElement elementConfirmationSuccessTitle,elementConfirmationId;
		
	public confirmationPage()
	{				
		driver=commonutil.getWebdriver();
	}
	
	
	public WebElement getConfirmationSuccessTitle()
	{
		
		elementConfirmationSuccessTitle=driver.findElement(By.xpath("//div//h1"));		
		return elementConfirmationSuccessTitle;
		
	}
		
	public WebElement getConfirmationID()
	{
		
	    elementConfirmationId=driver.findElement(By.xpath("//table[@class='table']/tbody//tr[1]/td[2]"));		
		return elementConfirmationId;
		
	}
		
	

}
