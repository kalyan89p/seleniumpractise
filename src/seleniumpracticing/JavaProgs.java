package seleniumpracticing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaProgs {
	static WebDriver driver;

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","c:\\new folder\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.box.com");
		
	}

}
