import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class makeMyTrip {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		//System.setProperty(key, value)
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
