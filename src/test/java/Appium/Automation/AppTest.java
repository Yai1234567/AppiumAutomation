package Appium.Automation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import pageObject.FormPage;


public class AppTest extends BaseTest{

	FormPage formPage = null;

	public void initFormPage(AndroidDriver driver) {
		if (formPage == null) {
			formPage = new FormPage(driver);
			}
	}
	
	
	@Test
	public void verifyPreferenceScreen() throws MalformedURLException
	{
		initFormPage(driver);
		formPage.clickPreference();
		String title = formPage.getPreferenceDependenciesTitle();
		Assert.assertEquals(title, "3. Preference dependencies");
		System.out.println("Title is correct");
		
		
		
		
	}
	
	
	@Test
	public void verifyWifiScreen() {
		initFormPage(driver);
		formPage.clickpreferenceDependencies();
		formPage.clickCheckBox();
		formPage.clickWifiSettings();
		formPage.setWifiName();
		String alertTitle=driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTitle,"WiFi settings");
		System.out.println("AlertTitle is correct");
		formPage.clickButton();
	
//	driver.findElements(By.className("android.widget.Button")).get(1).click();

	}
}
