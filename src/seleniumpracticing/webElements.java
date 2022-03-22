package seleniumpracticing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class webElements {
	
	static String LoginButtonHomePage = "//a[contains(text(),'Log in')]";
	static String EmailID = "//input[@id='login-email']";
	static String LoginButton = "//button[@id='login-submit']";
	static String Password = "//input[@id='password-login']";
	static String Submit = "//button[@id='login-submit-password']";
	static String ProfileIcon = "//div[@class='ProfileButton-avatar']/div/span/span";
	
	By loginbuttonHomePage = new By.ByXPath(LoginButtonHomePage);
	 By emialid = new By.ByXPath(EmailID);
	 By loginbutton = new By.ByXPath(LoginButton);
	 By password = new By.ByXPath(Password);
	 By submit = new By.ByXPath(Submit);
	 By profileicon = new By.ByXPath(ProfileIcon);



	 
}