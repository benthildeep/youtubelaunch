package octproj.Octoberproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch 
{
public static void main(String[] args)
{
String s = "https://www.youtube.com/";
System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Deepak Rajakumaran\\eclipse-workspace\\Octoberproject\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get(s);
	
}
}
