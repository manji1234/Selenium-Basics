package com.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebLogin
{
	public void webElementCommand()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}
public void userInputCommand()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement login=driver.findElement(By.className("ico-login"));
	login.click();
	WebElement email=driver.findElement(By.name("Email"));
	email.sendKeys("manjima123@mail.com");
	WebElement password=driver.findElement(By.name("Password"));
	password.sendKeys("manjima123");
	WebElement login_reg=driver.findElement(By.xpath("//input[@value='Log in']"));
	login_reg.click();
	
}
	public static void main(String[] args)
	{
		DemoWebLogin obj=new DemoWebLogin();
		//obj.webElementCommand();
		obj.userInputCommand();

	}

}
