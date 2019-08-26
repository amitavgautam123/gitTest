import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
		List<WebElement> links = driver.findElements(By.xpath("//div[@class = 'TbwUpd']/cite"));
		System.out.println("Number of links: " + links.size());
		for(WebElement var:links)
		{
			System.out.println(var.getText());
		}
	}

}
