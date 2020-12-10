package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public final class Locators_3 {

	public static void main(String[] args) throws InterruptedException 
	{
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
		  
		  WebElement FirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		  FirstName.sendKeys("Arpit");
		   
		  WebElement SecondName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		  SecondName.sendKeys("Nigam");
		  
		  //WebElement Address = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-valid ng-touched']"));
		  //Address.sendKeys("Satna (m.p)");
		  
		  WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
		  Email.sendKeys("anks@test");
          
		  WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		  phone.sendKeys("985281914");
		  
		  WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
		  gender.click();
		  
		  Thread.sleep(5000);
		  driver.quit();
	}

}
