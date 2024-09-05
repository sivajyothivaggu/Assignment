package pages;

import org.openqa.selenium.By;

import utils.ElementUtils;

public class LoginPage {

	By txt_products = By.xpath("//span[text()='Products']");
	By edit_username = By.id("user-name");
	By edit_pswd = By.id("password");
	By btn_login = By.id("login-button");
	By txt_swagLabs = By.xpath("//div[text()='Swag Labs']");

	public void verifyLoginPage() throws Exception {
		if (ElementUtils.checkForVisibilty(txt_swagLabs)) {
			System.out.println("Pass: User in in login page of app");
		} else {
			System.out.println("Fail: User not in login page of app");
		}
	}

	public void performLogin() throws Exception {
		enterUserid();
		enterPswd();
		clickSubmit();
	}

	private void clickSubmit() throws Exception {
		ElementUtils.CutomClick(btn_login);
	}

	private void enterPswd() throws Exception {
		ElementUtils.CutomType(edit_pswd, "secret_sauce");
	}

	private void enterUserid() throws Exception {
		ElementUtils.CutomType(edit_username, "standard_user");

	}

}

