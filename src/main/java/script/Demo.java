package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo{
	
	
	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://blazedemo.com/");		
		WebElement elementFrom=driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select fromportDropdown=new Select(elementFrom);
		fromportDropdown.selectByValue("Boston");
		WebElement elementTo=driver.findElement(By.xpath("//select[@name='toPort']"));
		Select toDropdown=new Select(elementTo);
		toDropdown.selectByValue("New York");		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		driver.findElement(By.xpath("//table[@class='table']/tbody//tr[1]/td[1]/input")).click();
		
		driver.findElement(By.xpath("//div/input[@name='inputName']")).sendKeys("name");
		driver.findElement(By.xpath("//div/input[@name='address']")).sendKeys("address");
		driver.findElement(By.xpath("//div/input[@name='city']")).sendKeys("city");
		driver.findElement(By.xpath("//div/input[@name='state']")).sendKeys("state");
		driver.findElement(By.xpath("//div/input[@name='zipCode']")).sendKeys("321456");
		
		WebElement elementcardType=driver.findElement(By.xpath("//select[@name='cardType']"));
		Select cardType=new Select(elementcardType);
		cardType.selectByValue("dinersclub");	
		//cardType.selectByIndex(1);
		
		driver.findElement(By.xpath("//div/input[@name='creditCardNumber']")).sendKeys("12345678");
		driver.findElement(By.xpath("//div/input[@name='creditCardMonth']")).sendKeys("12");
		driver.findElement(By.xpath("//div/input[@name='creditCardYear']")).sendKeys("2020");
		driver.findElement(By.xpath("//div/input[@name='nameOnCard']")).sendKeys("SSS");
		driver.findElement(By.xpath("//div//input[@name='rememberMe']")).click();
		driver.findElement(By.xpath("//div//input[@value='Purchase Flight']")).click();
		
		String confirmationID=driver.findElement(By.xpath("//table[@class='table']/tbody//tr[1]/td[2]")).getText();
		
		boolean flighbooked=confirmationID.isEmpty()?false:true;
		
		if (flighbooked)	
		
			Assert.assertTrue(flighbooked, "Flight not confirmed sucessfully");
	
		
	}
}