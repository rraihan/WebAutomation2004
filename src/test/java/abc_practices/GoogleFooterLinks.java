package abc_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFooterLinks {
	
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty( "webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Privacy")).click();
		
		Thread.sleep(2000);
		boolean pageContains= driver.getPageSource().contains("GOOGLE PRIVACY POLICY");
		System.out.println(pageContains);

		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Terms")).click();
		Thread.sleep(2000);
		
		
		driver.close();
		driver.quit();
	
	
	
	
}
	
	
	

}
