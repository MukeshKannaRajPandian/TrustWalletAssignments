package AppScreens;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class AddExistingWalletScreen {
	public static AndroidDriver driver;
	
	 By SecretPhase = By.xpath("//android.widget.TextView[contains(@text, 'Secret phrase')]");
	 By ExistingGoogleDriveBackUp = By.xpath("//android.widget.TextView[contains(@text, 'Google Drive backup')]");
	 By ViewOnlyWallet = By.xpath("//android.widget.TextView[contains(@text, 'View-only wallet')]");
		
	
	// Constructor
	public AddExistingWalletScreen(AndroidDriver driver) {
		AddExistingWalletScreen.driver = driver;
   }
	
  public void SecretPhaseClick() {
	   System.out.println("Done1");
	   driver.findElement(SecretPhase).click();
		 
  }
  public void ExistingGoogleDriveBackUpClick() {
	   System.out.println("Done1");
	   driver.findElement(ExistingGoogleDriveBackUp).click();
		 
 }
  public void ViewOnlyWalletClick() {
	   System.out.println("Done1");
	   driver.findElement(ViewOnlyWallet).click();
		 
 }

}
