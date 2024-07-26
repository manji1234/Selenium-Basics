package com.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Xpath_SwagLabDemo2
{
public void webElementCommand()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	WebElement user_name=driver.findElement(By.xpath("//input[@placeholder='Username']"));
	user_name.sendKeys("performance_glitch_user");
	WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
	password.sendKeys("secret_sauce");
	WebElement login=driver.findElement(By.xpath("//input[@data-test='login-button']"));
	login.click();
	
}
	public static void main(String[] args)
	{
		Xpath_SwagLabDemo2 obj=new Xpath_SwagLabDemo2();
		obj.webElementCommand();
	}

}
