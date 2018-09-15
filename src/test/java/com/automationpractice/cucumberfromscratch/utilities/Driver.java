package com.automationpractice.cucumberfromscratch.utilities;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	private Driver() {

	}

	private static WebDriver driver;
	
	
	public static WebDriver getGridDriver() throws MalformedURLException {
		
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setPlatform(Platform.ANY);
		
		driver = new RemoteWebDriver(new URL("http://172.16.12.129/:4444/wd/hub"), caps);
			
		return driver;
	
	}
	
	

	public static WebDriver getDriver() {
		if (driver == null) {
			switch (ConfigurationReader.getProperty("browser")) {
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "ie":
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				break;
			case "safari":
				driver = new SafariDriver();
				break;

			}
		}
		return driver;
	}

	
	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
	

}
