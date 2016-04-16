import static org.junit.Assert.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.lang.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


public class App2 {

	@Test
	public void test() throws MalformedURLException, InterruptedException {
		File appDir = new File ("src");
		
		File app = new File(appDir, "ApiDemos-debug.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		AndroidDriver driver = new AndroidDriver(new URL ("http://127.0.0.1:4723/wd/hub"),cap);
		Thread.sleep(3000);
		driver.scrollTo("Preference").click();
		List <WebElement> b =driver.findElements(By.id("android:id/text1"));
		System.out.println(b.get(6).getText());
		b.get(7).click();
		
		//driver.scrollTo("Switch").click();
		
		
	}

}