package Appium.Automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class BaseTest {

	public static AndroidDriver driver;
	
	@BeforeClass
	public void LaunchApp() throws MalformedURLException
	{
	

		UiAutomator2Options options=new UiAutomator2Options();
		
				
		options.setDeviceName("yai");
		options.setApp("/Users/yaiheikrujan/eclipse-workspace/Automation/src/test/java/resources/ApiDemos-debug.apk");
				
		
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
	@AfterClass
	public void Stop() {
		driver.quit();
		
	}
	
}