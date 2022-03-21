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
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(loginbuttonHomePage));
		driver.findElement(loginbuttonHomePage).click();
		
		driver.findElement(emialid).sendKeys("kalyan89p@gmail.com");
		driver.findElement(loginbutton).click();
		driver.findElement(password).sendKeys("Admin@123");
		driver.findElement(submit).click();
		driver.findElement(profileicon);
				
	}
}