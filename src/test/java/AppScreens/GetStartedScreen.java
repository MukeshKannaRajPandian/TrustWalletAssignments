package AppScreens;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class GetStartedScreen {
	
	public static AndroidDriver driver;
	
	 By getstarted = By.xpath("//android.widget.TextView[contains(@text, 'Get Started')]");
	
	
	// Constructor
	public GetStartedScreen(AndroidDriver driver) {
        GetStartedScreen.driver = driver;
    }
	
   public void GetstartedButtonClick() {
	   System.out.println("Done1");
	   driver.findElement(getstarted).click();
	   		 
   }
   public String GetstartedButton() {
	   System.out.println("Done1");
	   driver.findElement(getstarted).getText();
	return null;
		 
   }
	

}
