package com.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Commands 
{
public void webelementCommand()
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement register_field=driver.findElement(By.className("ico-register"));
	register_field.click();
	
}
public void verifyUserInput()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement register_field=driver.findElement(By.className("ico-register"));
	register_field.click();
	WebElement gender=driver.findElement(By.id("gender-female"));
	gender.click();
	WebElement register_firstname= driver.findElement(By.id("FirstName"));
	 register_firstname.sendKeys("Manjima");
	WebElement register_lastname=driver.findElement(By.id("LastName"));
	register_lastname.sendKeys("Syam");
	WebElement register_email=driver.findElement(By.id("Email"));
	register_email.sendKeys("Manjima123@mail.com");
	WebElement reg_password=driver.findElement(By.id("Password"));
	reg_password.sendKeys("manjima123");
	WebElement reg_confpassword=driver.findElement(By.id("ConfirmPassword"));
	reg_confpassword.sendKeys("manjima123");
	WebElement register=driver.findElement(By.id("register-button"));
	register.click();
}
public void verifyIsSelected()
{
	boolean isbuttonselected;
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement reg_check=driver.findElement(By.id("gender-female"));
	 isbuttonselected=reg_check.isSelected();
	System.out.println("Gender element before selected " +isbuttonselected );
	reg_check.click();
     isbuttonselected=reg_check.isSelected();
    System.out.println("Gender element after selected " +isbuttonselected );
	
}
public void verifyIsEnabled()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement subscription=driver.findElement(By.id("newsletter-subscribe-button"));
	boolean issubscriptionenabled=subscription.isEnabled();
	System.out.println("Subscription is enabled  "+ issubscriptionenabled);
	
}
public void verifyIsDisplayed()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement vote=driver.findElement(By.id("vote-poll-1"));
	boolean isvotedisplayed=vote.isDisplayed();
	System.out.println("Vote is diplayed " + isvotedisplayed);
	
}	
public static void main(String[] args)
	{
		Commands obj=new Commands();
       // obj.webelementCommand();
        //obj.verifyUserInput();
		//obj.verifyIsSelected();
		//obj.verifyIsEnabled();	
		obj.verifyIsDisplayed();
	}
}
