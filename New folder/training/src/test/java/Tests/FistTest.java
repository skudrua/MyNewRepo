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
	LoginPage loginPage; //��������� ���������� ��� ������ ��������
	MainPage mainPage;
	
	
	@BeforeMethod
	public void beforeMethod(){
		
		driver = new FirefoxDriver();
		loginPage = new LoginPage(driver);  //��������� ���������� ��� ������ �������� � ������� ����� ��������
		mainPage = new MainPage(driver);
		
		driver.get("http://www.i.ua"); //��������� �� ������ ����
	}
		
	@AfterMethod
	public void afterMethod(){
		try{
			sleep(1000);
			}catch (InterruptedException e) {} // �������� 5 ���
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