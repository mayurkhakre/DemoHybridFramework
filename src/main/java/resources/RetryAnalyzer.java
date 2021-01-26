package resources;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import academy.LandingpageTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;





public class RetryAnalyzer implements IRetryAnalyzer {
	int count=0;
	int maxLimit=3;
	public static Logger log= LogManager.getLogger(RetryAnalyzer.class.getName());
	
	public boolean retry(ITestResult result) {
		if(count < maxLimit) {
			log.info("Retrying failed test case for count "+count);
			count++;
			return true;
		}else {
			log.info("skip Retrying failed test case as max limit reached as "+maxLimit);
			return false;
		}
		
	}

}
