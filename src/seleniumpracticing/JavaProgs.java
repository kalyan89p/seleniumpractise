package seleniumpracticing;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaProgs{
	static WebDriver driver;
	static webElements we;
	static pageActions pa;
	
	static WebDriverWait wait;
	
	
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","c:\\new folder\\chromedriver.exe");
		 driver = new ChromeDriver();
		 we = new webElements();
		 pa = new pageActions(driver);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 wait = new WebDriverWait(driver, 10);
		driver.get("https://www.box.com/home");
		driver.manage().window().maximize();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(we.loginbuttonHomePage));
		pa.wait(we.loginbuttonHomePage);
		pa.click(we.loginbuttonHomePage);
		pa.sendkeys(we.emialid,"kalyan89p@gmail.com");
		pa.click(we.loginbutton);
		pa.sendkeys(we.password,"Admin@123");
		pa.click(we.submit);
		
		driver.findElement(we.profileicon);
		
		
		//driver.findElement(By.xpath(("//a[contains(text(),'Deepa')]"))).click();
	}
}