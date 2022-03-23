package seleniumpracticing;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JavaProgs{
	static WebDriver driver;
	static webElements we;
	static pageActions pa;
	static WebDriverWait wait;
	
	@Test
	void launchBrowser()
	{
		
	}
	@Test
	void login(){
		
		
		
	}
	
	public static void main(String args[]) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","c:\\new folder\\chromedriver.exe");
		 driver = new ChromeDriver();
		 wait = new WebDriverWait(driver, 10);
		 FileInputStream fis= new FileInputStream("C:\\Users\\patlo\\eclipse-workspace\\seleniumpracticing\\src\\seleniumpracticing\\testdata.properties");
		 Properties prop = new Properties();
		 prop.load(fis);
		 
		 
		 String emailid = prop.getProperty("emailid");
		 String password = prop.getProperty("password");
		 
		 
		 we = new webElements();
		 pa = new pageActions(driver, wait);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		driver.get("https://www.box.com/home");
		driver.manage().window().maximize();
		
		pa.wait(we.loginbuttonHomePage);
		pa.click(we.loginbuttonHomePage);
		pa.sendkeys(we.emialid,emailid);
		pa.click(we.loginbutton);
		pa.sendkeys(we.password,password);
		pa.click(we.submit);
		
		driver.findElement(we.profileicon);
		
		
		
	}
}
