package trainingPr1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class R {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://watir.com/examples/shadow_dom.html");
		WebElement shadowHost = driver.findElement(By.id("shadow_host"));
		SearchContext ShadowRoot = expandShadowRoot(shadowHost);

		String text = ShadowRoot.findElement(By.cssSelector("//span[id='shadow_content']>span")).getText();
		System.out.println(text);
	}

	private static SearchContext expandShadowRoot(WebElement shadowHost) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		SearchContext shadowRoot = (SearchContext) js.executeScript("return arguments[0].shadowRoot", shadowHost);
		return shadowRoot;
	}

}
