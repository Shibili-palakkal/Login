package package1;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver obj=new ChromeDriver();
		obj.get("https://tackletips.in/");
		File scrFile=((TakesScreenshot)obj).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(scrFile,new File("C:\\Users\\hp\\OneDrive\\Pictures\\Screenshots\\screenshots.png"));

	}

}
