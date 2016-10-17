package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import static java.lang.Thread.sleep;





public class FistTest {
	
		
		@Test
	public void login_logout(){
		WebDriver driver = new FirefoxDriver(); //��������� selenium-driver ������� ����� �������� � ���������
		driver.get("http://www.i.ua"); //��������� �� ������ ����
		
		WebElement login_field = driver.findElement(By.xpath("//input[@name='login']")); //���������� ������� ���� ����� ������ � ������� ����� ����� ��������
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']")); //���������� ������� ���� ����� ������ � ������� ����� ����� ��������
		WebElement buttonLogin = driver.findElement(By.xpath("//input[@value='�����']")); // ���������� ������ �����
		
		login_field.sendKeys("test-test-test"); //������ �����
		password.sendKeys("123456qwe"); //������ ������
		buttonLogin.click(); //�������� �� ����� ������
		
		try{
			sleep(5000);
			}catch (InterruptedException e) {} // �������� 5 ���
		
		WebElement settings = driver.findElement(By.xpath("//span[@title='���������']")); // ������� ����� ������ ��������
		settings.click(); // ������� �� ������ � �����������
		
		WebElement exit_link = driver.findElement(By.xpath(".//div[@id='accountSettingsPopup']//a[text()='�����']")); // ����������� ������� ������ �� �����
		exit_link.click();  // ������� ������ �� ������
		
		
		driver.quit(); //��������� �������	
		
		
				
		
			}
	@Test
	public void login_send_message(){
		
		WebDriver driver = new FirefoxDriver(); //��������� selenium-driver ������� ����� �������� � ���������
		driver.get("http://www.i.ua"); //��������� �� ������ ����
		
		WebElement login_field = driver.findElement(By.xpath("//input[@name='login']")); //���������� ������� ���� ����� ������ � ������� ����� ����� ��������
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']")); //���������� ������� ���� ����� ������ � ������� ����� ����� ��������
		WebElement buttonLogin = driver.findElement(By.xpath("//input[@value='�����']")); // ���������� ������ �����
		
		login_field.sendKeys("test-test-test"); //������ �����
		password.sendKeys("123456qwe"); //������ ������
		buttonLogin.click(); //�������� �� ����� ������
		
		try{
			sleep(5000);
			}catch (InterruptedException e) {} // �������� 5 ���
		
		WebElement settings = driver.findElement(By.xpath("//span[@title='���������']")); // ������� ����� ������ ��������
		settings.click(); // ������� �� ������ � �����������
		
		WebElement create_mail = driver.findElement(By.xpath(".//p[@class='make_message']/*[text()='������� ������']")); // ���������� ������ �������� ������
		create_mail.click();  // ������� ������ �� ������
		
		WebElement email_field = driver.findElement(By.xpath(".//textarea[@id='to']")); //���������� ������� ����� ������
		WebElement subject_field = driver.findElement(By.xpath("//input[@name='subject']"));  //�������������� ��� ����� �������� ������
		WebElement message_field = driver.findElement(By.xpath(".//textarea[@id='text']"));	//�������������� ��� ����� ��������� 
		WebElement sendButton = driver.findElement(By.xpath("//input[@type='submit' and @name='send']")); // �������������� ��� ������ ���������
		
		email_field.sendKeys("sfkudrua@ukr.net");  //��������� ���� � ����� 
		subject_field.sendKeys("test1");
      	message_field.sendKeys("test message");	
      	sendButton.click();
		
      	driver.quit(); //����� �� ��������
	}

}
