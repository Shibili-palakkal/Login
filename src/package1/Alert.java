package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("243545");
		driver.findElement(By.name("submit")).click();
		org.openqa.selenium.Alert alert=driver.switchTo().alert();
		String alertmessageString=driver.switchTo().alert().getText();
		System.out.println("alert message:"+alertmessageString);
		Thread.sleep(5000);
		alert.accept();
		driver.close();

	}

}
