package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsfindingdemoXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		
		
		driver.findElements(By.xpath("//input[@name='color']")).get(1).click();
		
		driver.findElements(By.xpath("//input[@name='color']")).get(3).click();
		
		driver.findElements(By.xpath("//input[@name='color']")).get(4).click();

	}

}
