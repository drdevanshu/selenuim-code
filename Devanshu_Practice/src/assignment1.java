import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dev\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		
		//Elements
		driver.findElement(By.id("email")).sendKeys("hello@abc.com");
		driver.findElement(By.id("pass")).sendKeys("hello");
		driver.findElement(By.id("u_0_2")).click();
		driver.close();
		//driver.quit();
		
	}

}
