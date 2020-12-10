package alertFrame_Browser_Popup_Tab_handling_FileUpload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.Assert;

public class Alert_Popup_Handling_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("wedriver.chrome.driver","chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement button1 = driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]"));
		button1.click();
		
		Thread.sleep(2000);
		
		WebElement button2 = driver.findElement(By.xpath("//button[@class ='btn btn-primary']"));
		button2.click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//alert.dismiss();
		System.out.println(alert.getText());
		
		WebElement alertConfirmMessage = driver.findElement(By.xpath("//p[contains(text(),'You pressed Ok')]"));
		alertConfirmMessage.getText();
		String actualText = alertConfirmMessage.getText();
		//Assert.assertEquals("You pressed Ok" , "alertConfirmMessage.getText()");
	    String ExpectedText = "You pressed Ok";
	    {
		if(ExpectedText.equals(actualText))
		{System.out.println("passed");}
		else
			{System.out.println("failed");}
	    }
		//Thread.sleep(2000);
		
		driver.quit();	
	}

}
