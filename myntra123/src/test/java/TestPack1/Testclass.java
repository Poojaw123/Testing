package TestPack1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testclass 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\automation\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
		WebElement login=driver.findElement(By.xpath("//a[@id='login2']"));
		login.click();
		
		WebElement user=driver.findElement(By.xpath("//input[@id='loginusername']"));
		user.sendKeys("8446078595");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='loginpassword']"));
		password.sendKeys("18@swami");
		Thread.sleep(1000);
		
		WebElement cont=driver.findElement(By.xpath("//button[text()='Log in']"));
		cont.click();
		Thread.sleep(1000);
		WebElement mobile=driver.findElement(By.xpath("//a[text()='Phones']"));
		mobile.click();
		Thread.sleep(1000);
		WebElement phone=driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']"));
		String str=phone.getText();
		if(str.equals("Samsung galaxy s6"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
		WebElement logout=driver.findElement(By.xpath("//a[text()='Log out']"));
		logout.click();
		Thread.sleep(1000);
		WebElement login1=driver.findElement(By.xpath("//a[@id='login2']"));
		login1.click();
		
		WebElement user1=driver.findElement(By.xpath("//input[@id='loginusername']"));
		user1.sendKeys("8446078595");
		
		WebElement password1=driver.findElement(By.xpath("//input[@id='loginpassword']"));
		password1.sendKeys("18@swami");
		Thread.sleep(1000);
		
		WebElement cont1=driver.findElement(By.xpath("//button[text()='Log in']"));
		cont1.click();
		Thread.sleep(1000);
		WebElement laptop=driver.findElement(By.xpath("//a[text()='Laptops']"));
		laptop.click();
		WebElement lap=driver.findElement(By.xpath("//a[text()='Sony vaio i5']"));
		String str1=lap.getText();
		if(str1.equals("Sony vaio i5"))
		{
			System.out.println("pass");
		}	
		else
		{
			System.out.println("fail");
		}
		Thread.sleep(1000);
		WebElement logout1=driver.findElement(By.xpath("//a[text()='Log out']"));
		logout1.click();
		Thread.sleep(1000);
		WebElement login2=driver.findElement(By.xpath("//a[@id='login2']"));
		login2.click();
		
		WebElement user2=driver.findElement(By.xpath("//input[@id='loginusername']"));
		user2.sendKeys("8446078595");
		
		WebElement password2=driver.findElement(By.xpath("//input[@id='loginpassword']"));
		password2.sendKeys("18@swami");
		Thread.sleep(1000);
		
		WebElement cont2=driver.findElement(By.xpath("//button[text()='Log in']"));
		cont2.click();
		Thread.sleep(1000);
		WebElement monitors=driver.findElement(By.xpath("//a[text()='Monitors']"));
		monitors.click();
		Thread.sleep(1000);
		WebElement monit=driver.findElement(By.xpath("//a[text()='ASUS Full HD']"));
		String str2=monit.getText();
		if(str2.equals("ASUS Full"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		Thread.sleep(1000);
		WebElement logout2=driver.findElement(By.xpath("//a[text()='Log out']"));
		logout2.click();
		Thread.sleep(1000);
		driver.quit();
		}
		
		
	}


