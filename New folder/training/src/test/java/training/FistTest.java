package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FistTest {
	
	WebDriver driver;
	
	@BeforeClass // all action will be performed before all tests 
	public void precondition(){
		 driver = new FirefoxDriver();
			
	}
	
	@AfterClass
	public void poscondition(){
		driver.quit();
			
	}
	
	@BeforeMethod
	public void before(){
		driver.manage().deleteAllCookies();
		driver.get("https://twitter.com/");
	}
	
	
		@Test
	public void loginTest(){
		
				
		WebElement loginInput = driver.findElement(By.xpath(".//*[@id='signin-email']"));
		loginInput.sendKeys("sfkudrua@ukr.net");
		
		WebElement passwordInput = driver.findElement(By.xpath(".//*[@id='signin-password']"));
		passwordInput.sendKeys("skudrua1984");
		
		WebElement loginButton = driver.findElement(By.xpath(".//*[@id='front-container']/div[2]/div[2]/form/table/tbody/tr/td[2]/button"));
		loginButton.click();
		
		WebElement userIcon = driver.findElement(By.id("user-dropdown-toggle"));
		Assert.assertTrue(userIcon.isDisplayed());
			}
	@Test
	public void invalidLoginTest(){
		
		WebElement loginInput = driver.findElement(By.xpath(".//*[@id='signin-email']"));
		loginInput.sendKeys("sfkudrua@ukr.net");
		
		WebElement passwordInput = driver.findElement(By.xpath(".//*[@id='signin-password']"));
		passwordInput.sendKeys("skudrua1984d");
		
		WebElement loginButton = driver.findElement(By.xpath(".//*[@id='front-container']/div[2]/div[2]/form/table/tbody/tr/td[2]/button"));
		loginButton.click();
		
		WebElement userIcon = driver.findElement(By.xpath(".//*[@id='user-dropdown-toggle']"));
		Assert.assertFalse(userIcon.isDisplayed());
		
		
	}

}
