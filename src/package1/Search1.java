package package1;

import java.util.concurrent.TimeUnit;

import javax.lang.model.element.ModuleElement.DirectiveVisitor; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.findElement(By.name("q")).sendKeys("cars");
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.findElement(By.name("btnK")).click();
	    driver.findElement(By.id("gsr")).click();
	    

	}

}
