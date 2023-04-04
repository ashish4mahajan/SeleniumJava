import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/mahaj/Downloads/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	}
	

}
