package browser_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Browser_Invocation_1 
{
	public static void main(String[] args) 
	{
     System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	 driver.get("https://www.amazon.in/");
	 
	 String actualPageTitle = driver.getTitle();
	 System.out.println(actualPageTitle);
	
	 
	 String expectedPageTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	 
	 if(actualPageTitle.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
	 {System.out.println("passed");}
	 else
	  {System.out.println("Failed");}
	 driver.quit();
	}
    
}


