package seleniumpracticing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageActions {

	WebDriver driver;
	WebDriverWait wait;
	pageActions(WebDriver driver, WebDriverWait wait){
		this.driver = driver;
		this.wait = wait;
	}

	public void click(By we) {
		driver.findElement(we).click();
		
	}
	
	public void sendkeys(By we, String text)
	{
		driver.findElement(we).sendKeys(text);
	}
	
	public void wait(By Element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Element));
	}
	
	
}
