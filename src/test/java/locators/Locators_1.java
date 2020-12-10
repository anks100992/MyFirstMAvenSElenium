package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_1 
{
  public static void main (String []agrs) throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.get("http://demo.automationtesting.in/Index.html");
	  WebElement EmailSearchBox = driver.findElement(By.id("email"));
	  EmailSearchBox.sendKeys("anks@test");
	  WebElement EnterSign =  driver.findElement(By.id("enterimg"));
	  EnterSign.click();
	  
	  Thread.sleep(5000);
	  
	  String CurrentPageUrl = driver.getCurrentUrl();
	  if(CurrentPageUrl.equalsIgnoreCase("http://demo.automationtesting.in/Register.html"))
	  {
		  System.out.println("correct pageurl");
	  }
	  else
	  {
		  System.out.println("incorrect pageurl");
	  }
      
      
     driver.navigate().to("https://www.google.com/");
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     WebElement SearchBox1 =  driver.findElement(By.name("q"));
     SearchBox1.sendKeys("Selenium");
     Thread.sleep(5000);
     WebElement EnterSign1 = driver.findElement(By.name("btnK"));
     EnterSign1.click();
     Thread.sleep(5000);
     WebElement SeleniumLink = driver.findElement(By.className("iUh30 Zu0yb tjvcx"));
     SeleniumLink.click();
     
     //validation
     
     String LastPageUrl = driver.getCurrentUrl();
     if(LastPageUrl.equals("https://www.selenium.dev/"))
     {
    	 System.out.println("correct");
     }
     else 
     {
    	 System.out.println("incorrect");
    	 
     }
    
     driver.quit();  
  }
}
