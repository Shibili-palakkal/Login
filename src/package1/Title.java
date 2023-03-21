package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseurlString="https://www.facebook.com/";
		String expectedtitleString="Facebook-log in or sign up";
		String actualtitleString="";
		driver.get(baseurlString);
		actualtitleString=driver.getTitle();
		System.out.println("actual title="+actualtitleString);
		driver.close();

	}

}
