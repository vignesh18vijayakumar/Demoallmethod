package Demoallscenario;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Demo02DropDown {
	
	WebDriver driver;
	
	ChromeOptions option = new ChromeOptions();
	
	String url = "https://www.facebook.com/r.php";
	
	@Test
	public void DropDown() {
		
		option.addArguments("disable-infobars");
		
		driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
		WebElement dd = driver.findElement(By.id("month"));
		
		Select sl = new Select(dd);
		
		sl.selectByVisibleText("Nov");
		
		WebElement dd1 = sl.getFirstSelectedOption();
		
		String value = dd1.getText();
		
		System.out.println(value);
		
		List<WebElement> dd2 = sl.getOptions();
		
		for(WebElement dd3 : dd2) {
			
			String value1 = dd3.getText();
			System.out.println("Dropdown value: "+value1);
		}
										
	}
	
	@AfterMethod
	public void deardown() throws Exception{
		
		Thread.sleep(3000);
		
		driver.close();
		
	}
}
