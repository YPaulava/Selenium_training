package com.qa.training.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_1 {

	//private static String[] args;

	public static void main(String[] args) {
		// TC_1.args = args;
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.get("http://yahoo.com");
		driver.navigate().back();
		driver.close();
		
		 
	}

}
