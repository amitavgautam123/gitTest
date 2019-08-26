import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		try {
			driver.findElement(By.xpath("//button[@class = '_2AkmmA _29YdH8']")).click();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Exception handled");
		}
		//Deals of the day
		String str1 = driver.findElement(By.xpath("//h2[text() = 'Deals of the Day']/following-sibling::div/span")).getText();
		System.out.println("Deals of the day time:" + str1);
		//Inventory count of a product
		/*String []arr = str.split(" ");
		System.out.println("Inventory count: " + arr[5]);
*/
	}

}
