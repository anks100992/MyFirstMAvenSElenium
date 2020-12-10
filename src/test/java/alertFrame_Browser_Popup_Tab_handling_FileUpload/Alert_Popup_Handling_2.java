package alertFrame_Browser_Popup_Tab_handling_FileUpload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup_Handling_2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("wedriver.chrome.driver","chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement button1 = driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]"));
		button1.click();
		
		Thread.sleep(2000);
		
		WebElement button2 = driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]"));
		button2.click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Anks");
		
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
	}

}
