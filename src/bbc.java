import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bbc {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bbc.com/");
		
		List<WebElement> links = driver.findElements(By.xpath("//ul[@class = 'media-list']/li/div/a"));
		System.out.println("Number of links: " + links.size());
		for(WebElement var:links) {
			System.out.println(var.getText()+ "  :  " + var.getAttribute("href"));
		}
	}
}
