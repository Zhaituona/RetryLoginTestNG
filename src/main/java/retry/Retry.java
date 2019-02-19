package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
    int count =0;
    int retryLimit = 3;


    public boolean retry(ITestResult iTestResult) {
        if(count <retryLimit){
            count++;
            return true;
        }

        return false;
    }
}
