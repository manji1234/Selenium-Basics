package com.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathGuruDemo
{
	public void registerInfo()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement first_name=driver.findElement(By.name("firstName"));
		first_name.sendKeys("Manjima");
		WebElement last_name=driver.findElement(By.xpath("//input[@name='lastName']"));
		last_name.sendKeys("Syam");
		WebElement phn_no=driver.findElement(By.xpath("//input[contains(@name,'phone')]"));
		phn_no.sendKeys("9046349834");
		WebElement email=driver.findElement(By.xpath("//input[@id='userName']"));
		email.sendKeys("manjima02@gmail.com");
		WebElement address=driver.findElement(By.xpath("//input[contains(@name,'address1')]"));
		address.sendKeys("MH/112");
		WebElement city=driver.findElement(By.xpath("//input[starts-with(@name,'city')]"));
		city.sendKeys("tvm");
		WebElement state=driver.findElement(By.xpath("//input[starts-with(@name,'state')]"));
		state.sendKeys("Kerala");
		WebElement pincode=driver.findElement(By.xpath("//td[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='postalCode']"));
		pincode.sendKeys("23456");
		WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		country.sendKeys("ALBANIA");
		WebElement user_name=driver.findElement(By.xpath("//input[@name='email' or @id='email']"));
		user_name.sendKeys("Manjima02");
		WebElement password=driver.findElement(By.xpath("//input[@name='password' and @type='password']"));
		password.sendKeys("manjima02");
		WebElement con_password=driver.findElement(By.xpath("//input[starts-with(@name,'confirmPassword')]"));
		con_password.sendKeys("manjima02");
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit' or @src='images/submit.gif']"));
		submit.click();
		
	}

	public static void main(String[] args) 
	{
		XpathGuruDemo  obj=new  XpathGuruDemo ();
		    obj.registerInfo();
		 

	}

}
