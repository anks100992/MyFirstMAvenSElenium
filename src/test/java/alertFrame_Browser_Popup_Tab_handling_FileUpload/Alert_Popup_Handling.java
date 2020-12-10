package alertFrame_Browser_Popup_Tab_handling_FileUpload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup_Handling {

	public static void main(String[] args) throws InterruptedException 
	{
	  
		System.setProperty("webdriver.chromedriver", "chromedrivr.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement alert_red_button = driver.findElement(By.xpath("//button[@class = 'btn btn-danger']"));
		alert_red_button.click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		
		System.out.println("Text of the alert" +alert.getText());
		alert.accept();
		
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
