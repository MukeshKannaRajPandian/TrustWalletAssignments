package AppScreens;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class DeviceNotification {
	public static AndroidDriver driver;
	
	 By AllowNotification = By.id("com.android.permissioncontroller:id/permission_allow_button");
	
	
	// Constructor
	public DeviceNotification(AndroidDriver driver) {
		DeviceNotification.driver = driver;
    }
	
   public void AllowNotificationClick() {
	   System.out.println("Done1");
	   driver.findElement(AllowNotification).click();
		 
   }

}
