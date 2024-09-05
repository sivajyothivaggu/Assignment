package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils {
	
	public static WebDriver driver;

	public static void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void invokeApp() {
		driver.get("https://www.saucedemo.com/");
		
	}

	public static void killBrowser() {
		driver.quit();
		
	}

}
