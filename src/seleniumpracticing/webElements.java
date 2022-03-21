package seleniumpracticing;

import org.openqa.selenium.By;

public class webElements {
	
	static String LoginButtonHomePage = "//a[contains(text(),'Log in')]";
	static String EmailID = "//input[@id='login-email']";
	static String LoginButton = "//button[@id='login-submit']";
	static String Password = "//input[@id='password-login']";
	static String Submit = "//button[@id='login-submit-password']";
	static String ProfileIcon = "//div[@class='ProfileButton-avatar']/div/span/span";
	
	static By loginbuttonHomePage = new By.ByXPath(LoginButtonHomePage);
	static By emialid = new By.ByXPath(EmailID);
	static By loginbutton = new By.ByXPath(LoginButton);
	static By password = new By.ByXPath(Password);
	static By submit = new By.ByXPath(Submit);
	static By profileicon = new By.ByXPath(ProfileIcon);
}
