package pageObject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * Hello world!
 *
 */
public class FormPage {
	private  AndroidDriver driver;

	
	public FormPage(AndroidDriver driver)
	{
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]")).click();
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"Preference\"]")
	private WebElement preference;
//	"//android.widget.TextView[@content-desc=\"Preference\"]"
	
	
	@FindBy(xpath=".//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")

	private WebElement preferenceDependencies;
//	AppiumBy.accessibilityId("3. Preference dependencies"
	
	@FindBy(id="android:id/checkbox")
	private WebElement checkbox;
//	driver.findElement(By.id("android:id/checkbox"))
	
	@FindBy(xpath="(//android.widget.RelativeLayout)[2]")
	private WebElement wifiSettings;

	@FindBy(id="android:id/edit")
	private WebElement wifiName;
	
	@FindBy(className="android.widget.Button")
	private WebElement button;
	
	
	
	public void clickPreference() {
		
		preference.click();
		
	}
	public void clickpreferenceDependencies() {
		
		preferenceDependencies.click();
	}
	
	public String getPreferenceDependenciesTitle() {
		
		return preferenceDependencies.getText();
	}

	public void clickCheckBox(){
		
		checkbox.click();
	}
	public void clickWifiSettings() {
		
		wifiSettings.click();
	}
	public void setWifiName() {
		
		wifiName.sendKeys("Yai Wifi");
	}
	public void clickButton() {
		
		button.click();
	}
	
}

    
