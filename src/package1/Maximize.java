package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tackletips.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		org.openqa.selenium.Point point=new org.openqa.selenium.Point(0, 3000);
		driver.manage().window().setPosition(point);

	}

}
