package Pages;

import static java.lang.Thread.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver =driver; //����������� ������ - ����� � ���� �� ������ ��� � ��� �����. ����������� ������� ���, ��� �������� ������ ������� �����
	}

	@FindBy(xpath ="//input[@name='login']") @CacheLookup public WebElement login_field;
	@FindBy(xpath ="//input[@name='pass']") @CacheLookup public WebElement password;
	@FindBy(xpath ="//input[@value='�����']") @CacheLookup public WebElement buttonLogin;

public void login(){
	/*WebElement login_field = driver.findElement(By.xpath("//input[@name='login']")); //���������� ������� ���� ����� ������ � ������� ����� ����� ��������
	WebElement password = driver.findElement(By.xpath("//input[@name='pass']")); //���������� ������� ���� ����� ������ � ������� ����� ����� ��������
	WebElement buttonLogin = driver.findElement(By.xpath("//input[@value='�����']")); // ���������� ������ �����*/
	
	login_field.sendKeys("test-test-test"); //������ �����
	password.sendKeys("123456qwe"); //������ ������
	buttonLogin.click(); //�������� �� ����� ������
	
	try{
		sleep(5000);
		}catch (InterruptedException e) {} // �������� 5 ���
	
}
}
