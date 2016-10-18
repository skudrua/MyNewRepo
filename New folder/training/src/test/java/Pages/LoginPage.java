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
		this.driver =driver; //конструктор класса - метод с тким же именем как и сам класс. Выполняется какждый раз, при создании нового обьекта класс
	}

	@FindBy(xpath ="//input[@name='login']") @CacheLookup public WebElement login_field;
	@FindBy(xpath ="//input[@name='pass']") @CacheLookup public WebElement password;
	@FindBy(xpath ="//input[@value='Войти']") @CacheLookup public WebElement buttonLogin;

public void login(){
	/*WebElement login_field = driver.findElement(By.xpath("//input[@name='login']")); //определяем элемент поле ввода логина с которым потом будем работать
	WebElement password = driver.findElement(By.xpath("//input[@name='pass']")); //определяем элемент поле ввода пароля с которым потом будем работать
	WebElement buttonLogin = driver.findElement(By.xpath("//input[@value='Войти']")); // определили кнопку Войти*/
	
	login_field.sendKeys("test-test-test"); //вводим логин
	password.sendKeys("123456qwe"); //вводим пароль
	buttonLogin.click(); //нажимаем на Войти кнопку
	
	try{
		sleep(5000);
		}catch (InterruptedException e) {} // ожидание 5 сек
	
}
}
