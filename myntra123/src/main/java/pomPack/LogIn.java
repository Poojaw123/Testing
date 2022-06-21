package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn
{
	@FindBy (xpath="//a[@id='login2']")
	private WebElement login;
	
	@FindBy (xpath="//input[@id='loginusername']")
	private WebElement user;
	
	@FindBy (xpath="//input[@id='loginpassword']")
	private WebElement password;
	
	@FindBy (xpath="//button[text()='Log in']")
	private WebElement log;
	
	@FindBy (xpath="//a[text()='Log out']")
	private WebElement logOut;
	
	public LogIn(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickOnLogin()
	{
		login.click();
	}
	public void sendUser()
	{
		user.sendKeys("8446078595");
	}
	public void sendPassword()
	{
		password.sendKeys("18@swami");
	}
	public void enter()
	{
		log.click();
	}
	public void clickOnLogout()
	{
		logOut.click(); 
	}
}
