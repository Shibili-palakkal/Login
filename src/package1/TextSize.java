package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://festo-admin.yes45.in/");
		driver.findElement(By.xpath("/html/body/div/div/div/a")).click();
		
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		Dimension dimobj=driver.findElement(By.name("email")).getSize();
		System.out.println("height:"+dimobj.height);
		driver.close();

	}

}
