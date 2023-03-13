package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://festo-admin.yes45.in/");
driver.findElement(By.xpath("/html/body/div/div/div/a")).click();
driver.findElement(By.name("email")).sendKeys("admin@gmail.com");  
driver.findElement(By.name("password")).sendKeys("12345678");
driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[3]/button")).click();
 
	}

}
