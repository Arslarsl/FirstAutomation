package com.emerald.project;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Browser_Lunch {

	public static WebDriver driver;
	static String Chromebrowserpath = System.getProperty("user.dir") + "\\driver\\chromedriver.exe";
	static String firefoxbrowserpath = System.getProperty("user.dir") + "\\driver\\geckodriver.exe";

	@BeforeTest
	@Parameters("browser")
	public static WebDriver startBrowser(String browser) throws Exception {
		System.out.println("Initilized Browser is : " + browser);

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.silentOutput", "true");
			System.setProperty("webdriver.chrome.driver", Chromebrowserpath);
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", firefoxbrowserpath);
			driver = new FirefoxDriver();
		}

		else {
			// If no browser passed throw exception
			throw new Exception("browser is not found");
		}
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;

	}

	@AfterTest
	public void afterMethod() {
		// driver.quit();
	}

}
