package com.magento.baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.magento.utils.ConfigReader;
import com.magento.utils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	public static void intailizeBrowser(String browserName) {
		ConfigReader.readProperties(Constants.CONFIGS_FILEPATH);
		switch (browserName) {

		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.err.println("Browser is not supported");
		}
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get(ConfigReader.getProperty("URL"));
		PageInitializer.intailizepage();
	}

	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
