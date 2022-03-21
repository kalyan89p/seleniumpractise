package seleniumpracticing;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaProgs extends webElements {
	static WebDriver driver;
	static WebDriverWait wait;
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","c:\\new folder\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 wait = new WebDriverWait(driver, 10);
		driver.get("https://www.box.com/home");
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginButtonHomePage)));
		driver.findElement(By.xpath(LoginButtonHomePage)).click();
		driver.findElement(By.xpath(EmailID)).sendKeys("kalyan89p@gmail.com");
		driver.findElement(By.xpath(LoginButton)).click();
		driver.findElement(By.xpath(Password)).sendKeys("Admin@123");
		driver.findElement(By.xpath(Submit)).click();
		driver.findElement(By.xpath(ProfileIcon));
		
	}
}