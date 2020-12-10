package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{

	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      
      driver.get("https://www.amazon.in/");
      String ActualPageTitle = driver.getTitle();
      String ExpectedPageTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
      if(ActualPageTitle.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
      {
    	  System.out.println("correct pagetitle");
      }
      else
      {
    	  System.out.println("incorrect pagetitle");
      }
  //now locators ka part chalu hogaa:::
      
      WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
      SearchBox.sendKeys("oneplus nord");
      Thread.sleep(5000);
      WebElement SearchSign = driver.findElement(By.id("nav-search-submit-text"));
      SearchSign.click();
      Thread.sleep(2000);
      String ActualPageTitle1 = driver.getTitle();
      System.out.println(ActualPageTitle1);
      String ExpectedPageTitle1 = "Amazon.in : oneplus nord";
      if(ActualPageTitle1.equals("Amazon.in : oneplus nord"))
      {
    	  System.out.println("correct ");
      }
      else
      {
    	  System.out.println("incorrect");
      }
      driver.quit();
	}

}
