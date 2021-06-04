package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.commonutil;

public class welcomePage {
	
	static WebDriver driver;
	private WebElement elementFrom,elementTo,elementWelComeTitle,elementfindFlight;
		
	public welcomePage()
	{				
		driver=commonutil.getWebdriver();
	}
	
	
	public WebElement getWelcomeElementTitle()
	{
		
		elementWelComeTitle=driver.findElement(By.xpath("//div//h1"));		
		return elementWelComeTitle;
		
	}
		
	public WebElement getDepartureDropDown()
	{
		
	    elementFrom=driver.findElement(By.xpath("//select[@name='fromPort']"));		
		return elementFrom;
		
	}
	
	public WebElement getDestinationDropDown()
	{
		
		elementTo=driver.findElement(By.xpath("//select[@name='toPort']"));		
		return elementTo;
		
	}
	
	public WebElement getFindFlighButton()
	{
		
		elementfindFlight=driver.findElement(By.xpath("//input[@value='Find Flights']"));		
		return elementfindFlight;
		
	}
	
	public void populateSourceDestinationCity(String departureCity,String destinationCity)
	{
		Select fromportDropdown=new Select(getDepartureDropDown());	
		fromportDropdown.selectByValue(departureCity);		
		
		Select toDropdown=new Select(getDestinationDropDown());	
		toDropdown.selectByValue(destinationCity);	
	}
	
	
	

}
