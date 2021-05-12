package com.google.selenuim.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG2 {
	
	@BeforeTest
	public void before() {
		System.out.println("before test");

	}
	
	@Test
	public void open() {
		String path="C:\\Users\\ahmedhussienalwany.a\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.navigate().to("http://www.google.com");	
	}
	@Test
	private void second() {
		System.out.println("second");

	}
	@Test
	private void third() {
		System.out.println("second");

	}
	@AfterTest
	public void after() {
		System.out.println("after the test");

	}

}
