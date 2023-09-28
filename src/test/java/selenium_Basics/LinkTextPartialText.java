package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPartialText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
				// The locators of name: LinkText and partialLinktext will be applicable only for elements of type LINK
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
				
				// Inpsect the element link and write the locator linktext
				// LinkText locator value is always the text between the start tag and end tag
				// the value of locator should be same as on the HTML document
				
				driver.findElement(By.linkText("Log in")).click();
				
				Thread.sleep(1500); // wait for 1.5 seconds
				
				// find the locator for username on login page and enter text
				
				driver.findElement(By.id("wpName1")).sendKeys("admin");
				
			
				
				driver.findElement(By.id("wpPassword1")).sendKeys("admin@123");
							driver.findElement(By.id("wpRemember")).click();
				
				Thread.sleep(1500);
		
				
				driver.findElement(By.id("wpLoginAttempt")).click();
				
				Thread.sleep(1500);
				
				
				driver.findElement(By.partialLinkText("account")).click();
	}

}
