package Utility;

import java.time.Duration;

import io.appium.java_client.android.AndroidDriver;

public class Wait_Utilities {
    public static AndroidDriver driver;

    // Constructor
    public Wait_Utilities(AndroidDriver driver) {
        Wait_Utilities.driver = driver;
    }

    @SuppressWarnings("deprecation")
	public void setImplicitWait(Duration duration) {
        driver.manage().timeouts().implicitlyWait(duration.getSeconds(), java.util.concurrent.TimeUnit.SECONDS);
    }
}
