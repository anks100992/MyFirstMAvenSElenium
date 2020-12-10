package browser_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Browser_Navigation_Commands {

	public static void main(String[] args) throws InterruptedException 
	{
	     System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     
	     driver.get("https://www.amazon.in/");
	     String PageTitle = driver.getTitle();
	     System.out.println("pagetile  : "+PageTitle);
	     
	     Thread.sleep(2000);
	     
	     driver.navigate().to("https://www.facebook.com/");
	     String PageTitle1 = driver.getTitle();
	     System.out.println("pagetile no.1 : "+PageTitle1);
	     
	     Thread.sleep(2000);
	     
	     driver.navigate().refresh();
	     
	     Thread.sleep(2000);
	     
	     driver.navigate().back();
	     String PageTitle2 = driver.getTitle();
	     System.out.println("pagetile no.2 : "+PageTitle2);
	     
	     Thread.sleep(2000);
	     
	     driver.navigate().forward();
	     String PageTitle3 = driver.getTitle();
	     System.out.println("pagetile no.3 : "+PageTitle3);
	     driver.quit();
	     	

	}

}
