package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header 
{
	
	@FindBy (xpath="//a[text()='Phones']")
	private WebElement phones;
	
	@FindBy (xpath="//a[text()='Laptops']")
	private WebElement laptop;
	
	@FindBy (xpath="//a[text()='Monitors']")
	private WebElement monitor;
	
	public Header(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickOnPhone()
	{
		phones.click();
	}
	public void clickOnLaptop()
	{
		laptop.click();
	}
	public void clickOnMonitor()
	{
		monitor.click();
	}
}
