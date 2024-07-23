package com.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLogin
{
public void webElementCommand()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
}
public void UserInputCommand()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	WebElement user_name=driver.findElement(By.name("user-name"));
	user_name.sendKeys("problem_user");
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("secret_sauce");
	WebElement login=driver.findElement(By.name("login-button"));
	login.click();
	
}
	public static void main(String[] args) 
	{
		SwagLogin obj=new SwagLogin();
		//obj.webElementCommand();
		obj.UserInputCommand();
	}

}
