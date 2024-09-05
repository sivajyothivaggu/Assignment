package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BrowserUtils.driver;

public class ElementUtils {

	public static WebElement element;

	public static boolean checkForVisibilty(By locator) throws Exception {
		boolean res = false;
		try {
			res = locateElement(locator).isDisplayed();
		} catch (Exception e) {
			System.out.println("Fail : elemnt not visbilie :" + locator);
		}
		return res;
	}

	private static WebElement locateElement(By locator) throws Exception {
		for (int i = 0; i < 10; i++) {
			try {
				element = driver.findElement(locator);
				break;
			} catch (Exception e) {
				Thread.sleep(1000);
			}
		}
		return element;
	}

	public static void CutomClick(By locator) throws Exception {
		locateElement(locator).click();		
	}
	
	public static void CutomType(By locator,String value) throws Exception {
		locateElement(locator).sendKeys(value);	
	}

}
