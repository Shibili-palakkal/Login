package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseurlString="http://demo.guru99.com/test/link.html";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(baseurlString);
		driver.findElement(By.linkText("click here")).click();
		System.out.println("title of page is:"+driver.getTitle());
		driver.quit();
		

	}

}
