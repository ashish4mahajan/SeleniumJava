import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name= "Ashish Mahajan";
		System.setProperty("webdriver.chrome.driver","C:/Users/mahaj/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();		
	}

}
