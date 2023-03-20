package package1;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.navigate().to("https://www.flipkart.com/");//for navigate
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
////driver.navigate().forward();
////Thread.sleep(2000);
////driver.navigate().refresh();
////Thread.sleep(2000);
//String title=driver.getTitle();
//System.out.println(title);
//Thread.sleep(2000);//timing
//String url=driver.getCurrentUrl();
//System.out.println(url);
//driver.close();//for site close
	}

}
