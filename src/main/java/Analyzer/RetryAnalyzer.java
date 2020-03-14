package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	int counter =0; //initializing the counter with 0
	int retrylimit = 3; //giving a retry limit of 3 chances to the failure test cases 
	public boolean retry(ITestResult result) {
		if(counter<retrylimit)
		{
			counter++;
			return true;
		}
		else
		{
		return false;
		}
		//once counter exceeds retry limit, else part will be executed
	}

}
