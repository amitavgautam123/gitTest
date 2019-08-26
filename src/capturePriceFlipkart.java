import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class capturePriceFlipkart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		try {
			driver.findElement(By.xpath("//button[text() = '✕']")).click();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Exception Handled");
		}
		driver.findElement(By.name("q")).sendKeys("iPhonex", Keys.ENTER);		
		String locator = "//div[text() = 'Apple iPhone X (Space Gray, 64 GB)']/../following-sibling::div[1]/div/div/div[1]";
		String pr = driver.findElement(By.xpath("//div[text() = 'Apple iPhone 7 (Black, 32 GB)']/../following-sibling::div[1]/div/div/div[1]")).getText();
		System.out.println("Price of the item is " + pr);		
	}
}
