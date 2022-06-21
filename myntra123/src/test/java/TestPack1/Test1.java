package TestPack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Browser.Base;
import pomPack.Header;
import pomPack.LogIn;
import pomPack.ProductTest;

public class Test1 
{
	WebDriver driver;
	LogIn log1;
	Header head;
	ProductTest product;
	String str ;
	
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browserName)
	{
		System.out.println(browserName);
		if(browserName.equals("chrome"))
		{
			driver=Base.openChromeBrowser();
		}
		 if(browserName.equals("Firefox"))
		{
			driver=Base.openFirefoxBrowser();
		}
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
	}
	
	@BeforeClass
	public void createPomObject()
	{
		log1=new LogIn(driver);
		head=new Header(driver);
		product=new ProductTest(driver);
		
		
	}

	@BeforeMethod()
	public void createObject() throws InterruptedException
	{
		
		log1.clickOnLogin();
		log1.sendUser();
		log1.sendPassword();
		log1.enter();
		Thread.sleep(2000);
		
		
	}
	@Test
	public void test1()
	{
		head.clickOnPhone();
		str=product.getTextMobile();
		SoftAssert soft=new SoftAssert();
		soft.assertEquals("str","Samsung galaxy s6" );
}
	
	
	@Test
	public void test2()
	{
		head.clickOnLaptop();
		str=product.getTextLapy();
		SoftAssert soft=new SoftAssert();
		soft.assertEquals("str","Sony vaio i5" );

	}
	
	
	@AfterMethod
	public void logOutApllication() throws InterruptedException
	{
		Thread.sleep(2000);
		log1.clickOnLogout();
	}
	@AfterClass
	public void clearObject()
	{
		log1=null;
		head=null;
		product=null;
		
		
	}
	@AfterSuite
	public void closeBrowser()
	{
		driver.close();
		driver=null;
		System.gc();
	}
	
}
