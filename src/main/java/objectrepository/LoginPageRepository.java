package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageRepository {

	@FindBy(xpath="//div/h1")
	public WebElement LoginPageText;

	@FindBy(xpath="//input[@type='password']")
	public WebElement Loginpass;
	
}
