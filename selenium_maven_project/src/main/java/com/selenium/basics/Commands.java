package com.selenium.basics;
import org.openqa.selenium.WebDriver;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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
public void displayAllDropDownList()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	WebElement dropdown=driver.findElement(By.xpath("//select[@name='country']"));
	Select select=new Select(dropdown);
	List<WebElement>listall=select.getOptions();
	System.out.println(listall.size());
	
}
public void verifyRightClick()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	Actions action=new Actions(driver);
	action.contextClick(rightclick).build().perform();
	
}
public void verifyDoubleClick()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement doubleclick=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
	Actions action=new Actions(driver);
	action.doubleClick(doubleclick).build().perform();
}
public void verifyMouseOver()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/menu/");
	WebElement mouseover=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
	Actions action=new Actions(driver);
	action.moveToElement(mouseover).build().perform();
}
public void verifyDragAndDrop()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/droppable");
	WebElement dragdrop=driver.findElement(By.id("draggable"));
	WebElement dropdrag=driver.findElement(By.id("droppable"));
	Actions action=new Actions(driver);
	action.dragAndDrop(dragdrop, dropdrag).build().perform();
	
}
public void dragAndDropUsingOffSet()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/dragabble");
	WebElement drag=driver.findElement(By.id("dragBox"));
	Actions action=new Actions(driver);
	action.dragAndDropBy(drag, 150, 100).build().perform();
}




public void verifyFileUploading()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/upload/");
	WebElement fileupload=driver.findElement(By.id("uploadfile_0"));
	fileupload.sendKeys("C:\\Users\\Lenovo\\git\\Selenium-Basics\\selenium_maven_project\\src\\main\\resources");
	WebElement clicktick=driver.findElement(By.id("terms"));
	clicktick.click();
	WebElement submitbutton=driver.findElement(By.name("send"));
	submitbutton.click();
	
}
public static void main(String[] args)
	{
		Commands obj=new Commands();
       // obj.webelementCommand();
        //obj.verifyUserInput();
		//obj.verifyIsSelected();
		//obj.verifyIsEnabled();	
		//obj.verifyIsDisplayed();
		//obj.displayAllDropDownList();
		//obj.verifyRightClick();
		//obj.verifyDoubleClick();
		//obj.verifyMouseOver();
		//obj.verifyDragAndDrop();
		//obj.dragAndDropUsingOffSet();
		obj.verifyFileUploading();
		
	}
}
