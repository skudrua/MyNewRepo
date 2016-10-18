package Tests;

import static java.lang.Thread.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.*;





public class FistTest {
	
	WebDriver driver;
	LoginPage loginPage; //обьявляем переменные для каждой страницы
	MainPage mainPage;
	
	
	@BeforeMethod
	public void beforeMethod(){
		
		driver = new FirefoxDriver();
		loginPage = new LoginPage(driver);  //опрделяем переменные для каждой страницы с которой будем работать
		mainPage = new MainPage(driver);
		
		driver.get("http://www.i.ua"); //переходим на нужный сайт
	}
		
	@AfterMethod
	public void afterMethod(){
		try{
			sleep(1000);
			}catch (InterruptedException e) {} // ожидание 5 сек
		driver.quit();
		
	}
	
		@Test
	public void login_logout(){
				
		loginPage.login();
		mainPage.logout();	
		
	}
		
	@Test
	public void send_message(){
				
		loginPage.login();
		mainPage.sendMail();
		      	
	
	
	}
	
	
}