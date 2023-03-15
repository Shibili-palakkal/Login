package package1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver obj=new ChromeDriver();
		obj.get("https://www.google.com/");
		obj.findElement(By.name("q")).sendKeys("flower");
		obj.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		obj.findElement(By.name("btnk")).click();
	}

}
