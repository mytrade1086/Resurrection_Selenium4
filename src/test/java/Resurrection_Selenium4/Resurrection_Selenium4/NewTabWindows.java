package Resurrection_Selenium4.Resurrection_Selenium4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTabWindows {

	
	WebDriver driver;
	//@Test
	public void demoWindow() throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		driver=new ChromeDriver();
		driver.get("http://google.com");
		Thread.sleep(5000);	
		driver.switchTo().newWindow(WindowType.WINDOW).get("http://www.wwe.com");
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	//@Test
	public void demoTab() throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		driver=new ChromeDriver();
		driver.get("http://google.com");
		Thread.sleep(5000);	
		driver.switchTo().newWindow(WindowType.TAB).get("http://www.wwe.com");
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	
	
}
