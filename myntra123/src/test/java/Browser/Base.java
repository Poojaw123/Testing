package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{
	public static WebDriver openChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
	}
	public static WebDriver openFirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\automation\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		return driver;
	}

}
