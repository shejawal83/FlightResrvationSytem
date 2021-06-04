package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import common.PopulatePassengerDetails;
import utility.commonutil;

public class fillPassengerDetails implements PopulatePassengerDetails{
	
	static WebDriver driver;
	private WebElement pageTitle,firstFlightChooseButton,elementNameInput,elementAddressInput,elementStateInput,elementCityInput,elementZipcodeInput,elementCardTypeDropDown,elementcreditCardNumberInput,elementcreditCardMonthInput,elementcreditCardYearInput,elementnameOnCardInput,elementrememberMeCheckBox,elementPurchaseFlightButton;
		
	public fillPassengerDetails()
	{				
		driver=commonutil.getWebdriver();
	}
	
	
	public WebElement getFlightDetalPageTitle()
	{
		
		pageTitle=driver.findElement(By.xpath("//div/h2"));		
		return pageTitle;
		
	}
	
	public WebElement getFirstFlightChooseButton()
	{
		
		firstFlightChooseButton=driver.findElement(By.xpath("//table[@class='table']/tbody//tr[1]/td[1]/input"));	
		return firstFlightChooseButton;
		
	}
	
	public WebElement getNameInputBox()
	{
		
		elementNameInput=driver.findElement(By.xpath("//div/input[@name='inputName']"));
		return elementNameInput;
		
	}
	
	public WebElement getAdressInputBox()
	{
		
		elementAddressInput=driver.findElement(By.xpath("//div/input[@name='address']"));
		return elementAddressInput;
		
	}
	
	public WebElement getStateInputBox()
	{
		
		elementStateInput=driver.findElement(By.xpath("//div/input[@name='state']"));
		return elementStateInput;
		
	}
	
	public WebElement getCityInputBox()
	{
		
		elementCityInput=driver.findElement(By.xpath("//div/input[@name='city']"));
		return elementCityInput;
		
	}
	
	public WebElement getZipcodeInputBox()
	{
		
		elementZipcodeInput=driver.findElement(By.xpath("//div/input[@name='zipCode']"));
		return elementZipcodeInput;
		
	}
	
	public WebElement getCardTypeDropDown()
	{
		
		elementCardTypeDropDown=driver.findElement(By.xpath("//select[@name='cardType']"));
		return elementCardTypeDropDown;
		
	}
	
	public WebElement getcreditCardNumberInputBox()
	{
		
		elementcreditCardNumberInput=driver.findElement(By.xpath("//div/input[@name='creditCardNumber']"));
		return elementcreditCardNumberInput;
		
	}
	
	public WebElement getcreditCardMonthInputBox()
	{
		
		elementcreditCardMonthInput=driver.findElement(By.xpath("//div/input[@name='creditCardMonth']"));
		return elementcreditCardMonthInput;
		
	}
	
	public WebElement getcreditCardYearInputBox()
	{
		
		elementcreditCardYearInput=driver.findElement(By.xpath("//div/input[@name='creditCardYear']"));
		return elementcreditCardYearInput;
		
	}
	
	public WebElement getnameOnCardInputBox()
	{
		
		elementnameOnCardInput=driver.findElement(By.xpath("//div/input[@name='nameOnCard']"));
		return elementnameOnCardInput;
		
	}
	
	public WebElement getrememberMeChecktBox()
	{
		
		elementrememberMeCheckBox=driver.findElement(By.xpath("//div//input[@name='rememberMe']"));
		return elementrememberMeCheckBox;
		
	}
	
	public WebElement getPurchaseFlightButton()
	{
		
		elementPurchaseFlightButton=driver.findElement(By.xpath("//div//input[@value='Purchase Flight']"));
		return elementPurchaseFlightButton;
		
	}
	
	public void populatePassengerDetails(String... passengerDetails)
	{
		
		getNameInputBox().sendKeys(passengerDetails[0]);
		getAdressInputBox().sendKeys(passengerDetails[1]);
		getCityInputBox().sendKeys(passengerDetails[2]);
		getStateInputBox().sendKeys(passengerDetails[3]);
		getZipcodeInputBox().sendKeys(passengerDetails[4]);	
		
	}
	
	public void populateCreditCardDetails(String... creditCardDetails)
	{
		
		Select cardType=new Select(getCardTypeDropDown());
		cardType.selectByValue(creditCardDetails[0]);	
		
		getcreditCardNumberInputBox().sendKeys(creditCardDetails[1]);
		getcreditCardMonthInputBox().sendKeys(creditCardDetails[2]);
		getcreditCardYearInputBox().sendKeys(creditCardDetails[3]);
		getnameOnCardInputBox().sendKeys(creditCardDetails[4]);
	}
	
	
	
}
