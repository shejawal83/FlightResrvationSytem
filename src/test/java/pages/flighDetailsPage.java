package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.commonutil;

public class flighDetailsPage {
	
	static WebDriver driver;
	private WebElement elementFlightDetailPageTitle,firstFlightChooseButton;
		
	public flighDetailsPage()
	{				
		driver=commonutil.getWebdriver();
	}
	
	
	public WebElement getFlightDetalPageTitle()
	{
		
		elementFlightDetailPageTitle=driver.findElement(By.xpath("//div//h3"));		
		return elementFlightDetailPageTitle;
		
	}
	
	public WebElement getFirstFlightChooseButton()
	{
		
		firstFlightChooseButton=driver.findElement(By.xpath("//table[@class='table']/tbody//tr[1]/td[1]/input"));	
		return firstFlightChooseButton;
		
	}
	
	public WebElement getFirstFlightChooseButton(String flightNumber)
	{
		
		firstFlightChooseButton=driver.findElement(By.xpath("//table[@class='table']/tbody//tr["+ flightNumber+"]/td[1]/input"));	
		return firstFlightChooseButton;
		
	}
	
	

}
