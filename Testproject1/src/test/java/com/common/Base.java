package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
    public WebDriver getdriver() {
    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com");
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    return driver;
    
    }

}
