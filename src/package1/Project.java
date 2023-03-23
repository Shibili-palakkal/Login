package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://festo-admin.yes45.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div/div/div/a")).click();
		driver.findElement(By.name("email")).sendKeys("admin@gmail.com");
		WebElement elementuserElement=driver.findElement(By.name("email"));
		elementuserElement.sendKeys(Keys.TAB);
		driver.findElement(By.name("password")).sendKeys("12345678");
		WebElement elementuserElement2=driver.findElement(By.name("password"));
		elementuserElement.sendKeys(Keys.TAB);
		WebElement elementclickElement=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[3]/button"));
		elementuserElement.sendKeys(Keys.ENTER);
		String expectedusernameString="admin@gmail.com";
		String actualusernameString="admin@gmail.com";
		if(expectedusernameString.equals(actualusernameString)) {
			System.out.println("Your login is successful");
		}
		else {
			System.out.println("Your login is failed");
		}
		Thread.sleep(2000);
		driver.close();

	}

}
