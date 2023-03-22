package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tackletips.in/");
		Actions builder = new Actions(driver);
		 WebElement element = driver.findElement(By.linkText("Rod"));//Mouse hover
		 builder.moveToElement(element).build().perform();
		 driver.findElement(By.xpath("/html/body/nav/div/div/div[2]/ul/li[2]/ul/li[1]/a")).click();

	}

}
