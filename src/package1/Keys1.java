package package1;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys1 {

	

	private static CharSequence enter;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement elementclickElement=driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		elementclickElement.sendKeys(org.openqa.selenium.Keys.ENTER);
		Thread.sleep(1500);
		driver.close();
		
	
		

	}

}
