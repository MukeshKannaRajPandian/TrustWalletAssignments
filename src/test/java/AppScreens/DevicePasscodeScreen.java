package AppScreens;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class DevicePasscodeScreen {
	
public  AndroidDriver driver;
	
	 By Number1 = By.xpath("//android.widget.TextView[contains(@text, '1')]");
	 By Number2 = By.xpath("//android.widget.TextView[contains(@text, '2')]");
	 By Number3 = By.xpath("//android.widget.TextView[contains(@text, '3')]");
	 By Number4 = By.xpath("//android.widget.TextView[contains(@text, '4')]");
	 By Number5 = By.xpath("//android.widget.TextView[contains(@text, '5')]");
	 By Number6 = By.xpath("//android.widget.TextView[contains(@text, '6')]");
	 By Number7 = By.xpath("//android.widget.TextView[contains(@text, '7')]");
	 By Number8 = By.xpath("//android.widget.TextView[contains(@text, '8')]");
	 By Number9 = By.xpath("//android.widget.TextView[contains(@text, '9')]");
	 By Number0 = By.xpath("//android.widget.TextView[contains(@text, '0')]");
	
	
	// Constructor
		public DevicePasscodeScreen(AndroidDriver driver) {
			this.driver = driver;
	    }
		 public void Number1Click() {
			   System.out.println("Done1");
			   driver.findElement(Number1).click(); 
				 
		   }
		 public void Number2Click() {
			   System.out.println("Done1");
			   driver.findElement(Number2).click();
				 
		   }
		 public void Number3Click() {
			   System.out.println("Done1");
			   driver.findElement(Number3).click();
				 
		   }
		 public void Number4Click() {
			   System.out.println("Done1");
			   driver.findElement(Number4).click();
				 
		   }
		 public void Number5Click() {
			   System.out.println("Done1");
			   driver.findElement(Number5).click();
				 
		   }
		 public void Number6Click() {
			   System.out.println("Done1");
			   driver.findElement(Number6).click();
				 
		   }
		 public void Number7Click() {
			   System.out.println("Done1");
			   driver.findElement(Number7).click();
				 
		   }
		 public void Number8Click() {
			   System.out.println("Done1");
			   driver.findElement(Number8).click();
				 
		   }
		 public void Number9Click() {
			   System.out.println("Done1");
			   driver.findElement(Number9).click();
				 
		   }
		 public void Number0Click() {
			   System.out.println("Done1");
			   driver.findElement(Number0).click();
				 
		   }
		 

}
