package academy;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

import resources.Base;

public class LoginPageTest extends Base {
	public WebDriver driver;
	public static Logger log= LogManager.getLogger(LandingpageTest.class.getName());

	@BeforeTest
	public void initialise() throws Exception {
		driver = initialization();
		System.out.println("Hello");
		log.info("Driver initialised for Login Page class");
		driver.get(prop.getProperty("url1"));
		log.info("Url launched for Login page test cases");
	}

	@Test
	public void loginPageTitle() throws Exception {
		LandingPage land = new LandingPage(driver);
		LoginPage login=land.getLogin();
		Assert.assertTrue(login.loginPageTitle());
		log.info("Login page title test case passed");
		
	}
	
	@Test
	public void loginPagetext() throws Exception {
		LoginPage login =new LoginPage(driver);
		Assert.assertTrue(login.loginPagetextText());
		log.info("Login page text test case passed");
	}

	@AfterTest
	public void tearDown() throws Exception {
		driver.close();
		log.info("Driver closed for Login Page class");
	}

	
	
	
	
	
	
	
	
	
	
}
