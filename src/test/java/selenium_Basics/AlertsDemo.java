package selenium_Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(1500);
		
		
		Alert a = driver.switchTo().alert();

		String alertText= a.getText();
		System.out.println(alertText);
		
		a.accept(); 
	
		driver.findElement(By.id("login1")).sendKeys("admin");
		
		driver.findElement(By.id("password")).sendKeys("admin");
			

	}

}
