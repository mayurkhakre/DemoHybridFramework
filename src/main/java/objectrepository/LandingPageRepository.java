package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPageRepository {

	@FindBy(xpath="//a[contains(@href,'sign_in')]")
    public WebElement login;
	
	@FindBy(xpath="//div[@class='text-center']/h2")
	public WebElement centerText;
	
	@FindBy(xpath="//ul[contains(@class,'navbar')]")
	public WebElement navbar;
	
	
	
}
