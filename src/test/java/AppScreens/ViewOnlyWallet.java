package AppScreens;

import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.clipboard.HasClipboard;

public class ViewOnlyWallet {
	public static AndroidDriver driver;
	
	 By AddressTextBox = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.EditText[2]/android.view.View");
	 By SolanaWalletAddress = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.EditText[2]/android.view.View/android.view.View[2]");
	 By ViewOnlyWallet_Paste  = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.EditText[2]/android.view.View/android.view.View[1]/android.widget.Button");
	 By ViewOnlyWallet_Continue  = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");

	
	// Constructor
		public ViewOnlyWallet(AndroidDriver driver) {
			ViewOnlyWallet.driver = driver;
	    }
		 public void AddressTextBoxClick() {
			   System.out.println("Done1");
			   driver.findElement(AddressTextBox).click();
				 
		 }
		 
		 public void SolanaWalletAddressEnter() {
			 
			  // Replace "your_text_field_id" with the actual resource ID of your text field
		        

		        // String to be copied to the clipboard
		        String textToCopy = "HJD58VYWg8PBJmr9WBMxnpSek44mvR4uYZ4rejfWUNgU";

		        // Copy the text to the clipboard
		        ((HasClipboard) driver).setClipboardText(textToCopy);

		    
		        
//			 Map<String, String> valueStore = new HashMap<>();
//			 valueStore.put("storedValue", "HJD58VYWg8PBJmr9WBMxnpSek44mvR4uYZ4rejfWUNgU");
////			   String contentToPaste = "HJD58VYWg8PBJmr9WBMxnpSek44mvR4uYZ4rejfWUNgU";
////		        setClipboardData(contentToPaste);
    driver.findElement(ViewOnlyWallet_Paste).click();

		 }
		 
		 public void ViewOnlyWallet_ContinueClick() {
				
			 driver.findElement(ViewOnlyWallet_Continue).click();

		 }
}
