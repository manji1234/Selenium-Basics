package testNGcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation.Base;

public class Commands extends Base
{ 
	@Test
	
public void verifyUserLogin()
{
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
	@Test
	public void verifyRegistration()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement register_field=driver.findElement(By.className("ico-register"));
		register_field.click();
		WebElement gender=driver.findElement(By.id("gender-female"));
		gender.click();
		WebElement register_firstname= driver.findElement(By.id("FirstName"));
		 register_firstname.sendKeys("keshu");
		WebElement register_lastname=driver.findElement(By.id("LastName"));
		register_lastname.sendKeys("Syam");
		WebElement register_email=driver.findElement(By.id("Email"));
		register_email.sendKeys("Manjimakeshu1234@mail.com");
		WebElement reg_password=driver.findElement(By.id("Password"));
		reg_password.sendKeys("manjima1234567");
		WebElement reg_confpassword=driver.findElement(By.id("ConfirmPassword"));
		reg_confpassword.sendKeys("manjima1234567");
		WebElement register=driver.findElement(By.id("register-button"));
		register.click();
		WebElement success=driver.findElement(By.xpath("//div[@class='result']"));
		String actualresult=success.getText();
		String expectedresult="Your registration completed";
		Assert.assertEquals(actualresult, expectedresult,"resistration not success");
	}
	@Test
	public void verifyTitle()
	{
		driver.get("https://demowebshop.tricentis.com/");
		String title=driver.getTitle();
		//System.out.println("The ttitle is " +title );   //normal method
		String expectedresult="Demo Web Shop";
		Assert.assertEquals(title, expectedresult,"Invalid title");
	}
	@Test
	public void verifyIsSelected()
	{
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement reg_check=driver.findElement(By.id("gender-female"));
		boolean beforeisbuttonselected=reg_check.isSelected();
		//System.out.println("Gender element before selected " +beforeisbuttonselected );
		Assert.assertFalse(beforeisbuttonselected, "Button is not selected");
		reg_check.click();
	    boolean afterisbuttonselected=reg_check.isSelected();
	   // System.out.println("Gender element after selected " +afterisbuttonselected );
	    Assert.assertTrue(afterisbuttonselected,"Button is Selected");
		
	}
	@Test
	public void verifyIsEnabled()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement subscription=driver.findElement(By.id("newsletter-subscribe-button"));
		boolean issubscriptionenabled=subscription.isEnabled();
		//System.out.println("Subscription is enabled  "+ issubscriptionenabled);
		Assert.assertTrue(issubscriptionenabled,"Subscription is enabled");
	}
	@Test
	public void verifyIsDisplayed()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement vote=driver.findElement(By.id("vote-poll-1"));
		boolean isvotedisplayed=vote.isDisplayed();
		//System.out.println("Vote is diplayed " + isvotedisplayed);
		Assert.assertTrue(isvotedisplayed,"Vote is displayed");
	}
}