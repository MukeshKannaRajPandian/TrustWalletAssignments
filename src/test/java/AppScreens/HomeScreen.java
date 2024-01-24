package AppScreens;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class HomeScreen {
	
	public static AndroidDriver driver;
	
	 By ManageCrypto = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.Button[2]");
	
	
	// Constructor
		public HomeScreen(AndroidDriver driver) {
			HomeScreen.driver = driver;
	    }
		 public void ManageCryptoClick() {
			   System.out.println("Done1");
			   driver.findElement(ManageCrypto).click();
				 
		 }

}
