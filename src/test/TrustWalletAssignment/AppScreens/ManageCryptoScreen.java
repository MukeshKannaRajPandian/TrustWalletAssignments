package AppScreens;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class ManageCryptoScreen {
	public static AndroidDriver driver;
	
	 By FirstCrpto_Remove = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View");
	 By FirstCrpto_Add = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]/android.view.View[5]/android.view.View");

	
	// Constructor
		public ManageCryptoScreen(AndroidDriver driver) {
			ManageCryptoScreen.driver = driver;
	    }
		 public void FirstCrpto_RemoveClick() {
			   System.out.println("Done1");
			   driver.findElement(FirstCrpto_Remove).click();
				 
		 }
		 
		 public void FirstCrpto_AddClick() {
			   System.out.println("Done1");
			   driver.findElement(FirstCrpto_Add).click();
				 
		 }

}
