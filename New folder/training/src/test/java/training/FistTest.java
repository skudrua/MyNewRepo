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
		WebDriver driver = new FirefoxDriver(); //Запускаем selenium-driver который будет работать с браузером
		driver.get("http://www.i.ua"); //переходим на нужный сайт
		
		WebElement login_field = driver.findElement(By.xpath("//input[@name='login']")); //определяем элемент поле ввода логина с которым потом будем работать
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']")); //определяем элемент поле ввода пароля с которым потом будем работать
		WebElement buttonLogin = driver.findElement(By.xpath("//input[@value='Войти']")); // определили кнопку Войти
		
		login_field.sendKeys("test-test-test"); //вводим логин
		password.sendKeys("123456qwe"); //вводим пароль
		buttonLogin.click(); //нажимаем на Войти кнопку
		
		try{
			sleep(5000);
			}catch (InterruptedException e) {} // ожидание 5 сек
		
		WebElement settings = driver.findElement(By.xpath("//span[@title='Настройки']")); // создаем обект кнопки настроек
		settings.click(); // кликаем на кнопку с настройками
		
		WebElement exit_link = driver.findElement(By.xpath(".//div[@id='accountSettingsPopup']//a[text()='Выйти']")); // определояем ссылкку выхода из сайта
		exit_link.click();  // выходим кликая на ссылку
		
		
		driver.quit(); //закрываем браузер	
		
		
				
		
			}
	@Test
	public void login_send_message(){
		
		WebDriver driver = new FirefoxDriver(); //Запускаем selenium-driver который будет работать с браузером
		driver.get("http://www.i.ua"); //переходим на нужный сайт
		
		WebElement login_field = driver.findElement(By.xpath("//input[@name='login']")); //определяем элемент поле ввода логина с которым потом будем работать
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']")); //определяем элемент поле ввода пароля с которым потом будем работать
		WebElement buttonLogin = driver.findElement(By.xpath("//input[@value='Войти']")); // определили кнопку Войти
		
		login_field.sendKeys("test-test-test"); //вводим логин
		password.sendKeys("123456qwe"); //вводим пароль
		buttonLogin.click(); //нажимаем на Войти кнопку
		
		try{
			sleep(5000);
			}catch (InterruptedException e) {} // ожидание 5 сек
		
		WebElement settings = driver.findElement(By.xpath("//span[@title='Настройки']")); // создаем обект кнопки настроек
		settings.click(); // кликаем на кнопку с настройками
		
		WebElement create_mail = driver.findElement(By.xpath(".//p[@class='make_message']/*[text()='Создать письмо']")); // определяем ссылку создания письма
		create_mail.click();  // выходим кликая на ссылку
		
		WebElement email_field = driver.findElement(By.xpath(".//textarea[@id='to']")); //определяем поледля ввода емайла
		WebElement subject_field = driver.findElement(By.xpath("//input[@name='subject']"));  //определяемполе для ввода название письма
		WebElement message_field = driver.findElement(By.xpath(".//textarea[@id='text']"));	//определяемполе для ввода сообщения 
		WebElement sendButton = driver.findElement(By.xpath("//input[@type='submit' and @name='send']")); // определяемполе для кнопки Отправить
		
		email_field.sendKeys("sfkudrua@ukr.net");  //заполняем поле с мылом 
		subject_field.sendKeys("test1");
      	message_field.sendKeys("test message");	
      	sendButton.click();
		
      	driver.quit(); //выход из браузера
	}

}
