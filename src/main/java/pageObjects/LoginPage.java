package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import objectrepository.LoginPageRepository;
import utilities.ActionUtility;


public class LoginPage extends LoginPageRepository {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	/*@FindBy(xpath="//div/h1")
	private WebElement LoginPageText;*/

	public boolean loginPageTitle(){
		System.out.println(driver.getTitle()+"  WebServices Testing using SoapUI ");
		ActionUtility.moveToElement(driver, Loginpass);
		if(driver.getTitle().equals("WebServices Testing using SoapUI"))
		{
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean loginPagetextText()
	{
		System.out.println(LoginPageText.getText()+" Log In to WebServices Testing using SoapUI");
		if(LoginPageText.getText().equals("Log In to WebServices Testing using SoapUI")){
			return true;
			}
		else{
			return false;
		}
	}

}
