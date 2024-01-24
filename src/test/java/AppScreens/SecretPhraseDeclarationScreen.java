package AppScreens;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class SecretPhraseDeclarationScreen {
	public static AndroidDriver driver;
	
	 By FirstDeclaration = By.xpath("//android.widget.TextView[contains(@text, 'Trust Wallet does not keep a copy of your secret phrase.')]");
	 By SecondDeclaration = By.xpath("//android.widget.TextView[contains(@text, 'Saving this digitally in plain text is NOT recommended. Examples include screenshots, text files, or emailing yourself')]");
	 By ThirdDeclaration = By.xpath("//android.widget.TextView[contains(@text, 'Write down your secret phrase, and store it in a secure offline location!')]");
	 By DeclarationContinueButton = By.xpath("//android.widget.ScrollView/android.view.View[4]/android.widget.Button");

	 
	
	
	// Constructor
		public SecretPhraseDeclarationScreen(AndroidDriver driver) {
			SecretPhraseDeclarationScreen.driver = driver;
	    }
		 public void FirstDeclarationClick() {
			   System.out.println("Done1");
			   driver.findElement(FirstDeclaration).click();
				 
		   }
		 public void SecondDeclarationClick() {
			   System.out.println("Done1");
			   driver.findElement(SecondDeclaration).click();
				 
		   }
		 public void ThirdDeclarationClick() {
			   System.out.println("Done1");
			   driver.findElement(ThirdDeclaration).click();
				 
		   }
		 public void DeclarationContinueButtonClick() {
			   System.out.println("Done1");
			   driver.findElement(DeclarationContinueButton).click();
				 
		   }

}
