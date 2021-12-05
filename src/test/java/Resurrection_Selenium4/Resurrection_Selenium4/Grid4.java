package Resurrection_Selenium4.Resurrection_Selenium4;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid4 {

	RemoteWebDriver driver;
	Object obj;
	@Parameters("browser")
	@Test
	public void StandAloneChrome(String browser) throws MalformedURLException, InterruptedException {
		System.out.println(java.time.LocalTime.now());  
	if(browser.contains("chrome")) {	
	//ChromeOptions opt=new ChromeOptions();
	obj=new ChromeOptions();
	}
	else if(browser.contains("firefox")) {
		//FirefoxOptions opt=new FirefoxOptions();	
		obj=new FirefoxOptions();
	}
	driver=new RemoteWebDriver(new URL("http://localhost:4444"),(Capabilities) obj);
	
	driver.get("http://google.com");
	driver.findElement(By.name("q")).sendKeys("VIaGRID");
	Thread.sleep(5000);
	driver.quit();
	}
}

