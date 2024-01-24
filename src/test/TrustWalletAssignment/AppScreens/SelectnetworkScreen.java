package AppScreens;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class SelectnetworkScreen {
	public static AndroidDriver driver;
	
	 By Crypto_Solana = By.xpath("//android.widget.TextView[contains(@text, 'Solana')]");
	
	
	// Constructor
		public SelectnetworkScreen(AndroidDriver driver) {
			SelectnetworkScreen.driver = driver;
	    }
		 public void Crypto_SolanaClick() {
			   System.out.println("Done1");
			   driver.findElement(Crypto_Solana).click();
				 
		 }
}

