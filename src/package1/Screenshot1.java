package package1;

import java.io.File;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://festo-admin.yes45.in/");

        // take screenshot and save it as a file
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // move the file to the desired location
        File destination = new File("C:\\Users\\hp\\OneDrive\\Pictures\\Screenshots\\screenshots.png");
        screenshot.renameTo(destination);

        // close the driver
        driver.quit();
        

	}

}
