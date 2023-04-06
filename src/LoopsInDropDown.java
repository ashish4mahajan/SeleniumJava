import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoopsInDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/mahaj/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
//      checkBox concept
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*= 'friendsandfamily'")).isSelected());
//		System.out.println((driver.findElement(By.cssSelector("input[id*= 'friendsandfamily'")).isSelected()));
		driver.findElement(By.cssSelector("input[id*= 'friendsandfamily'")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*= 'friendsandfamily'")).isSelected());
//		System.out.println((driver.findElement(By.cssSelector("input[id*= 'friendsandfamily'")).isSelected()));
		
//      count the number of checkboxes Selected
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
//		 driver.findElement(By.id("hrefIncAdt")).click();
//		 driver.findElement(By.id("hrefIncAdt")).click();
//		 driver.findElement(By.id("hrefIncAdt")).click();
//		 while Loop

//		int i=1;
//		while(i<4)
//		{
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}
		
//		for Loop
		for (int j = 0; j <= 1; j++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(1000);
	

	}

}
