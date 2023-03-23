package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialTextLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseurlString="http://demo.guru99.com/test/accessing-link.html";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurlString);
		driver.findElement(By.partialLinkText("here")).click();
		System.out.println("Title of page is:"+driver.getTitle());
		driver.quit();
		

	}

}
