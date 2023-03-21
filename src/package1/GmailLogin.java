package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com/");
		driver.manage().window().maximize();
		String expectedTitleString=" Sign in - Google Accounts ";
		String actualTileString=driver.getTitle();
		Object equals;
		if(expectedTitleString.equals(actualTileString))
		{
			System.out.println("Verification Successful - The correct title is displayed on the web page.");
			
		}
		else
		{
			System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
		}
		WebElement username = driver.findElement(By.id("identifierId"));
		 username.clear();
		 username.sendKeys("sysbreezetech@gmail.com");
		 driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		 // enter a valid password in the password textbox
		 WebElement password = driver.findElement(By.name("Passwd"));
		 password.clear();
		 password.sendKeys("INDIND()()1");
		 
		 // click on the Sign in button
		 WebElement SignInButton = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
		 SignInButton.click();
		 
		 // close the web browser
		 driver.close();
		 System.out.println("Test script executed successfully.");
		 
		 // terminate the program
		 System.exit(0);


	}

} 