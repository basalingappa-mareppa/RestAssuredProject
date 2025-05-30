package com.api.lesteners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTest implements ITestListener{
	
	private static final Logger logger=LogManager.getLogger(ListenersTest.class);
	
	  public void onTestStart(ITestResult result) {
		    logger.info("the suite started!!"+result.getMethod().getMethodName());
		  }
	  
	  public void onTestSuccess(ITestResult result) {
		    logger.info("the test suite completed");
		  }
	  
        public void onTestFailure(ITestResult result) {
		    logger.info("the test failed!!"+result.getMethod().getDescription());
		  }
        
        public void onTestSkipped(ITestResult result) {
           logger.info("test skipped");
          }
        
        public void onStart(ITestContext context) {
            logger.info("the test started");
          }

}
