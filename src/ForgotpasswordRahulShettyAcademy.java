
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotpasswordRahulShettyAcademy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/mahaj/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.linkText("Forgot your password?")).click();
	
      // xpath
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ashish Mahajan");
	  //driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("mahajan21ashish@gmail.com");
	  // css selector	
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("mahajan31ashish@gmail.com");
	  //index position using Xpath only
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("2269870381");
		driver.findElement(By.xpath("//input[@type='text'][3]")).clear();
		
	  //index position using Css Selector
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("9815221978");
	
	  // Xpath using parent to child traversing	
		driver.findElement(By.xpath("//form/input[3]")).clear();
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("2267890391");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//or
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		
	  // Css with #idName	
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
     // Css with regular expression
		driver.findElement(By.cssSelector("input[type*='pass'")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).isSelected();
		
	  // Xpath selector with Regular Expression	
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(4000);
	    driver.close();
	    
	    /// updated
		
	}

}
