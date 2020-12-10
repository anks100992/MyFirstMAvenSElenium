package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    
    
    
    driver.get("https://www.lambdatest.com/blog/using-link-text-and-partial-link-text-in-selenium/");
	WebElement FirstLink = driver.findElement(By.linkText("ID locator in Selenium"));
	FirstLink.click();
	
	Thread.sleep(3000);		
	String CurrentPageUrl = driver.getCurrentUrl();
	if(CurrentPageUrl.equals("https://www.lambdatest.com/blog/making-the-move-with-id-locator-in-selenium-webdriver/"))
	{
		System.out.println("ok");
	}
	else
	{
		System.out.println("not ok");
	}
	driver.quit();
	}

}
