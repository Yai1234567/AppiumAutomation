package Appium.Automation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

import java.net.MalformedURLException;
import org.openqa.selenium.By;

public class AppTest extends BaseTest{
	
	@Test
	
	public void verifyPreferenceScreen() throws MalformedURLException
	{
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]")).click();
		String title=driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).getText();
		Assert.assertEquals(title, "3. Preference dependencies");
		System.out.println("Title is correct");
		
		
		
		
	}
	
	
	@Test

	public void verifyWifiScreen() {

	driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
	driver.findElement(By.id("android:id/checkbox")).click();
	driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
	driver.findElement(By.id("android:id/edit")).sendKeys("Yai wifi");
	String alertTitle=driver.findElement(By.id("android:id/alertTitle")).getText();
	Assert.assertEquals(alertTitle,"WiFi settings");
	System.out.println("AlertTitle is correct");
	driver.findElements(By.className("android.widget.Button")).get(1).click();

	}
}
