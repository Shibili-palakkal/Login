package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		Select dropDownSelect=new Select(driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select")));
        dropDownSelect.selectByVisibleText("India");

	}

		
	}


