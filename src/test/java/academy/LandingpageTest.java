package academy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.LandingPage;
import resources.Base;

public class LandingpageTest extends Base {
	public WebDriver driver;
	public static Logger log= LogManager.getLogger(LandingpageTest.class.getName());
	SoftAssert sa = new SoftAssert();

	@BeforeTest
	public void initialise() throws Exception {
		driver = initialization();
		log.info("Driver Initialised for Landing page");
		driver.get(prop.getProperty("url1"));
		log.info("Url launched for Landing Page Test Cases");
	}

	@Test
	public void LandingPageCenterText() throws Exception {
        log.info("running landing page Center text test case");
		LandingPage land = new LandingPage(driver);
		Assert.assertEquals(land.getCenterText(), "FEATURED COURSES");
		log.info("LandingPage page CenterText test case passed");
	}
	
	@Test
	public void LandingPageNavigationBar() throws Exception {
		log.info("running landing page Navigation bar test case");
		LandingPage land = new LandingPage(driver);
		Assert.assertTrue(land.isNavBarPresent());
		log.info("LandingPage page NavigationBar test case passed");
		
	}

	
	
	
	
	
	
	
	@AfterTest
	public void tearDown() throws Exception {
		driver.close();
		log.info("Driver closed for Landing Page  class");
	}

}
