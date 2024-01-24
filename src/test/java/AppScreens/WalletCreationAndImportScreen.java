package AppScreens;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class WalletCreationAndImportScreen {
	public static AndroidDriver driver;
	
	 By CreateNewWallet = By.xpath("//android.widget.TextView[@text=\"Create new wallet\"]");
	 By AddExistingWallet = By.xpath("//android.widget.TextView[@text=\"Add existing wallet\"]");
	
	// Constructor
		public WalletCreationAndImportScreen(AndroidDriver driver) {
			WalletCreationAndImportScreen.driver = driver;
	    }
		 public  void CreateNewWalletClick() {
			   System.out.println("Done1");
			   driver.findElement(CreateNewWallet).click();
				 
		   }
		 public  void AddExistingWalletClick() {
			   System.out.println("Done1");
			   driver.findElement(AddExistingWallet).click();
				 
		   }
		
}
