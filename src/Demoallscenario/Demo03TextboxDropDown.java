package Demoallscenario;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Demo03TextboxDropDown {
	
	WebDriver driver;
	
	ChromeOptions option = new ChromeOptions();
	
	String url = "http://www.google.com";
	
	String SearchValue = "hai";
	
	@Test
	public void TextboxDropDown() throws Exception{
		
		option.addArguments("disable-infobars");
		
		driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
		driver.findElement(By.id("lst-ib")).sendKeys(SearchValue);
		
		Thread.sleep(3000);
		
		List<WebElement> lw = driver.findElements(By.xpath("//*[@class='sbqs_c']//b"));
		
		for (WebElement lw1 : lw) {
			
			String value = lw1.getText();
			
			String SearchValue1=SearchValue+value;
			
			System.out.println("Suggestion Search value: "+SearchValue1);
		}
		
		
										
	}
	
	@AfterMethod
	public void deardown() throws Exception{
		
		Thread.sleep(3000);
		
		driver.close();
		
	}
}
