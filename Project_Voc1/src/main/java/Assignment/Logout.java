package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
driver.get("https://www.saucedemo.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
driver.findElement(By.xpath("//input[@id='login-button']")).click();
driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
Thread.sleep(3000);
driver.findElement(By.linkText("Logout")).click();

}}
