package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Select dropdownSelect=new Select(driver.findElement(By.xpath("//*[@id=\"oldSelectMenu\"]")));
		dropdownSelect.selectByVisibleText("Green");
		
		

	}

}
