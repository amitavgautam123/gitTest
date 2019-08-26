import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Profile {
////span[@name = 'Udemy']/../../../preceding-sibling::td[3]/div
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.id("identifierId")).sendKeys("andola.amitav@gmail.com");
		WebElement nextBtn = driver.findElement(By.xpath("//span[text() = 'Next']"));
		nextBtn.click();
		driver.findElement(By.name("password")).sendKeys("ethanrosstest#123", Keys.ENTER);
		//driver.findElement(By.xpath("(//span[@class = 'RveJvd snByac'])[0]")).click();
		
		List<WebElement> lst = driver.findElements(By.xpath("//table[@class = 'F cf zt']/tbody/tr[*]/td[2]/div"));
		System.out.println(lst.size());
		for(WebElement var:lst)
		{
			var.click();
			Thread.sleep(1000);
		}
		
		/*//Checking a particular inbox message and deleting it
		WebElement checkBox = driver.findElement(By.xpath("//span[@name = 'Orangescrum Blog']/../../../preceding-sibling::td[3]/div"));
		checkBox.click();
		Thread.sleep(2000);
		WebElement deleteBtn = driver.findElement(By.xpath("//div[@aria-label = 'Delete']/div/div"));
		deleteBtn.click();*/
		
	}
}
