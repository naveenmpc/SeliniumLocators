package selenium_Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://in.search.yahoo.com/");
		
		// Enter the value in the search Box
		driver.findElement(By.xpath("//input[@id='yschsp']")).sendKeys("Simplilearn");
		
		Thread.sleep(7000); // wait for 5 second for the list to appear
		
		//ul[@role='listbox']/child::*
		
		//div[@class='sa-list-ctn']/descendant::li
		
		// find the list of items and capture in an Object of type List
		
		List<WebElement> l1 = driver.findElements(By.xpath("//div[@class='sa-list-ctn']/descendant::li"));
		
	// print the size of the list
		
		 System.out.println(l1.size());
		 
	for(int i =0; i<l1.size();i++)	 
	{
		
		
		String text = l1.get(i).getText();
		System.out.println(text);
		
	if(text.contains("free courses"))	
	{
		l1.get(i).click();
		break;
	}
		
	}
	}

}
