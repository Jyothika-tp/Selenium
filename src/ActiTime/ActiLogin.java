package ActiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActiLogin
{
	WebDriver driver;
	@Test(dataProvider="ActiTime")
	public void actiLogin(String username, String password) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	        driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		
		driver.findElement(By.id("loginButton")).click();
		
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().contains("Enter"),"invalid login user details");
		System.out.println("page verified --valid login details");
		
		
		
	}
	@AfterMethod
    public void teerDown() 
		{
		driver.quit();
//		Thread.sleep(1000);
	   }
	
	
	@DataProvider(name="ActiTime")
	public String[][] passData()
	{
		String[][] data=new String[3][2];
		data[0][0]="admin";
		data[0][1]="manager";
		
		data[1][0]="admin";
		data[1][1]="manager";
		
		data[2][0]="admin";
		data[2][1]="manage";
		
		return data;
		
	}

}
