package com.autopractice.utils;

import org.apache.log4j.Logger;
import org.testng.ITestContext ;		
import org.testng.ITestListener ;		
import org.testng.ITestResult ;

import com.autopractice.pages.LandingHomePage;	

public class ListenersTest implements ITestListener {
	
	private static Logger logger = Logger.getLogger(LandingHomePage.class);
	
	@Override		
    public void onFinish(ITestContext Result) 					
    {		
                		
    }		

    @Override		
    public void onStart(ITestContext Result)					
    {		
            		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result)					
    {		
    		
    }		

    // When Test case get failed, this method is called.		
    @Override		
    public void onTestFailure(ITestResult Result) 					
    {		
    System.out.println("The name of the testcase failed is :"+Result.getName());
    logger.error("The name of the testcase failed is :"+Result.getName());
    }		

    // When Test case get Skipped, this method is called.		
    @Override		
    public void onTestSkipped(ITestResult Result)					
    {		
    System.out.println("The name of the testcase Skipped is :"+Result.getName());		
    logger.warn("The name of the testcase Skipped is :"+Result.getName());					

    }		

    // When Test case get Started, this method is called.		
    @Override		
    public void onTestStart(ITestResult Result)					
    {		
    System.out.println(Result.getName()+" test case started");	
    logger.info(Result.getName()+" test case started");					

    }

    // When Test case get passed, this method is called.		
    @Override		
    public void onTestSuccess(ITestResult Result)					
    {		
    System.out.println("The name of the testcase passed is :"+Result.getName());	
    logger.info(Result.getName()+" test case started");					

    }			

}
