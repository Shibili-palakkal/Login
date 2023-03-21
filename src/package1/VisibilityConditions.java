package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibilityConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
//declare and initialize the variable to store the expected title of the webpage.
String expectedTitle = "Google";

// fetch the title of the web page and save it into a string variable
String actualTitle = driver.getTitle();

// compare the expected title of the page with the actual title of the page and print the result
if (expectedTitle.equals(actualTitle))
{
System.out.println("Verification Successful - The correct title is displayed on the web page.");
}
else
{
System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
}

// verify if the “Google Search” button is displayed and print the result
boolean booleansubmitbuttonPresence = driver.findElement(By.id("gbqfba")).isDisplayed();
char[] submitbuttonPresence = null;
System.out.println(submitbuttonPresence);

//// enter the keyword in the “Google Search” text box by which we would want to make the request
WebElement searchTextBox = driver.findElement(By.id("gbqfba"));
//
searchTextBox.clear();
searchTextBox.sendKeys("Selenium");

// verify that the “Search button” is displayed and enabled
boolean searchIconPresence = driver.findElement(By.id("gbqfba")).isDisplayed();
boolean searchIconEnabled = driver.findElement(By.id("gbqfba")).isEnabled();
//
if (searchIconPresence==true && searchIconEnabled==true)
{
// click on the search button
WebElement searchIcon = driver.findElement(By.id("gbqfba"));
searchIcon.click();
}

// close the web browser
driver.close();
System.out.println("Test script executed successfully.");

// terminate the program
System.exit(0);


	}

}
