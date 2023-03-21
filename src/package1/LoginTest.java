package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://festo-admin.yes45.in/");
    driver.manage().window().maximize();
    String expectedtitleString="sign in festo admin";
    String actualtitlestString=driver.getTitle();
    Object equals;
    if(expectedtitleString.equals(actualtitlestString))
    {
    	System.out.println("Verification Successful - The correct title is displayed on the web page.");
    }
    else
    {
    	System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
    }
    driver.findElement(By.xpath("/html/body/div/div/div/a")).click();
    driver.findElement(By.name("email")).sendKeys("admin@gmail.com");
    driver.findElement(By.name("password")).sendKeys("12345678");
    driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[3]/button")).click();
    driver.close();
    System.out.println("Test script executed successfully.");
    System.exit(0);
    
	}

}
