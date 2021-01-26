package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import objectrepository.LandingPageRepository;

public class LandingPage extends LandingPageRepository {
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	/*@FindBy(xpath="//a[contains(@href,'sign_in')]")
    private WebElement login;
	
	@FindBy(xpath="//div[@class='text-center']/h2")
	private WebElement centerText;// 
	
	@FindBy(xpath="//ul[contains(@class,'navbar')]")
	private WebElement navbar;*/
	
	
	public String getCenterText()
	{
		return centerText.getText();
	}
	
	public boolean isNavBarPresent()
	{
		if(navbar.isDisplayed()){
			return true;
		}
		else return false;
	}
	
	public LoginPage getLogin() throws Exception
	{
		Thread.sleep(2000);
		login.sendKeys(Keys.ENTER);
		LoginPage lp=new LoginPage(driver);
		return lp;
	}
}
