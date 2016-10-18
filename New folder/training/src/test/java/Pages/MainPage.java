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
		WebElement settings = driver.findElement(By.xpath("//span[@title='Настройки']")); // создаем обект кнопки настроек
		settings.click(); // кликаем на кнопку с настройками
		
		WebElement exit_link = driver.findElement(By.xpath(".//div[@id='accountSettingsPopup']//a[text()='Выйти']")); // определояем ссылкку выхода из сайта
		exit_link.click();  // выходим кликая на ссылку
		

	}
	
	public void sendMail() {
		
		WebElement create_mail = driver.findElement(By.xpath(".//p[@class='make_message']/*[text()='Создать письмо']")); 
		create_mail.click(); 
		
		WebElement email_field = driver.findElement(By.xpath(".//textarea[@id='to']")); //определяем поледля ввода емайла
		WebElement subject_field = driver.findElement(By.xpath("//input[@name='subject']"));  //определяемполе для ввода название письма
		WebElement message_field = driver.findElement(By.xpath(".//textarea[@id='text']"));	//определяемполе для ввода сообщения 
		WebElement sendButton = driver.findElement(By.xpath("//input[@type='submit' and @name='send']")); // определяемполе для кнопки Отправить
		
		email_field.sendKeys("sfkudrua@ukr.net");  //заполняем поле с мылом 
		subject_field.sendKeys("test1");
      	message_field.sendKeys("test message");	
      	      
      	sendButton.click();
      	
    	/*try{
    		sleep(5000);
    		}catch (InterruptedException e) {} // ожидание 5 сек
      	
      	WebElement successMessage = driver.findElement(By.xpath("//div[@class='block_confirmation']/div[@class='content clear']"));
      	//successMessage.getText();
      	Assert.assertEquals("Письмо успешно отправлено адресатам", successMessage.getText());*/
	}
	
}
