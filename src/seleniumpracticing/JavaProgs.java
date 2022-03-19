package seleniumpracticing;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaProgs {
	static WebDriver driver;

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","c:\\new folder\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.box.com/home");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("kalyan89p@gmail.com");
		driver.findElement(By.xpath("//button[@id='login-submit']")).click();
		driver.findElement(By.xpath("//input[@id='password-login']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//button[@id='login-submit-password']")).click();
		driver.findElement(By.xpath("//div[@class='ProfileButton-avatar']/div/span/span"));
		
	}

}
