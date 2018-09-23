package Demoallscenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Demo01Openbrowser {
	
	WebDriver driver;
	
	ChromeOptions option = new ChromeOptions();
	
	String url = "http://www.google.com";
	
	@Test
	public void Openbrowser() {
		
		option.addArguments("disable-infobars");
		
		driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
	}
	
	@AfterMethod
	public void deardown() throws Exception{
		
		Thread.sleep(3000);
		
		driver.close();
		
	}
}
