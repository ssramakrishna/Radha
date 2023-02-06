package trainingPr1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWeb 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.close();
		
		
		
	}
}
