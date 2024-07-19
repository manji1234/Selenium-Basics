package com.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserLaunch 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/");
		String title=driver.getTitle();
		System.out.println("Title is "+ title);
		 String currenturl=driver.getCurrentUrl();
		 System.out.println("Current URL is " + currenturl);
		String handleid= driver.getWindowHandle();
		System.out.println("Handle id is " + handleid);
		 String pagesource= driver.getPageSource();
		 System.out.println("Page source is " + pagesource);
		 //driver.close();
		
		

	}

}
