package Base;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import AppScreens.GetStartedScreen;
import AppScreens.HomeScreen;
import AppScreens.ManageCryptoScreen;
import AppScreens.WalletCreationAndImportScreen;
import Utility.Wait_Utilities;
import AppScreens.AddExistingWalletScreen;
import AppScreens.BackupScreen; 
import AppScreens.DeviceNotification;
import AppScreens.PopUpScreenStartUsingWallet;
import AppScreens.SecretPhraseDeclarationScreen;
import AppScreens.SelectnetworkScreen;
import AppScreens.ViewOnlyWallet; 
import AppScreens.DevicePasscodeScreen;
import io.appium.java_client.android.AndroidDriver;

public class Basetest {

    // AndroidDriver instance for the entire test suite
    public AndroidDriver driver;

    // Instance to interact with screens
    public GetStartedScreen getStartedScreen;
    public WalletCreationAndImportScreen walletcreationandimportScreen;
    public GetStartedScreen getstartedscreen;
    public BackupScreen backupscreen;  
    public DevicePasscodeScreen devicepasscodescreen;
    public DeviceNotification devicenotification;
    public PopUpScreenStartUsingWallet popupscreenstartusingwallet;
    public SecretPhraseDeclarationScreen secretphrasedeclarationScreen;
    public AddExistingWalletScreen addexistingwalletscreen; 
    public SelectnetworkScreen selectnetworkscreen;
    public ViewOnlyWallet viewonlywallet;
    public HomeScreen homescreen;
    public ManageCryptoScreen managecryptoscreen;
    public Wait_Utilities wait_utilities;
    
    @SuppressWarnings("deprecation")
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired capabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();
        
        // Set your desired capabilities here
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "13");
        capabilities.setCapability("udid", "RF8RB06KXJW");
        capabilities.setCapability("deviceName", "Galaxy S20 FE");
        capabilities.setCapability("appPackage", "com.wallet.crypto.trustapp");
        capabilities.setCapability("appActivity", "com.wallet.crypto.trustapp.ui.app.AppActivity");
        capabilities.setCapability("automationName", "UiAutomator2");

        // server URL
        URL url = new URL("http://0.0.0.0:4723/");

        // Initialize the AndroidDriver
        driver = new AndroidDriver(url, capabilities);

        // Initialize the GetStartedScreen object with the driver
        getStartedScreen = new GetStartedScreen(driver);
        walletcreationandimportScreen = new WalletCreationAndImportScreen(driver);
        getstartedscreen = new GetStartedScreen(driver);
        backupscreen = new BackupScreen(driver);
        devicepasscodescreen = new DevicePasscodeScreen(driver);
        popupscreenstartusingwallet = new PopUpScreenStartUsingWallet(driver);
        devicenotification = new DeviceNotification(driver);
        secretphrasedeclarationScreen = new SecretPhraseDeclarationScreen(driver);
        addexistingwalletscreen = new AddExistingWalletScreen(driver);
        selectnetworkscreen = new SelectnetworkScreen(driver);
        viewonlywallet = new ViewOnlyWallet(driver);
        homescreen = new HomeScreen(driver);
        managecryptoscreen = new ManageCryptoScreen(driver);
        wait_utilities = new Wait_Utilities(driver);
    }

    @AfterClass
    public void tearDown() {
        // Quit the driver after the entire test suite
        if (driver != null) {
            driver.quit();
        }
    }
}