package com.google.selenuim.test;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverDemo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\ahmedhussienalwany.a\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.navigate().to("http://www.google.com");	

	}

}
