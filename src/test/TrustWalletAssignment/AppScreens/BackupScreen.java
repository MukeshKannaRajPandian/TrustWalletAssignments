package AppScreens;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class BackupScreen {
public static AndroidDriver driver;
	
	 By BackupSkip = By.xpath("//android.widget.TextView[contains(@text, 'SKIP')]");
	 By ManualBackup = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
	 By GoogleBackup = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]/android.widget.Button");
	
	
	// Constructor
		public BackupScreen(AndroidDriver driver) {
			BackupScreen.driver = driver;
	    }
		 public void BackupSkipClick() {
			   System.out.println("Done1");
			   driver.findElement(BackupSkip).click();
				 
		   }
		 public void ManualBackupClick() {
			   System.out.println("Done1");
			   driver.findElement(ManualBackup).click();
				 
		   }
		 public void GoogleBackupClick() {
			   System.out.println("Done1");
			   driver.findElement(GoogleBackup).click();
				 
		   }
}
