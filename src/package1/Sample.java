package package1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
JavascriptExecutor js = (JavascriptExecutor) driver;

// Navigate to the web page that you want to scroll
driver.get("http://festo-admin.yes45.in/");

// Scroll down the page by 1000 pixels
js.executeScript("window.scrollBy(0,9000)");
Thread.sleep(1000);
js.executeScript("window.scrollBy(0,-900)","");
Thread.sleep(1000);
// Close the browser
driver.quit();
	}

}
