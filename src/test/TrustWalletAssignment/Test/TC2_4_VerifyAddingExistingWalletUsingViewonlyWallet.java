package Test;
import java.net.MalformedURLException;
import java.time.Duration;

import org.testng.annotations.Test;
import Base.Basetest;

public class TC2_4_VerifyAddingExistingWalletUsingViewonlyWallet extends Basetest {
	 @Test
	    public void launchApp() throws MalformedURLException, InterruptedException {

	        // Test Scenario ID 1 - To verify creating a wallet without manual backup

	        // Pause for 2 seconds
		     	wait_utilities.setImplicitWait(Duration.ofSeconds(10));

	        // Verify that the page is displayed with the 'Get Started' button
	        getStartedScreen.GetstartedButtonClick();
	        
	        // Pause for 2 seconds
	            	wait_utilities.setImplicitWait(Duration.ofSeconds(10));
	        
	        walletcreationandimportScreen.AddExistingWalletClick();
	        
	            	wait_utilities.setImplicitWait(Duration.ofSeconds(10));
	        
	        addexistingwalletscreen.ViewOnlyWalletClick();
	        
	            	wait_utilities.setImplicitWait(Duration.ofSeconds(10));
	        
	        selectnetworkscreen.Crypto_SolanaClick();
	        
	            	wait_utilities.setImplicitWait(Duration.ofSeconds(10));
	        
	        viewonlywallet.AddressTextBoxClick();
	            	wait_utilities.setImplicitWait(Duration.ofSeconds(10));
	        viewonlywallet.SolanaWalletAddressEnter();
	        
	            	wait_utilities.setImplicitWait(Duration.ofSeconds(10));
	        
	        viewonlywallet.ViewOnlyWallet_ContinueClick();
	            	wait_utilities.setImplicitWait(Duration.ofSeconds(10));

	        // Verify that the user sees the number keypad and Biometric option in the create passcode screen
	        devicepasscodescreen.Number9Click();
	        devicepasscodescreen.Number5Click();
	        devicepasscodescreen.Number6Click();
	        devicepasscodescreen.Number6Click();
	        devicepasscodescreen.Number2Click();
	        devicepasscodescreen.Number7Click();
	        
	        // Pause for 2 seconds
	            	wait_utilities.setImplicitWait(Duration.ofSeconds(10));

	        // Enter the passcode again for verification
	        devicepasscodescreen.Number9Click();
	        devicepasscodescreen.Number5Click();
	        devicepasscodescreen.Number6Click();
	        devicepasscodescreen.Number6Click();
	        devicepasscodescreen.Number2Click();
	        devicepasscodescreen.Number7Click();
	        
	        // Pause for 2 seconds
	            	wait_utilities.setImplicitWait(Duration.ofSeconds(10));

	        // Verify that the 'Welcome aboard' pop-up screen is displayed with a button 'Start using Trust Wallet'
	        popupscreenstartusingwallet.StartUsingWalletButtonClick();
	        
	        // Pause for 2 seconds
	            	wait_utilities.setImplicitWait(Duration.ofSeconds(10));

	        // Allow notifications
	        devicenotification.AllowNotificationClick();
	        
	        // Pause for 2 seconds
	            	wait_utilities.setImplicitWait(Duration.ofSeconds(10));

	        // Verify that the user can see the Home screen

	        // Additional code or verification steps can be added here if needed

	        System.out.println("Done");
	        
	        

	 }
}
