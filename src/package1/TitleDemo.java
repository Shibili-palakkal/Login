package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://festo-admin.yes45.in/");
		String baseurlString="http://festo-admin.yes45.in/";
		String expectedtitleString="Fezto-Admin";
		String actualtitleString="";
 		driver.get(baseurlString);
		actualtitleString=driver.getTitle();
		Thread.sleep(1000);
	System.out.println("actual title="+actualtitleString);
		driver.close();
	}

}
