package AppScreens;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class PopUpScreenStartUsingWallet {
public static AndroidDriver driver;
	
	 By StartUsingWalletButton = By.xpath("//android.widget.TextView[contains(@text, 'Start using Trust Wallet')]");
	
	
	// Constructor
	public PopUpScreenStartUsingWallet(AndroidDriver driver) {
		PopUpScreenStartUsingWallet.driver = driver;
    }
	
   public void StartUsingWalletButtonClick() {
	   System.out.println("Done1");
	   driver.findElement(StartUsingWalletButton).click();
		 
   }

}
