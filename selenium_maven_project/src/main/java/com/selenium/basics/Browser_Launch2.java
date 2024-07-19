package com.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Browser_Launch2 
{

	public static void main(String[] args)
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com/");
		String title=driver.getTitle();
		System.out.println("Title is " + title);
		String currenturl=driver.getCurrentUrl();
		System.out.println("Current url is " + currenturl);
		String handleid= driver.getWindowHandle();
		System.out.println("Handle id is " + handleid);
		String source=driver.getPageSource();
		System.out.println("Source code is " + source);
		//driver.close();
		
		
		
	}

}
