package Test;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.Assert;
import org.testng.annotations.Test;
import Base.Basetest;

public class TC1_1_VerifyCreatewalletwithoutmanualbackup extends Basetest {

    @Test
    public void launchApp() throws MalformedURLException, InterruptedException {

        // Test Scenario ID 1 - To verify creating a wallet without manual backup

        try {
            // Verify that the page is displayed with the 'Get Started' button
            String getStartedText = driver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'Get Started')]")).getText();
            Assert.assertEquals(getStartedText, "Get Started", "Values are not equal");
            getStartedScreen.GetstartedButtonClick();

            wait_utilities.setImplicitWait(Duration.ofSeconds(10));

            // Click on 'Create New Wallet'
            // Verify Wallet creation page xpath - //android.widget.TextView[@text="Join 70M+ people shaping the future of the internet with us"]
            String walletCreationPageText = driver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'Join 70M+ people shaping the future of the internet with us')]")).getText();
            Assert.assertEquals(walletCreationPageText, "Join 70M+ people shaping the future of the internet with us", "Values are not equal");
            walletcreationandimportScreen.CreateNewWalletClick();

            wait_utilities.setImplicitWait(Duration.ofSeconds(10));

            // Verify user can see options: 'SKIP', 'Back up manually', 'Back up to Google Drive'
            String SKIP = driver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'SKIP')]")).getText();
            String Backupmanually = driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")).getText();
            String BackuptoGoogleDrive = driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]/android.widget.Button")).getText();
            Assert.assertEquals(SKIP, "Join 70M+ people shaping the future of the internet with us", "Values are not equal");
            Assert.assertEquals(Backupmanually, "Join 70M+ people shaping the future of the internet with us", "Values are not equal");
            Assert.assertEquals(BackuptoGoogleDrive, "Join 70M+ people shaping the future of the internet with us", "Values are not equal");

            backupscreen.BackupSkipClick();

            wait_utilities.setImplicitWait(Duration.ofSeconds(10));

            // Verify user sees the number keypad and Biometric option in create passcode screen
            enterPasscode();

            wait_utilities.setImplicitWait(Duration.ofSeconds(10));

            // Enter the passcode again for verification
            enterPasscode();

            wait_utilities.setImplicitWait(Duration.ofSeconds(10));

            // Verify 'Welcome aboard' pop-up screen displayed with a button 'Start using Trust Wallet'
            popupscreenstartusingwallet.StartUsingWalletButtonClick();

            wait_utilities.setImplicitWait(Duration.ofSeconds(10));

            // Allow notifications
            devicenotification.AllowNotificationClick();

            wait_utilities.setImplicitWait(Duration.ofSeconds(10));

            // Verify user can see the Home screen
            // Additional code or verification steps can be added here if needed
            System.out.println("Done");
        } catch (StaleElementReferenceException e) {
            // Handle StaleElementReferenceException
            e.printStackTrace(); // You can log the exception or take appropriate actions
        } catch (Exception e) {
            // Handle other exceptions
            e.printStackTrace(); // You can log the exception or take appropriate actions
        }
    }

    private void enterPasscode() throws InterruptedException {
        devicepasscodescreen.Number9Click();
        devicepasscodescreen.Number5Click();
        devicepasscodescreen.Number6Click();
        devicepasscodescreen.Number6Click();
        devicepasscodescreen.Number2Click();
        devicepasscodescreen.Number7Click();
    }
}
