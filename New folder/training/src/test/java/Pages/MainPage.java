package Pages;

import static java.lang.Thread.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	WebDriver driver;
	
	public MainPage(WebDriver driver){
		this.driver = driver;
		
	}
	
	public void logout() {
		WebElement settings = driver.findElement(By.xpath("//span[@title='���������']")); // ������� ����� ������ ��������
		settings.click(); // ������� �� ������ � �����������
		
		WebElement exit_link = driver.findElement(By.xpath(".//div[@id='accountSettingsPopup']//a[text()='�����']")); // ����������� ������� ������ �� �����
		exit_link.click();  // ������� ������ �� ������
		

	}
	
	public void sendMail() {
		
		WebElement create_mail = driver.findElement(By.xpath(".//p[@class='make_message']/*[text()='������� ������']")); 
		create_mail.click(); 
		
		WebElement email_field = driver.findElement(By.xpath(".//textarea[@id='to']")); //���������� ������� ����� ������
		WebElement subject_field = driver.findElement(By.xpath("//input[@name='subject']"));  //�������������� ��� ����� �������� ������
		WebElement message_field = driver.findElement(By.xpath(".//textarea[@id='text']"));	//�������������� ��� ����� ��������� 
		WebElement sendButton = driver.findElement(By.xpath("//input[@type='submit' and @name='send']")); // �������������� ��� ������ ���������
		
		email_field.sendKeys("sfkudrua@ukr.net");  //��������� ���� � ����� 
		subject_field.sendKeys("test1");
      	message_field.sendKeys("test message");	
      	      
      	sendButton.click();
      	
    	/*try{
    		sleep(5000);
    		}catch (InterruptedException e) {} // �������� 5 ���
      	
      	WebElement successMessage = driver.findElement(By.xpath("//div[@class='block_confirmation']/div[@class='content clear']"));
      	//successMessage.getText();
      	Assert.assertEquals("������ ������� ���������� ���������", successMessage.getText());*/
	}
	
}
