package seleniumpracticing;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class launch{
	static WebDriver driver;
	static webElements we;
	static pageActions pa;
	static WebDriverWait wait;
	static FileInputStream fis;
	static Properties prop;
	static String emailid;
	static String password;
	
	
	@Test
	void launchBrowser() throws IOException
	{
		 System.setProperty("webdriver.chrome.driver","c:\\new folder\\chromedriver.exe");
		 driver = new ChromeDriver();
		 wait = new WebDriverWait(driver, 10);
		fis= new FileInputStream("C:\\Users\\patlo\\eclipse-workspace\\seleniumpracticing\\src\\seleniumpracticing\\testdata.properties");
		prop = new Properties();
		prop.load(fis);
		emailid = prop.getProperty("emailid");
		password = prop.getProperty("password");
		 we = new webElements();
		 pa = new pageActions(driver, wait);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://www.box.com/home");
		 driver.manage().window().maximize();
	}
	
	@Test( dependsOnMethods= {"launchBrowser"}, enabled=true)
	//@Parameters({"email","password"})
	//@DataProvider
	void afirsttestcase(){
		pa.wait(we.loginbuttonHomePage);
		pa.click(we.loginbuttonHomePage);
		pa.sendkeys(we.emialid,emailid);
		pa.click(we.loginbutton);
		pa.sendkeys(we.password,password);
		pa.click(we.submit);
		driver.findElement(we.profileicon);
	}
	
	
}
