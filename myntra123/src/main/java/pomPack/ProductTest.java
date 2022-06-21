package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductTest {
	
	@FindBy (xpath="//a[text()='Samsung galaxy s6']")
	private WebElement mobile;
	
	@FindBy (xpath="//a[text()='Sony vaio i5']")
	private WebElement lapy;
	
	@FindBy (xpath="//a[text()='ASUS Full HD']")
	private WebElement monit;
	
	public ProductTest(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public String getTextMobile()
	{
		return mobile.getText();
		
	}
	public String getTextLapy()
	{
		return lapy.getText();
		 
	}
	public String getTextMonit()
	{
		 return monit.getText();
	}
	
	
}
