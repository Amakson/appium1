import static org.junit.Assert.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.lang.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;


public class desiredcapab {

	@Test
	public void test() throws MalformedURLException, InterruptedException {
		File appDir = new File ("src");
		
		File app = new File(appDir, "bookMyShow-ucb.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		AndroidDriver driver = new AndroidDriver(new URL ("http://127.0.0.1:4723/wd/hub"),cap);
		Thread.sleep(3000);
		driver.findElementById("com.bt.bms:id/btnLogin").click();//
		driver.findElementById("com.bt.bms:id/btnSignUp").click();
		//driver.findElementById("com.bt.bms:id/edtFirstName").clear();
		driver.findElementById("com.bt.bms:id/edtFirstName").sendKeys("Tony");
		//driver.findElementById("com.bt.bms:id/edtLastName").clear();
		driver.findElementById("com.bt.bms:id/edtLastName").sendKeys("Makson");
		//driver.findElementById("com.bt.bms:id/edtEmailId").clear();
		driver.findElementById("com.bt.bms:id/edtEmailId").sendKeys("anthonymakson@gmail.");
		//driver.findElementById("com.bt.bms:id/edtPassword").clear();
		driver.findElementById("com.bt.bms:id/edtPassword").sendKeys("android1");
		driver.findElementById("com.bt.bms:id/rightMenu").click();
		
		
	}

}