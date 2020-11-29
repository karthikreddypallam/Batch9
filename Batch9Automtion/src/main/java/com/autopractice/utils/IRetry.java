package com.autopractice.utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetry implements IRetryAnalyzer {
	
	private int count = 0;
    private static int maxTry = 1;
 
    public boolean retry(ITestResult iTestResult) {
    	// itestResult = failed
        if (!iTestResult.isSuccess()) {                      
            if (count < maxTry) {                            
                count++;                                     
                iTestResult.setStatus(ITestResult.FAILURE);  
                return true;                                 
            } else {
                iTestResult.setStatus(ITestResult.FAILURE);  
            }
        } else {
            iTestResult.setStatus(ITestResult.SUCCESS);      
        }
        return false;
    }

}
