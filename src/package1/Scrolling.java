package package1;




import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://festo-admin.yes45.in/");
		JavascriptExecutor javaobject=(JavascriptExecutor)driver;
		javaobject.executeScript("Window.scrollBy(0,9000)","");
		Thread.sleep(1000);
		javaobject.executeScript("window.scrollBy(0,-900)","");
		Thread.sleep(1000);
	}

}
