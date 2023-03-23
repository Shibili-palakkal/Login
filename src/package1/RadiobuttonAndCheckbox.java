package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonAndCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		WebElement radioElement1=driver.findElement(By.id("vfb-7-1"));
		WebElement radioElement2=driver.findElement(By.id("vfb-7-2"));
		radioElement1.click();
		System.out.println("radio button1 selected");
		radioElement2.click();
		System.out.println("radion button2 selected");
		WebElement checkboxElement1=driver.findElement(By.id("vfb-6-0"));
		WebElement checkboxElement2=driver.findElement(By.id("vfb-6-1"));
		checkboxElement1.click();
//		checkboxElement2.click();
		if(checkboxElement2.isSelected()) {
			System.out.println("check box is selected");
		}
		else {
			System.out.println("check box is not selected");
		}
		Boolean displayBoolean=driver.findElement(By.id("vfb-6-0")).isDisplayed();
		System.out.println("element displayed"+displayBoolean);
		Boolean eanbledBoolean=driver.findElement(By.id("vfb-6-1")).isEnabled();
		System.out.println("element enabled"+eanbledBoolean);
			

	}

}
