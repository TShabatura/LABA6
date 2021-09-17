package util;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;

public class CustomListener implements ITestListener {

    private static final Logger logger = LogManager.getLogger(CustomListener.class);

    public void onTestStart(ITestContext context) {
        logger.info(context.getName() + " started successfully");
    }

    public void onTestFailure(ITestContext context) {
        logger.error(context.getName() + " failed ");
    }

    public void onTestSkipped(ITestContext context) {
        logger.warn(context.getName() + " skipped");
    }

    public void onStart(ITestContext context) {
        System.out.println("AAAAAA");
    }

    public void onFinish(ITestContext context) {
        System.out.println("ZZZZZZ");
    }
}
